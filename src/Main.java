import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        System.out.print(10);
        System.out.println(20);
        System.out.println(30);
        System.out.println("chao mundo");
        System.out.println(2024);
        int añoActual = 2024;
        LocalDate fechaActual = LocalDate.now();
        System.out.printf("estamos en el año: %s %n", fechaActual);
        System.out.println("estamos en la fecha: " + fechaActual);

        int numero1, numero2, resultado;
        Scanner sc = new Scanner(System.in);
        numero1=sc.nextInt();
        numero2=sc.nextInt();
//        //Asigno el valor de la suma a la variable resultado
        resultado=numero1+numero2;
        System.out.println("El resultado es: "+resultado);
    }
}