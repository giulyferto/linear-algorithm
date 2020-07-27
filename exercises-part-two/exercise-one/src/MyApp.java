import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio uno: Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para obtener\n" +
                "el área de un triángulo.\n");

        //Defino las variables
        double baseTriangulo, alturaTriangulo, area;

        //Habilito el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //leo los datos del usuario
        System.out.print("Ingrese la base del triangulo: ");
        baseTriangulo = keyboard.nextDouble();

        System.out.print("Ingrese la aultura del triangulo: ");
        alturaTriangulo = keyboard.nextDouble();

        //Calculo el area del triangulo
        area = (baseTriangulo * alturaTriangulo) /2;

        //Muestro el resutado
        System.out.println("El area del triangulo es de: "+ area);
    }
}
