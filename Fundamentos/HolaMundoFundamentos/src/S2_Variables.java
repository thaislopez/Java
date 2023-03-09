import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author dayanna.rodriguez
 * Correr el metodo main de cada clase para ver su funcion
 */
public class S2_Variables {

    //Atajos: sout o soutv + tab
    public static void main(String arhs[]) {

        //variables();
        //concatenacion();
        //scanner ();
        tarea();

    }

    public static void variables() {

        //Tipos primivos:
        //- Tipos enteros y tipos flotantes 
        int variableEntera = 10;
        System.out.println(variableEntera);
        JOptionPane.showMessageDialog(null, variableEntera);

        //No hay necesidad de especificar el tipo de datos int
        variableEntera = 5; //Se modifico valor de la variable
        System.out.println(variableEntera);
        JOptionPane.showMessageDialog(null, variableEntera);

        //Variable tipo String: no es primitivo si no una clase de Java
        String variableString = "Saludos"; //Siempre dentro de comillascuando es variable String
        System.out.println(variableString);
        JOptionPane.showMessageDialog(null, variableString);

        variableString = "Adios!"; //Siempre dentro de comillas
        System.out.println(variableString);
        JOptionPane.showMessageDialog(null, variableString);

        //var: Inferencia de tipos en Java,apartir del valor de la literal (15 o buenas tardes)
        var variableEntera2 = 15;
        var variableString2 = "Buenas tardes";
        System.out.println("variableEntera2 = " + variableEntera2);
        System.out.println("variableString2 = " + variableString2); //Concatenar
        var variableCadena2 = "Tarea prueba";
        System.out.println("variableCadena2 = " + variableCadena2);

        //Reglas nombre de varibles
        //-Numeros de primero o caracteres especiales de primero
        //-Si se puede utilizar simbolo de $ o _ al inicio
        //No se recomienda usar acentos 
        //Iniciar variable con minuscula
        var miVarible = 1;
        var _miVariables = 2;
        var $miVariable = 3;

        //Esto es lo que se recomienda
    }

    public static void concatenacion() {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var conca = usuario + " " + titulo;
        System.out.println("conca = " + conca);

        var i = 3;
        var j = 4;
        System.out.println(i + j);//Suma
        System.out.println(i + j + " " + usuario);
        System.out.println(usuario + " " + i + j); //Si primero encuentra cadena, lo demas es cadena
        System.out.println(usuario + " " + (i + j));//Si se usa parentesis primero se realiza eso

        //Caracteres especiales
        //Nueva linea
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);

        //Tabulador
        System.out.println("Tabulador: \t" + nombre);

        //Retroceso
        System.out.println("Retroceso: \b" + nombre);

        //Comilla simple y doble
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }

    public static void scanner() {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in); //Variable consola se puede usar varias veces
        var usuario = consola.nextLine(); //nextLine lee lo que se ingreso en la 
        //consola y se lo asigna a la variable usuario
        System.out.println("usuario: " + usuario);

        System.out.println("Escribe tu titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }

    public static void tarea() {
        /*Se solicita incluir la siguiente información acerca de un libro:
        titulo y autor
        Debes imprimir la información en el siguiente formato:

        Proporciona el titulo:
        Proporciona el autor:
        <titulo> fue escrito por <autor>*/

        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe el titulo de un libro");
        var titulo = consola.nextLine();
        System.out.println("Escribe el autor de ese libro");
        var autor = consola.nextLine();
        System.out.println("el libro " + titulo + " fue escrito por el autor " + autor);
    }
}
