import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 14: 4. Una empresa desea determinar el monto de un cheque que debe proporcionar a uno de\n" +
                "sus empleados que tendrá que ir por equis número de días a la ciudad de Monterrey; los\n" +
                "gastos que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros\n" +
                "gastos. El monto debe estar desglosado para cada concepto. Realice un diagrama de\n" +
                "flujo y pseudocódigo que representen el algoritmo que determine el monto del cheque");

        //Defino las variables
        int cantidadDeDias;
        double precioHotel, precioComida, montoCheque;

        //Habilito el uso del teclado

        Scanner keyboard = new Scanner(System.in);

        //Pido datos del usuario
        System.out.print("Ingrese la cantidad de dias que viaja: ");
        cantidadDeDias = keyboard.nextInt();

        System.out.print("Ingrese el monto a pagar del hotel por noche: ");
        precioHotel = keyboard.nextDouble();

        System.out.print("Ingrese el monto a pagar por comida por dia: ");
        precioComida = keyboard.nextDouble();

        //Calculo el monto del cheque
        montoCheque = (cantidadDeDias * (precioComida + precioHotel) )+ (cantidadDeDias * 100);

        //Muestro el monto del cheque
        System.out.println("El monto del cheque va a ser de: "+montoCheque);
    }
}
