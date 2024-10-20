import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("NAME: ");
        String name = sc.nextLine();
        student.setName(name);

        System.out.print("QUARTER 1: ");
        Double quarter1 = sc.nextDouble();
        student.setQuarter1(quarter1);

        System.out.print("QUARTER 2: ");
        Double quarter2 = sc.nextDouble();
        student.setQuarter2(quarter2);

        System.out.print("QUARTER 3: ");
        Double quarter3 = sc.nextDouble();
        student.setQuarter3(quarter3);

        // Chama o método finalGrade sem parâmetros
        student.finalGrade();  

        sc.close();
    }
}
