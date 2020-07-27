import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Programa que calcula la distancia entre dos puntos en el plano cartesiano");

        //defino las variables
        double abscisaXUno, abscisaXDos, ordenadaYUno, ordenadaYDos;
        double catetoAbscisas, catetoOrdenadas;
        double distanciaEntrePuntos;

        //Habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        //Leo los datos del usuario
        System.out.print("Ingrese el valor de X1: ");
        abscisaXUno = keyboard.nextDouble();

        System.out.print("Ingrese el valor de X2: ");
        abscisaXDos = keyboard.nextDouble();

        System.out.print("Ingrese el valor de Y1: ");
        ordenadaYUno = keyboard.nextDouble();

        System.out.print("Ingrese el valor de Y2: ");
        ordenadaYDos = keyboard.nextDouble();

        //Realizo el proceso para saber el valor del cateto de las abscisas
        catetoAbscisas = abscisaXDos - abscisaXUno;

        //Realizo el proceso para saber el cateto de las ordenadas
        catetoOrdenadas = ordenadaYDos - ordenadaYUno;

        //Calculo la distancia entre puntos

        distanciaEntrePuntos = Math.sqrt((Math.pow(catetoAbscisas, 2)) + (Math.pow(catetoOrdenadas, 2)));

        //Muestro el resultado
        System.out.println("El resultado de la distancia es de: " + distanciaEntrePuntos);

    }
}
