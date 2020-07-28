import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7: La compañía de autobuses “La curva loca” requiere determinar el costo que tendrá el\n" +
                "boleto de un viaje sencillo, esto basado en los kilómetros por recorrer y en el costo por\n" +
                "kilómetro. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo\n" +
                "para tal fin");
        //Definir las variables
        double cantidadKM, costoKM, costoBoleto;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la cantidad de km a recorrer: ");
        cantidadKM = keyboard.nextDouble();

        System.out.print("ingrese el costo por km: ");
        costoKM = keyboard.nextDouble();

        //Se calcula el costo del boleto
        costoBoleto = costoKM * cantidadKM;

        System.out.println("El costo del boleto es de: "+ costoBoleto);
    }
}
