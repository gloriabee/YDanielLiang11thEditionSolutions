public class Rectangle {
    double width,height;

    Rectangle(){
        width=1;
        height=1;
    }

    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    double getArea(){
        return width*height;
    }

    double getParameter(){
        return 2*(width+height);
    }
}
