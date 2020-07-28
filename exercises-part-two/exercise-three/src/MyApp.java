import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3: Una empresa que contrata personal requiere determinar la edad de las personas que\n" +
                "solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año en\n" +
                "que nacieron. Realice el diagrama de flujo y pseudocódigo que representen el algoritmo\n" +
                "para solucionar este problema.\n");

        //Se definen las variables
        int yearOfBirth, age;
        final int ACTUAL_YEAR = 2020;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario

        System.out.print("Ingrese el año de su nacimiento: ");
        yearOfBirth = keyboard.nextInt();

        //Se realiza el calculo
        age = ACTUAL_YEAR - yearOfBirth;

        //Se muestra el resultado
        System.out.println("La edad de la persona es de "+ age + " años");

    }
}
