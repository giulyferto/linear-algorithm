import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 8: Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra\n" +
                "en bicicleta, considerando que lleva una velocidad constante. Realice un diagrama de\n" +
                "flujo y pseudocódigo que representen el algoritmo para tal fin");

        //Se definen las variables
        double velocidad, distancia, tiempo;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la velocidad: ");
        velocidad = keyboard.nextDouble();

        System.out.print("Ingrese la distancia: ");
        distancia = keyboard.nextDouble();

        //Se calcula el tiempo
        tiempo = distancia / velocidad;

        //Se muestra el tiempo

        System.out.println("El tiempo que tarda en llegar de una ciudad a otra es de: "+ tiempo);
    }
}
