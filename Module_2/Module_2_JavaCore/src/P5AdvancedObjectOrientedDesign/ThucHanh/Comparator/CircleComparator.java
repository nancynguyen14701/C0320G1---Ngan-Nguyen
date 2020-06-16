package P5AdvancedObjectOrientedDesign.ThucHanh.Comparator;

import java.util.Comparator;


import P4KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Circle;


public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 2;
        else if (c1.getRadius() < c2.getRadius()) return -2;
        else return 0;
    }

}