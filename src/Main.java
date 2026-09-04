import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese carrer: ");
        String carrera = scanner.nextLine();

        System.out.println("Ingrese Edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante1 = new Estudiante(nombre, carrera, edad);
        estudiante1.mostrarInformacion();
    }


}


