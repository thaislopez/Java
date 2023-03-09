import java.util.Scanner;

/**
 * @author dayanna.rodriguez
 * Correr el metodo main de cada clase para ver su funcion
 */
public class S3_TiposPrimitivos {
    
    public static void main (String arhs[]) {
        
        //tiposPrimitivosEnteros();
        //tiposPrimitivosFlotantes();
        //tipoVar();
        //tipoChar();
        //tipoBoolean();
        //conversiones();
        tareaTiendaLibros();
    }  
    
    public static void tiposPrimitivosEnteros () {
        
        /*
        Tipos primitivos enteros: byte, short, int, long
        */
        
        //OJO: diferencia en byte y Byte! 
        //byte: tipo primitivo entero
        //Byte: es una clase -> donde se puede acceder a sus atributos de min y max
        
        byte numeroByte = 10;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor minimo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = 10;
        short numeroShort1 = (short)40000; //Riesgo de perdida de precision
        //Y riesgo de perdida de bits al hacer la convercion 
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE);
        
        //La variable int toma 32 bits
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo int: " + Integer.MAX_VALUE);
        
        long numeroLong = 10;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo long: " + Long.MAX_VALUE);   
    }
    
    public static void tiposPrimitivosFlotantes () {
        
        /*
        Con punto decimal: float y double
        */
        
        /*Convertir a float (porque por default en java las
        literales flotantes son de tipo double*/ //32 bits
        float numeroFloat1 = 10.0F;
        float numeroFloat2 = (float)10.0;
        System.out.println("numeroFloat2 = " + numeroFloat2);
        System.out.println("valor minimo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 10;
        System.out.println("valor minimo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo double: " + Double.MAX_VALUE);   
    }
    
    public static void tipoVar () {
        
        //Al poner un punto de interrupcion se puede ver que tipo de variable es
        var numeroEntero = 10; 
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);   
        
        // -> rallita + u significa que asignaremos un valor con el codigo unicode
        var varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        var varCharDecimal = 33; //el valor lo convierte a char aunque parezca que es int
        System.out.println("varCharDecimal = " + varCharDecimal);
        //Ejecutar codigo por si se olvida esto y entenderlo
        
        var varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //Recordar que var infiere, menos la 33, supondra que es entera y no char
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        //No va a mostrar el caracter si no el decimal como valor de ese unicode
        
    }
    
    public static void tipoChar () {
        
        //Un caracter y dentro de comillas simples (Lista de unicode wiki)
        
        char miCaracter = '$'; 
        System.out.println("miCaracter = " + miCaracter);
        
        // -> rallita + u significa que asignaremos un valor con el codigo unicode
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33; //el valor lo convierte a char aunque parezca que es int
        System.out.println("varCharDecimal = " + varCharDecimal);
        //Ejecutar codigo por si se olvida esto y entenderlo
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
    }
    
    public static void tipoBoolean () {
        
        //Almacena los valores de true o false
        
        boolean varBoolean1 = true;
        System.out.println("varBoolean = " + varBoolean1);
        boolean varBoolean2 = false;
        System.out.println("varBoolean = " + varBoolean2);
        
        if (varBoolean1 == true) {
            System.out.println("La bandera es verdadera");
        }
        else{
            System.out.println("La bandera es falsa");
        }
        
        //Recordar que var infiere que el tipo de variable
        var edad = 30;
        //var edadPersona = edad >= 18; esta linea se puede omitir
        //if(edadPersona){ esta linea tambien se puede omitir
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
    
    public static void conversiones () {
        
        //Convertir de String a int
        
        //Metodo parseInt y se encuentra definido dentro de la clase Integer
        //Este metodo recibe valor de cadena (string) y lo pasa a entero
        var edad = Integer.parseInt("20");
        //ver edad = "20"; cambia el resultado
        System.out.println("edad = " + (edad + 1)); //Recordar parentesis
        
        //Convertir de String a Double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
//        Pedir un valor 
//        new Scanner -> se crea un nuevo objeto de nuestra clase scanner
        var entrada = new Scanner(System.in); //System: clase, in: trabajar con consola
//        System.out.println("Proporciona tu edad por favor: ");
//        edad = Integer.parseInt(entrada.nextLine()); 
//        System.out.println("edad = " + edad);
        
        //Convertir de Int a String
        var edadTexto = String.valueOf(10); 
        System.out.println("edadTexto = " + edadTexto);
        //De int pasa a String
        
        //Convertir de String a Char -- Un caracter
        var caracter = "Hola".charAt(1); //H = 0, O = 1, L = 2, A = 3
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter: ");
        caracter = entrada.nextLine().charAt(4);
        System.out.println("caracter = " + caracter);
    }
    
    public static void tareaTiendaLibros () {
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe el nombre del libro: "); 
        String nombre = consola.nextLine();
        
        System.out.println("Ingresa el numero id del libro: ");
        int numeroId = Integer.parseInt(consola.nextLine());
        
        System.out.println("Ingresa el precio del libro: ");
        double precio = Double.parseDouble(consola.nextLine());
        
        System.out.println("El envio es gratuito? (solo responda true/false): ");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println("Libro: " + nombre + "  Numero ID: #" + numeroId);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envioGratuito);
        
        //Este perfecto, se comparo con el del profe y no tiene errores!
        
    }
}
