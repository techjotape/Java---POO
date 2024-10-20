import java.util.Locale;
import java.util.Scanner;

public class TriangleTester {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Instanciação de dois objetos Triangle
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        //Entrada de Dados
        System.out.println("Medidas do Triângulo X: ");
        //Acessando os atributos do triângulo X
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Medidas do Triângulo Y: ");
        //Acessando os atributos do triângulo Y
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        //Cálculo das áreas - acessando método para o  
        //cálculo das áreas dos triângulos X e Y
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do Triângulo X: %.4f\n", areaX);
        System.out.printf("Área do Triângulo Y: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior Área: X");
        } else if (areaX < areaY) {
            System.out.println("Maior Área: Y");
        } else {
            System.out.println("Área X = Área Y");
        }
        sc.close();
    }//End_main()
}//End_class