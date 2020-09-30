import java.util.Scanner;
import models.*;

public class App {
    public static void main(final String[] args) throws Exception {
        System.out.println("Welcome student!");
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];
        Score[] scores = new Score[3];


        for (int i = 0; i < students.length; i++) {
            
            System.out.print("Name: ");
            String name = scanner.next();
            // System.out.print("Title: ");
            // String title = scanner.next();

            students[i] = new Student(name);
        }

        for (int i = 0; i < scores.length; i++) {
            
            System.out.printf("Type score for %s: ",students[i].getName());
            double value = scanner.nextDouble();

            scores[i] = new Score(value);
        }


        // Imprimir resultados
        for (int i = 0; i < students.length; i++) {
            System.out.printf("Score for %s - %f ",students[i].getName(), scores[i].getScore());
        }



        scanner.close();
    }
}
