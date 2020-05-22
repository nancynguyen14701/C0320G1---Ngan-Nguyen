package P5AdvancedObjectOrientedDesign.BaiTap.Resizeable;
import P4KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Shape;
public class DemoResizeable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(2);
        shape[1] = new Rectangle(2, 4);
        shape[2] = new Square(2);
        for (Shape abc : shape) {
            if (abc instanceof Circle) {
                System.out.println(((Circle) abc).getArea());
                ((Circle) abc).resize(10);
            }
            else if(abc instanceof Rectangle){
                System.out.println(((Rectangle)abc).getArea());
                ((Rectangle)abc).resize(10);
            }
            else{
                System.out.println(((Square)abc).getArea());
                ((Square)abc).resize(10);
            }


        }


    }
}
