
import javax.swing.JOptionPane;

/**
 * @author dayanna.rodriguez Correr el metodo main de cada clase para ver su
 * funcion
 */
public class S4_Operadores {

    public static void main(String arhs[]) {

        //operadoresAritmeticos();
        //operadoresAsignacion();
        //operadoresUnarios();
        //operadoresIgualdad();
        //operadoresRelacionales();
        //operadoresCondicionales();
        //operadorTernario();
        //precedenciaOperadores();
        //tareaRectangulo();
        tareaElMayor();

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

        if (a % 2 == 0) //Si a operador modulo es divisible entre dos, entonces nos regresa 0
        //Si no es divisible entre 2, regresa 1 siendo este impar
        {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        if (b % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

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

    public static void operadoresIgualdad() {

        var a = 3;
        var b = 2;

        //== Si dos elementos son iguales
        var c = (a == b); //Regresa un boolean
        System.out.println("c = " + c);

        var d = a != b; //Si a es diferente de b, boolean
        System.out.println("d = " + d);

        //Detalle basico de uso de cadenas
        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2; //Compara referencia de objetos
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2);//Si es igual pero en contenido (de cadenas)
        System.out.println("f = " + f);

    }

    public static void operadoresRelacionales() {
        //Si es igual, mayor o menor

        var a = 3;
        var b = 2;

        var g = a >= b; //3 es mayor o igual que dos?
        System.out.println("g = " + g);

        if (a % 2 == 0) //Si el residuo de dividir a entre 2 es igual a 0 entonces quiere decir que es par
        {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad ");
        } else {
            System.out.println("Es menor de edad");
        }

        ////////////////Ejemplo mio
        int j;
        j = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero entero"));

        if (j % 2 == 0) //Si el residuo de dividir a entre 2 es igual a 0 entonces quiere decir que es par
        {
            JOptionPane.showMessageDialog(null, "Es numero par");
        } else {
            JOptionPane.showMessageDialog(null, "Es numero impar");
        }
    }

    public static void operadoresCondicionales() {

        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;

        //Si el valor de nuestra variable esta dentro de esos rangos 0 y 10
        //Si uno de los valores es falso entonces el resultado sera falso
        var resultado = a >= 0 && a <= 10; //&& AND
        if (resultado) {
            System.out.println("Dentro del rango esperado");
        } else {
            System.out.println("Fuera de rango esperado");
        }

        //Si uno de los valores es verdadero, entonces el resultado sera verdadero
        var vacaciones = false;
        var diaDescanso = true;

        if (vacaciones || diaDescanso) { //|| OR
            System.out.println("El padre puede asistir al juego de su hijo");
        } else {
            System.out.println("El padre no puede asistir, esta ocupado");
        }

    }

    public static void operadorTernario() {
        //Tiene 3 partes, se recomienda solo con operaciones sencillas

        //Una expresion y el resultado
        var resultado = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);

        var numero = 9;

        resultado = (numero % 2 == 0) ? "El numero es par" : "El numero es impar";
        System.out.println("resultado = " + resultado);
    }

    public static void precedenciaOperadores() {
        //Orden en que se van los operadores en una expresion en java

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        //Cual es el resultado de la variable z?
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        //++x -> Primero agarra el 5 y lo incrementa, luego yo tomo x ya incrementado para la operacion
        //y-- Primero tomo el valor de y así como esta para la operacion, y luego aparte le resto 1

        var resultado = 4 + 5 * 6 / 3; //El orden se ve asi: 4 + ((5*6)/3)
        System.out.println("resultado = " + resultado); //14

        resultado = (4 + 5) * 6 / 3; //El orden es diferente porque () tienen prioridad
        System.out.println("resultado = " + resultado); //18
    }

    public static void tareaRectangulo() {
        //En el siguiente ejercicio se solicita calcular el área 
        //y perímetro de un Rectángulo

        int alto, ancho;

        alto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el alto del rectagulo \n "
                + "(Solo numeros enteros)"));
        ancho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ancho del rectagulo \n"
                + "(Solo numeros enteros)"));

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + area
                + "\nEl perimetro del rectangulo es: " + perimetro);

        //Otra solucion
//        Scanner scanner = new Scanner(System.in);
//        // Escribe tu solucion aqui
//        System.out.println("Proporciona el alto:");
//        int alto = Integer.parseInt(scanner.nextLine());
//        System.out.println("Proporciona el ancho:");
//        int ancho = Integer.parseInt(scanner.nextLine());
//        int area = alto * ancho;
//        int perimetro = (alto + ancho) * 2;
//        System.out.println("Area: " + area);
//        System.out.println("Perimetro: " + perimetro);
    }

    public static void tareaElMayor() {
        //Solicitar al usuario dos valores, y determinar cual número es el mayor

        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero \n "
                + "(Solo numeros enteros)"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero \n"
                + "(Solo numeros enteros)"));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + numero1);
        } else {
            JOptionPane.showMessageDialog(null, "En numero mayor es: " + numero2);
        }
        
        //Otra solucion
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Proporciona el numero1:");
//        int numero1 = Integer.parseInt(scanner.nextLine());
//        System.out.println("Proporciona el numero2:");
//        int numero2 = Integer.parseInt(scanner.nextLine());
//        System.out.println("El numero mayor es:");
//        System.out.println(numero1 > numero2 ? numero1 : numero2);
    }
}
