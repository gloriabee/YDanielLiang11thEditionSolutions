package No1;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();

        System.out.print("Enter color: ");
        String color=sc.next();


        System.out.print("Enter filled: ");
        boolean filled=sc.nextBoolean();

        Triangle t1=new Triangle(s1, s2, s3);
        t1.setColor(color);
        t1.setFilled(filled);

        // System.out.println(t1.toString());

        System.out.println(t1.toString());
        System.out.println("Area: "+t1.getArea());
        System.out.println("Perimeter: "+t1.getPerimeter());
        System.out.println("Color: "+t1.getColor());

        System.out.println("Triangle is : "+(t1.isFilled()?"":" not ")+"filled");




    }
}
