import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 15: Se desea calcular la potencia eléctrica de circuito de la figura 1.6. Realice un diagrama\n" +
                "de flujo y el pseudocódigo que representen el algoritmo para resolver el problema.\n" +
                "Considere que: P = V*I y V = R*I.\n");

        //Se definen las variables
        double difPotencial, intensidadCorriente, potenciaElectrica;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el valor de la intensidad de la corriente: ");
        intensidadCorriente = keyboard.nextDouble();

        //Se calcula la diferencia de potencial
        difPotencial = 4 * intensidadCorriente;

        //Se calcula la potencia electrica
        potenciaElectrica = difPotencial * intensidadCorriente;

        //Se muestra el resultado
        System.out.println("La potencia electrica es de: "+ potenciaElectrica);
    }
}
