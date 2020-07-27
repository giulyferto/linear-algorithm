import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio dos: Una empresa importadora desea determinar cuántos dólares puede adquirir con equis\n" +
                "cantidad de dinero mexicano. Realice un diagrama de flujo y pseudocódigo que\n" +
                "representen el algoritmo para tal fin.\n");

        //Defino las variables
        double pesosMexicanos;
        final double  COSTO_DOLAR = 0.045;
        double costoFinal;


        //Habilito el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Leo los datos del usuario
        System.out.print("Ingrese la cantidad de pesos mexicanos: ");
        pesosMexicanos = keyboard.nextDouble();

        //Realizo el proceso de conversion
        costoFinal = pesosMexicanos * COSTO_DOLAR;

        //Muestro el resultado
        System.out.println(costoFinal + "Es la cantidad de dolares que puede comprar.");
    }
}
