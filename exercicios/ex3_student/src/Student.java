public class Student {
    private String name;
    private Double quarter1;
    private Double quarter2;
    private Double quarter3;
    
    //GETTERS E SETTERS
    //NAME
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Quarters
    public void setQuarter1(Double quarter1) {
        if(quarter1 >= 0 && quarter1 <=30)
            this.quarter1 = quarter1;
        else
            throw new IllegalArgumentException("A nota do trimestre 1 deve estar entre 0 e 30.");
    }

    public void setQuarter2(Double quarter2) {
        if(quarter2 >= 0 && quarter2 <=35)
            this.quarter2 = quarter2;
        else
            throw new IllegalArgumentException("A nota do trimestre 2 deve estar entre 0 e 35.");
    }
    
    public void setQuarter3(Double quarter3) {
        if(quarter3 >= 0 && quarter3 <=35)
            this.quarter3 = quarter3;
        else
            throw new IllegalArgumentException("A nota do trimestre 3 deve estar entre 0 e 35.");
    }
   
    //FINAL GRADE
    public void finalGrade(){
        Double sum = quarter1+quarter2+quarter3;

        System.out.printf("FINAL GRADE = %.2f%n", sum);
        if(sum >= 60.00)
            System.out.printf("PASS%n");
        else{
        System.out.printf("%nFAILED%n");
        System.out.printf("MISSING %.2f POINTS%n", (60 - sum));
        }
    }
}