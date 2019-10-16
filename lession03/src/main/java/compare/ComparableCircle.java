package compare;

import java.util.Calendar;

public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle(double r){
        super(r);
    }
    public int compareTo(Object o) {
        Circle circle;
        if (o instanceof Circle){
            circle = (Circle)o;
            if (this.getRadius() > circle.getRadius()){
                System.out.println("当前圆形的面积更大");
                return 1;
            }
            else if (this.getRadius() == circle.getRadius()){
                System.out.println("两个圆形的面积相等");
                return 0;
            }
            else {
                System.out.println("当前圆形的面积更小");
                return -1;
            }
        }
        else {
            System.out.println("不是圆形，转换失败");
            return -2;
        }
    }
}
