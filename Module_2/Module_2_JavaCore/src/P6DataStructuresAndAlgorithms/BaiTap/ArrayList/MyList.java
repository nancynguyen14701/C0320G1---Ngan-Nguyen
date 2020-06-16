package P6DataStructuresAndAlgorithms.BaiTap.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    static final int DEFAULT_CAPACITY=10;
    private Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
//    add đơn giản trước
    public void addLast( E element){
        if(size>=DEFAULT_CAPACITY){
            elements= Arrays.copyOf(elements, size*2);
        }
        elements[size++]= element;
    }
//    add theo index
    public void add(int index, E element){
    for (int i=index;i<size;i++){
        elements[i+1]= elements[i];
}
    elements[index]= element;
    size++;
    }
//    Hàm contains
    public boolean contains(E o) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(o)) {
                return true;
            }
        }
        return false;
    }
//    Hàm remove
    public void remove(int index){
        Object deletedElement= elements[index];
        for(int i=index;i<size;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
    }
//    Hàm size
    public int size(){
        return size;
    }
//    Hàm get
    public E get(int i){
        if (i >= size|| i<0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
//    Hàm clear
    public void clear(){
        for(int i=0;i<size;i++){
            elements[i]=null;
        }
        size=0;
    }
//    Hàm indexOf
    public int indexOf(E o){
        for (int i=0;i<size;i++){
            if(elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
//    Hàm add trả về boolean
public boolean add(E e) {
    addLast(e);
    return true;
}
// Hàm clone
//    public MyList<E> clone(){
//        MyList<E> clone= new MyList<E>();
//        for (int i = 1; i < size; i++){
//
//        }
//
//    }

}
