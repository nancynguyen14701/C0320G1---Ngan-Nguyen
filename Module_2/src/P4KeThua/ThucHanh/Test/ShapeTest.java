package P4KeThua.ThucHanh.Test;
import P4KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Shape;
public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}