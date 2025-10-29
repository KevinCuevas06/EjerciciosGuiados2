/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author Taylor
 */


import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cola<String> cola = new Cola<>();
    int opcion;

    do {
        System.out.println("\n--- MENÚ DE COLA ---");
        System.out.println("1. Agregar paciente");
        System.out.println("2. Ver tamaño");
        System.out.println("3. Ver frente");
        System.out.println("4. Quitar paciente");
        System.out.println("5. Mostrar cola");
        System.out.println("6. Salir");
        System.out.print("Opción: ");
        opcion = sc.nextInt();
        sc.nextLine(); 

        switch (opcion) {
            case 1:
                System.out.print("Escribe la paciente: ");
                String tarea = sc.nextLine();
                cola.encolar(tarea);
                System.out.println("Paciente agregado.");
                break;

            case 2:
                System.out.println("Tamano actual: " + cola.getTamano());
                break;

            case 3:
                System.out.println("Frente: " + cola.verfrente());
                break;

            case 4:
                String quitada = cola.desencolar();
                if (quitada != null) {
                    System.out.println("Se quitó el paciente: " + quitada);
                }
                break;

            case 5:
                cola.mostrarCola();
                break;

            case 6:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción no válida.");
        }

    } while (opcion != 6);

    sc.close();
}

}