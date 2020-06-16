package P5AdvancedObjectOrientedDesign.BaiTap.Colorable;

import P4KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Shape;
import P5AdvancedObjectOrientedDesign.BaiTap.Resizeable.*;
import P5AdvancedObjectOrientedDesign.BaiTap.Colorable.Square;

public class MainClass {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(2);
        shape[1] = new Rectangle(2, 4);
        shape[2] = new Square(2);

        for (Shape abc: shape){
            // before learning inheritance
            // Square abc = new Square();
            // abc is instance of Square
            // after learning inheritance, interface
            // Shape abc = new Square();
            // abc instanceof Square, Shape, Colorable.
            if(abc instanceof Colorable){
                 System.out.println(((Square)abc).getArea());
                     ((Colorable)abc).howToColor();
                  }
        }
    }
}
