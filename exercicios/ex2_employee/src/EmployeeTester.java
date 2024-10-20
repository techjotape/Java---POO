import java.util.Scanner;
import java.util.Locale;

public class EmployeeTester {
    public static void main(String[] args){
        
        //Scanner, Locale e variáveis
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Employee funcionario = new Employee();

        //Entrada de Dados
        System.out.print("Nome: ");
        String nome = sc.nextLine(); //Recebe nome do usuário
        funcionario.setName(nome); //Atribuir o nome usando o setter

        System.out.print("Salário Bruto: ");
        Double salarioBruto = sc.nextDouble(); //Recebe salário bruto
        funcionario.setGrossSalary(salarioBruto); //JoaAtribuir o salario usando o setter

        System.out.print("Taxa: ");
        Double taxa = sc.nextDouble(); //Recebe taxa do salario
        funcionario.setTax(taxa); //Atribuir a taxa

        //Imprime nome e salário líquido
        System.out.printf("\nFuncionário: %s, $%.2f%n",funcionario.getName(), funcionario.netSalary());

        //Implementação do Acrescimo do salario
        System.out.print("\nDigite a porcentagem que será acrescida: ");
        Double acrescerSalario = sc.nextDouble();   
        funcionario.increaseSalary(acrescerSalario); //Altera valor do grossSalary, 

        //Imprime versão atualizada
        System.out.printf("\nDados Atualizados: %s, $%.2f%n", funcionario.getName(), funcionario.netSalary());


        sc.close();
    }
}
