package geometric;

public class Test {
    public void equalsArea(GeometricObject shapOne,GeometricObject shapTwo){
        if (shapOne.findArea() == shapTwo.findArea()){
            System.out.println("两个形状面积相等");
        }
        else{
            System.out.println("两个形状面积不等");
        }
    }
    public void displayGeometricObject(GeometricObject shap){
        System.out.println(shap.findArea());
    }
    public static void main(String[] args) {
        Test test = new Test();
        Circle circle = new Circle("red",0,3);
        MyRectangle rectangle1 = new MyRectangle("green",0,3,4);
        MyRectangle rectangle2 = new MyRectangle("red",0,4,3);
        test.equalsArea(circle,rectangle1);
        test.displayGeometricObject(circle);
        test.displayGeometricObject(rectangle1);
        test.equalsArea(rectangle1,rectangle2);
    }
}
