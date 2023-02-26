package No1;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    
    public Triangle() {
        this.side1=1.0;
        this.side2=1.0;
        this.side3=1.0;

        //side1=side2=side3=1.0;

    }


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getArea(){
        double s= (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    // public String toString(){
    //     return "Triangle: area= "+getArea()+ " perimeter= "+ getPerimeter()+" color= "+super.getColor()+ "Filled "+isFilled();
    // }

    public String toString(){
        return "Triangle: side1 = "+side1+ "side2= "+side2+ "side3= "+side3;
    }
    
}
