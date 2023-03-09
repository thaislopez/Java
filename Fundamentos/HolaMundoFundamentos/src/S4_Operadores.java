
/**
 * @author dayanna.rodriguez
 * Correr el metodo main de cada clase para ver su funcion
 */
public class S4_Operadores {

    public static void main(String arhs[]) {

        //operadoresAritmeticos();
        //operadoresAsignacion();
        operadoresUnarios();
    }

    public static void operadoresAritmeticos() {

        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("El resultado suma es = " + resultado);

        resultado = a - b;
        System.out.println("El resultado resta es = " + resultado);

        resultado = a * b;
        System.out.println("El resultado multiplicacion es = " + resultado);

        resultado = a / b; //Resultado 1 porque es de tipo entero
        System.out.println("El resultado division es = " + resultado);

        var resultado2 = 3.0 / b; //Ya incluye el punto flotante
        System.out.println("El resultado2 division es = " + resultado2);

        resultado = a % b; //Operador de modulo (residuo)
        System.out.println("El resultado2 operador de modulo es = " + resultado);

        if (a % 2 == 0) 
        //Si a operador modulo es divisible entre dos, entonces nos regresa 0
        //Si no es divisible entre 2, regresa 1 siendo este impar
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");

        if (b % 2 == 0) 
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");

    }

    public static void operadoresAsignacion() {
        
        // == Si son iguales
        // = De asignacion
        //De izquierda a derecha
        int a = 3, b = 2;
        int c = a + 5 - b;
        
        System.out.println("c = " + c);
        
        //Incrementar en 1
        a += 1; // a = a + 1
        System.out.println("a = " + a);
        
        a += 3; // a = a + 3
        System.out.println("a = " + a);
        
        a -= 2; // a = a - 2
        System.out.println("a = " + a);
        
        a *= 5; // a = a * 5
        System.out.println("a = " + a);
        
        a /= 5; // a = a / 5
        System.out.println("a = " + a);
        
        a %= 1; // a = a % 1
        System.out.println("a = " + a);
    }
    
    public static void operadoresUnarios() {
        
        //Operador unario de cambio de signo
        int a = 3; 
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //Operador de negacion, solo aplica para booleanos
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Incremento
        //1.Preincremento (simbolo antes de la varibales
        var e = 3;
        var f = ++e; //Primero se incrementa la variable y despues se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //2.Postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; //Primero se utiliza el valor de la variable y luego incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //Decremento
        //1.Predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //2.Postdecremento
        var k = 4;
        var m = k--; //Primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k); //Tenia pendiente un decremento
        System.out.println("m = " + m); //Primero usa variable k
    }
}
