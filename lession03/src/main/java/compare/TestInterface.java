package compare;

public class TestInterface {
    public static void main(String[] args) {
        ComparableCircle cc1 = new ComparableCircle(2);
        ComparableCircle cc2 = new ComparableCircle(3);
        System.out.println(cc1.compareTo(cc2));

        ComparableRectangle cr1 = new ComparableRectangle(3,4);
        ComparableRectangle cr2 = new ComparableRectangle(4,3);
        System.out.println(cr1.compareTo(cr2));
    }
}
