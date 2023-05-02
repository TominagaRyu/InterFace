package inface;

public class Circle implements Shape {
    private double goukei;

    public Circle(double goukei){
        this.goukei = goukei;
    }

    public double calculateArea(){
        return Math.PI * goukei * goukei;
    }
}
