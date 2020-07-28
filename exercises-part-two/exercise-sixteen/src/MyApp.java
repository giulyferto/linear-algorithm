import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 16: Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para encontrar\n" +
                "el área de un cuadrado\n");

        //Defino las variables
        double sideA,area;

        //Habilito el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido los datos del usuario
        System.out.print("Ingrese la medida de uno de los lados del triangulo: ");
        sideA = keyboard.nextDouble();

        //Realizo el calculo para encontrar el area
        area = Math.pow(sideA,2);

        //Muestro el resultado
        System.out.println("El area del cuadrado es de: "+ area);
    }

}
