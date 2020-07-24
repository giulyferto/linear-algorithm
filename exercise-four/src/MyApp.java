import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        System.out.println("Programa que calcula el area de una circunferencia");

        //defino las variables
        int radio;
        final double PI = 3.141592;
        double area;

        //habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        //leo los datos del usuario
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = keyboard.nextInt();

        //realizo el proceso y lo guardo en la variable result
        area = (PI * (radio*radio));

        //Muestro el resultado
        System.out.println("El area de la circunferencia es: " + area);
}
}
