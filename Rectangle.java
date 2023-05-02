package inface;

public class Rectangle implements Shape{
    private double haba;
    private double takasa;

    public Rectangle(double haba,double takasa){
        this.haba = haba;
        this.takasa = takasa;
    }

    public double calculateArea(){
        return haba * takasa;
    }
}
