import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        System.out.println("Programa calcular el area de un rectangulo");

        //Defino las variables
        double baseRectangulo;
        double alturaRectangulo;
        double area;

        //Habilito el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Leo los datos del usuario
        System.out.print("Ingrese la altura del rectangulo: ");
        alturaRectangulo = keyboard.nextInt();

        System.out.print("Ingrese la base del rectangulo: ");
        baseRectangulo = keyboard.nextInt();

        //Realizo el proceso y lo guardo en la variable
        area = (alturaRectangulo * baseRectangulo);

        //Muestro el resultado
        System.out.println("El area del rectangulo es: " + area);
    }
}