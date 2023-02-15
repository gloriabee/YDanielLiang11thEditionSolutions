public class IllegalTriangleException extends Exception{
    private double side1;
    private double side2;
    private double side3;


    public IllegalTriangleException(double side1,double side2,double side3){
        super("Illegal triangle \n"+side1+"\n"+side2+"\n"+side3);
        
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

}
