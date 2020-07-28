import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4: Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo\n" +
                "utilizan. Considere que el cobro es con base en las horas que lo disponen y que las\n" +
                "fracciones de hora se toman como completas y realice un diagrama de flujo y\n" +
                "pseudocódigo que representen el algoritmo que permita determinar el cobro.\n");

        //Defino las variables
        double costHour;
        int amountHour;
        double total;

        //habilito el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido los datos del usuario
        System.out.print("Ingrese el costo por hora: ");
        costHour = keyboard.nextDouble();

        System.out.print("Ingrese la cantidad de horas estacionado: ");
        amountHour = keyboard.nextInt();

        //realizo el calculo del total a pagar
        total = costHour * amountHour;

        //Muestro el resultado
        System.out.println("Debe pagar un monto de: "+ total + " pesos");
    }
}
