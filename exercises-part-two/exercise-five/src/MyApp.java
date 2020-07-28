import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5: Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura.\n" +
                "Considere que se cobra por m2 y realice un diagrama de flujo y pseudocódigo que\n" +
                "representen el algoritmo que le permita ir generando presupuestos para cada cliente.\n");

        //Defino las variables
        double costoMetro, metroCuadrado, costoPintura;

        //Habilito el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido los datos del usuario
        System.out.print("Ingrese el costo por metro cuadrado: ");
        costoMetro = keyboard.nextDouble();

        System.out.print("Ingrese la cantidad de metros cuadrados a pintar: ");
        metroCuadrado = keyboard.nextDouble();

        //Calculo el costo de la pintura
        costoPintura = costoMetro * metroCuadrado;

        //Muestro el resultado

        System.out.println("El costo de la pintura es de: "+ costoPintura);
    }
}
