import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        System.out.println("Programa que calcula el promedio de cuatro notas");

        //Defino las variables
        double primeraCalificacion, segundaCalificacion,terceraCalificacion,cuartaCalificacion, sumaDeCalificaciones, promedio ;

        //Habilido el ingreso de datos por el taclado
        Scanner keyboard = new Scanner(System.in);

        //Leo los datos del usuario
        System.out.print("Ingrese la primera calificacion: ");
        primeraCalificacion = keyboard.nextDouble();

        System.out.print("Ingrese la segunda calificacion: ");
        segundaCalificacion = keyboard.nextDouble();

        System.out.print("Ingrese la tercera calificacion: ");
        terceraCalificacion = keyboard.nextDouble();

        System.out.print("Ingrese la cuarta calificacion: ");
        cuartaCalificacion = keyboard.nextDouble();

        //Realizo el proceso de la suma de las calificaciones
        sumaDeCalificaciones = primeraCalificacion + segundaCalificacion + terceraCalificacion + cuartaCalificacion;

        //Calculo el promedio
        promedio = sumaDeCalificaciones / 4;

        //muestro el resultado
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}
