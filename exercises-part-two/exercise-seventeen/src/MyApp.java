import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 17: . Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para\n" +
                "determinar el promedio que obtendrá un alumno considerando que realiza tres\n" +
                "exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%,\n" +
                "mientras que el tercero de 50%\n");

        //Defino las variables
        double calificacion1, calificacion2, calificacion3, ponderacion1, ponderacion2, ponderacion3, promedio;

        //Habilito el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido los datos del usuario
        System.out.print("Ingrese el primer numero: ");
        calificacion1 = keyboard.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        calificacion2 = keyboard.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        calificacion3 = keyboard.nextDouble();

        //Calculo la ponderacion
        ponderacion1 = calificacion1 * 0.25;

        ponderacion2 = calificacion2 *0.25;

        ponderacion3 = calificacion3 *0.50;

        //Calculo el promedio

        promedio = (ponderacion1+ponderacion2+ponderacion3) /3;

        //Muestro el resultado
        System.out.println("El promedio final es de: "+promedio);
    }
}
