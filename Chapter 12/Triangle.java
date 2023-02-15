public class Triangle {
   private double side1;
   private double side2;
   private double side3;

    public Triangle(double s1,double s2,double s3) throws IllegalTriangleException
    {
       if(s1+s2<=s3 || s1+s3<=s2 || s2+s3<=s1)
       throw new IllegalTriangleException(s1,s2,s3);
       side1=s1;
       side2=s2;
       side3=s3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double findPerimeter(){
        return side1+side2+side3;
    }

    public double findArea(){
        double s=findPerimeter()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public String toString(){
        return "Side1: "+side1+"\nSide2: "+side2+"\nSide3: "+side3;
    }
    
}
