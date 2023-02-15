public class TestTriangle {
    public static void main(String[] args){
        try {
            Triangle t1=new Triangle(2.0, 2.0, 3.0);
            System.out.println(t1.toString());
            System.out.println( t1.findPerimeter());
            System.out.println(  t1.findArea());
           
        } catch (IllegalTriangleException e) {
            // TODO: handle exception   
            System.out.println(e.getMessage());
        }
       

    }
}
