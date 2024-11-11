/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.jhoniercotaya2026;

/**
 *
 * @author SO-LAB-PC5
 */
// Definir Variables y Estructura de datos
import java.util.Scanner;

public class JhonierCotaya2026 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas;
        notas = new int[5];

        int promedio;
        int notAlta;
        int notBaja;
        int aprobados;
        int reprobados;

        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese la nota de los estudiantes");
            notas[i] = scanner.nextInt();
            
        }
        int opcion=0;
        System.out.println("Seleccione una opcion:");
        
        System.out.println("1.Calcular el promedio de notas");
        System.out.println("2.Mostrar nota mas alta");
        System.out.println("3.Mostrar nota mas baja");
        System.out.println("4.Aprobados");
        System.out.println("5.Reprobados");
        System.out.println("6.salir");
        
        int menu=scanner.nextInt();
        switch (menu){
            case 1:
                int suma=0;
                for (int i = 0; i < 5; i++) {
                    suma=notas[i]+suma;
                }
                promedio=suma/5;
                System.out.println("El promedio es:"+promedio);
                
                System.out.println("Calcular el promedio de notas");
                break;
            case 2:
                System.out.println("Mostrar nota mas alta");
                break;
            case 3:
                System.out.println("Mostrar nota mas baja");
                break;
            case 4:
                System.out.println("Aprobados");
                break;
            case 5:
                System.out.println("Reprobados");
                break;
            case 6:
                System.out.println("Salir");
                break;
                
        }

                
                
    }
}
