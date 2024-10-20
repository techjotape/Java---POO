public class Product {
    
    //Definição dos atributos
    public String name;
    public double price;
    public int quantity;
    
    //Definição dos Metodos
    public double valorTotalEmEstoque(){
        return price*quantity;
    } //end_metodo

    public void adicionaProdutos(int quantity){
        this.quantity += quantity;
    } //end metodo
    public void removeProdutos(int quantity){
        this.quantity -= quantity;
    }//end metodo

    //Converte o objeto para String - herda o método da classe Object
    public String toString(){
        return name
        + ", R$"
        + String.format("%.2f", price)
        + ","
        + quantity
        + " unidades, Total: R$ "
        + String.format("%.2f", valorTotalEmEstoque());
    } //end metodo
} //end class
