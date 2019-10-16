package compare;

public class ComparableRectangle extends Rectangle implements CompareObject {
    public ComparableRectangle(double length, double width) {
        super(length, width);
    }

    public int compareTo(Object o) {
        Rectangle rectangle;
        if (o instanceof Rectangle){
            rectangle = (Rectangle)o;
            if (this.getArea() > rectangle.getArea()){
                System.out.println("当前矩形的面积更大");
                return 1;
            }
            else if (this.getArea() == rectangle.getArea()){
                System.out.println("两个矩形的面积相等");
                return 0;
            }
            else {
                System.out.println("当前矩形的面积更小");
                return -1;
            }
        }
        else {
            System.out.println("不是矩形，转换失败");
            return -2;
        }
    }
}
