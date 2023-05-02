package inface;

public class Triangle implements Shape{
    private double teihen;
    private double takasa;
    public Triangle(double teihen,double takasa){
        this.teihen = teihen;
        this.takasa = takasa;
    }

//    @Override
    public double calculateArea(){
        return teihen * takasa / 2;
    }
}