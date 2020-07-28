import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.print("Ejercicio 19: El hotel “Cama Arena” requiere determinar lo que le debe cobrar a un huésped por su\n" +
                "estancia en una de sus habitaciones. Realice un diagrama de flujo y pseudocódigo que\n" +
                "representen el algoritmo para determinar ese cobro.\n");

        //Se definen las variables
        int amountDays;
        double roomPrice,finalPrice;

        //se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la cantidad de dias que el huesped se hospedo: ");
        amountDays = keyboard.nextInt();

        System.out.print("Ingrese el monto del cuarto por noche: ");
        roomPrice = keyboard.nextDouble();

        //Se calcula el precio de la estadia
        finalPrice= roomPrice * amountDays;

        //Se muestrsa el resultado
        System.out.println("El precio final por la estadia sera de: $"+finalPrice);
    }
}
