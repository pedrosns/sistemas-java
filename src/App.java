import java.util.Scanner;
import models.*;

public class App {
    public static void main(final String[] args) throws Exception {
        // System.out.println("Welcome student!");
        Scanner scanner = new Scanner(System.in);

        // Student[] students = new Student[3];
        // Score[] scores = new Score[3];


        // for (int i = 0; i < students.length; i++) {
            
        //     System.out.print("Name: ");
        //     String name = scanner.next();
        //     // System.out.print("Title: ");
        //     // String title = scanner.next();

        //     students[i] = new Student(name);
        // }

        // for (int i = 0; i < scores.length; i++) {
            
        //     System.out.printf("Type score for %s: ",students[i].getName());
        //     double value = scanner.nextDouble();

        //     scores[i] = new Score(value);
        // }


        // // Imprimir resultados
        // for (int i = 0; i < students.length; i++) {
        //     System.out.printf("Score for %s - %f ",students[i].getName(), scores[i].getScore());
        // }

        // scanner.close();



        // Array multidimensionales

        // 2 dimensiones matriz 
        // F x C = total
        int[][] matriz = new int[3][3];

        String[][] matriz2 = new String[2][2];


        // Es parar recorrer las filas
        for (int fila= 0; fila < matriz.length; fila++) {
            for(int columna=0; columna < matriz[fila].length ; columna++) {
                System.out.printf("Element row %d - colum %d: ",fila,columna);
                int value = scanner.nextInt();

                matriz[fila][columna] = value;
            }
        }

        scanner.close();


        // Es parar recorrer las filas
        for (int fila = 0; fila < matriz.length; fila++) {
            for(int columna=0; columna < matriz[fila].length ; columna++) {
                System.out.printf("[ %d ]", matriz[fila][columna]);
            }
            System.out.println("");
        }

    }
}
