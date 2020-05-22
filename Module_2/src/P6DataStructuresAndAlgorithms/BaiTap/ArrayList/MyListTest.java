package P6DataStructuresAndAlgorithms.BaiTap.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list= new MyList<>();

        list.addLast(10);
        list.addLast(12);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.indexOf(10));



    }
}
