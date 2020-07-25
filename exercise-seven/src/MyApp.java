import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Programa que ayuda a saber cuanto recibira un productor de leche por dia:");

        //Defino las variables

        int cantidadLitro, precioGalon;
        double cantidadGalones, gananciaLeche;
        final double GALON_EN_LITROS = 3.785;

        //Habilito el ingreso de datos por teclado
        Scanner keyboard = new Scanner(System.in);

        //Leo los datos del usuario
        System.out.print("Ingrese la cantidad de litros que produce en un dia: ");
        cantidadLitro = keyboard.nextInt();

        System.out.print("Ingrese el precio que le pagan por galon: ");
        precioGalon = keyboard.nextInt();

        //Calculo la cantidad de galones que produce
        cantidadGalones = (cantidadLitro / GALON_EN_LITROS);

        //Calculo la ganancia por la entrega de la leche
        gananciaLeche = (precioGalon * cantidadGalones);

        //Muestro la ganancia por la leche
        System.out.println("La ganancia por la leche es de: " + gananciaLeche);
    }
}