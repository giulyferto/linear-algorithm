import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Programa para determinar el pago que debe realizar una persona por metros cubicos que consume de agua en una alberca");

        //Defino las variables
        double altura, largo, ancho, costoMetroCubico, volumenAlberca, pagoConsumo;

        //Habilito el ingreso de datos por teclado
        Scanner keyboard = new Scanner(System.in);

        //Leo los datos del usuario
        System.out.print("Ingrese la altura de la alberca: ");
        altura = keyboard.nextDouble();

        System.out.print("Ingrese el largo de la alberca: ");
        largo = keyboard.nextDouble();

        System.out.print("Ingrese el ancho de la alberca: ");
        ancho = keyboard.nextDouble();

        System.out.print("Ingrese el costo por metro cubico: ");
        costoMetroCubico = keyboard.nextDouble();

        //Calculo el volumen de la alberca
        volumenAlberca = altura * largo * ancho;

        //Calculo el pago a realizar
        pagoConsumo = volumenAlberca * costoMetroCubico;

        //Muestro el resultado
        System.out.println("El pago a realizar por el consumo de agua es de: " + pagoConsumo);
    }
}
