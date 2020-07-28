import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 9: Se requiere determinar el costo que tendrá realizar una llamada telefónica con base en\n" +
                "el tiempo que dura la llamada y en el costo por minuto. Realice un diagrama de flujo y\n" +
                "pseudocódigo que representen el algoritmo para tal fin");

        //Definir las variables
        double tiempoLlamada, costoMinuto, costoLlamada;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el tiempo de la llamada: ");
        tiempoLlamada = keyboard.nextDouble();

        System.out.print("ingrese el costo por minuto: ");
        costoMinuto = keyboard.nextDouble();

        //Se calcula el costo del boleto
        costoLlamada = costoMinuto * tiempoLlamada;

        System.out.println("El costo de la llamada es de: "+ costoLlamada);
    }
}
