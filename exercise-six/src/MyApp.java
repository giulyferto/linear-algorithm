import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        System.out.println("Programa que calcula el area de la figura del ejercicio seis");

        //Defino las variables

        double radio;
        double hipotenusa;
        double catetoFaltante;
        double areaTriangulo;
        double areaCirculo;
        final double PI = 3.141592;
        double area;


        //habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        //leo los datos del usuario
        System.out.print("Ingrese el radio de la figura: ");
        radio = keyboard.nextInt();

        System.out.print("Ingrese la hipotenusa de la figura: ");
        hipotenusa = keyboard.nextInt();

        //Calculo el cateto que falta

        catetoFaltante = Math.sqrt((hipotenusa*hipotenusa)-(radio*radio));

        //Calculo el area
        areaTriangulo = (2 * (radio * catetoFaltante)) / 2;

        areaCirculo = (PI * radio * radio) / 2;

        area = areaTriangulo + areaCirculo;

        //Muestro el Area
        System.out.println("El area de a figura es: " + area);

    }
}
