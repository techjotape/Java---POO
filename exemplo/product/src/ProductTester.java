import java.util.Locale;
import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Entrar com os Dados dos Produtos: ");
        
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        product.quantity = sc.nextInt();

        System.out.println("Dados do Produto: " + product);
        System.out.print("Qtde de Produtos Adicionados ao Estoque: ");
        int qtd = sc.nextInt();
        product.adicionaProdutos(qtd);
        System.out.println("Dados atualizados: " + product);
        System.out.print("Qtde de Produtos Removidos do Estoque: ");
        qtd = sc.nextInt();
        product.removeProdutos(qtd);
        System.out.println("Dados atualizados: " + product);

        sc.close();
    } //end main
}//end class
