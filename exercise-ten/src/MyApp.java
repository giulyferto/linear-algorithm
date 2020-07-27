import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Programa que pasa medidas de centimetros a pulgadas");

        //Defino las variables
        double centimetros, pulgadas;

        //Habilito el ingreso de datos por teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de centimetros: ");
        centimetros = keyboard.nextDouble();

        //Realizo la conversion de cm a pulgadas
        pulgadas = centimetros / 2.54;

        //Muestro las pulgadas
        System.out.println("El resultado es de " + pulgadas + " pulgadas");
    }
}
