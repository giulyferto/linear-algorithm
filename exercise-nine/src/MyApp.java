import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Programa que determina el sueldo semanal de un trabajador");

        //Defino las variables
        double horasTrabajadas, pagoPorHora, sueldoSemanal;

        //Habilito el ingreso de datos por teclado
        Scanner keyboard = new Scanner(System.in);

        //Leo los datos del usuario
        System.out.print("Ingrese la cantidad de horas trabajadas en la semana: ");
        horasTrabajadas = keyboard.nextDouble();

        System.out.print("Ingrese el monto de pago por hora: ");
        pagoPorHora = keyboard.nextDouble();

        //Calculo el sueldo semanal
        sueldoSemanal = horasTrabajadas * pagoPorHora;

        System.out.println("El sueldo semanal del trabajador es de: " + sueldoSemanal);
    }
}
