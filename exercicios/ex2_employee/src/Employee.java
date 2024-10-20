public class Employee {
    
    private String name;
    private Double grossSalary;
    private Double tax;

    // ENCAPSULAMENTOS

    //Getter e setter de name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Getter e setter de Gross Salary
    public Double getGrossSalary() {
        return grossSalary;
    }
    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    //Getter e setter de tax
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }


    //CALCULOS
    public Double netSalary(){
        return grossSalary - tax;
    }
    
    //porcentagem de aumento
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100);
    }
}
