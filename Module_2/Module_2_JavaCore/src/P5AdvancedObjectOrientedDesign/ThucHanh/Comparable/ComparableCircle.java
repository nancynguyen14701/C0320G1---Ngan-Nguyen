package P5AdvancedObjectOrientedDesign.ThucHanh.Comparable;

import P4KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Circle;
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return Double.compare(this.getRadius(), o.getRadius());
    }
}