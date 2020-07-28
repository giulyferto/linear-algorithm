import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 10: La CONAGUA requiere determinar el pago que debe realizar una persona por el total de\n" +
                "metros cúbicos que consume de agua. Realice un diagrama de flujo y pseudocódigo que\n" +
                "representen el algoritmo que permita determinar ese pago.");

        //Definir las variables
        double precioMetro, consumoMetro, pago;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la cantidad de metros cubicos consumidos: ");
        consumoMetro = keyboard.nextDouble();

        System.out.print("ingrese el costo por metro cubico: ");
        precioMetro = keyboard.nextDouble();

        //Se calcula el costo del boleto
        pago = precioMetro * consumoMetro;

        System.out.println("El costo a pagar es de: "+ pago);
    }
}
