package P5AdvancedObjectOrientedDesign.BaiTap.Colorable;

import java.util.*;

class Ca extends A {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer u = map.put(1, 5);
        System.out.println(u);
        Integer v = map.put(1, 100);
        System.out.println(v);
        System.out.println(map.get(1));
        TreeMap <A, Integer> set1 = new TreeMap<>();


    }
}

class A {
   private int x = 5;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void testA (A a) {
        a.x =3;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
class B {
    private int b = 2;

}