import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Ejercicio 13: Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para\n" +
                "determinar cuánto dinero ahorra una persona en un año si considera que cada semana\n" +
                "ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el\n" +
                "sueldo).\n");

        //Se definen las variables
        double totalSueldo, sueldoAhorrado, ahorradoPorMes, ahorradoPorYear;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el monto de su sueldo por semana: ");
        totalSueldo = keyboard.nextDouble();

        //Se calcula lo ahorrado por semana

        sueldoAhorrado = totalSueldo*0.15;

        //Se calcula lo ahorrado por mes
        ahorradoPorMes = sueldoAhorrado * 4;

        //Se calcula lo ahorrado por año
        ahorradoPorYear = ahorradoPorMes * 12;

        System.out.println("El monto ahorrado en un año es de: "+ ahorradoPorYear);
    }
}
