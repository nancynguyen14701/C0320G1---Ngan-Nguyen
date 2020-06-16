package P5AdvancedObjectOrientedDesign.ThucHanh.Comparator;

import java.util.Arrays;
import P4KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Circle;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5);
        circles[3] = new Circle(3.8);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
