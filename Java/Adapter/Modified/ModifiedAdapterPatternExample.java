import java.util.ArrayList;
import java.util.List;

class ModifiedAdapterPatternExample {
    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Modified Demo***\n");
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("Area of Rectangle is :  "+ rectangle.calculateAreaOfRectangle()+" Square unit.");
        Triangle triangle = new Triangle(10,5);
        System.out.println("Area of Triangle is : "+triangle.calculateAreaOfTriangle()+ " Square unit.");
        RectInterface adapter = new TriangleAdapter(triangle);
        //Passing a Triangle instead of a Rectangle
        System.out.println("Area of Triangle using the triangle adapter is : "+getArea(adapter)+" Square unit.");
        //Some Additional code (Optional) to show the power of adapter
        //pattern
        List<RectInterface> rectangleObjects=new ArrayList<RectInterface>();
        rectangleObjects.add(rectangle);
        //rectangleObjects.add(triangle);//Error
        rectangleObjects.add(adapter);//Ok
        System.out.println("");
        System.out.println("*****Current objects in the system are:******");
        for(RectInterface rectObjects:rectangleObjects)
        {
            rectObjects.aboutRectangle();
        }
    }
    /*getArea(RectInterface r) method  does not know that through TriangleAdapter, it is getting a Triangle  object instead of a Rectangle object*/
    static double getArea(RectInterface r)
    {
        return r.calculateAreaOfRectangle();
    }
}