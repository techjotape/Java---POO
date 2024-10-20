public class Rectangle{
    public double width;
    public double height;

    public double area(){
        return width * height;
    } //end_method

    public double perimeter(){
        return 2 * (width + height);
    } //end_method
    
    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    } //end_method

    public String toString(){
        return String.format("Área: %.2f", area())
        + "\n"
        + String.format("Perímetro: %.2f", perimeter())
        + "\n"
        + String.format("Diagonal: %.2f", diagonal());
    }

}