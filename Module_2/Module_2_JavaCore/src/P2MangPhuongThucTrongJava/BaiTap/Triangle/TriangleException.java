package P2MangPhuongThucTrongJava.BaiTap.Triangle;
import java.util.Scanner;

public class TriangleException {
    public static void checkEdge(int edge) throws IllegalTriangleException{
        if(edge < 0) {
            throw new IllegalTriangleException("the edge has to be positive number");
//            System.out.println("invalid.");
        }
    }
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("The input edges are invalid.");
        } else {
            System.out.println("This is a triangle");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        try {
            System.out.print("Input a: ");
            a = input.nextInt();
            checkEdge(a);
            System.out.print("Input a: ");
            b = input.nextInt();
            checkEdge(b);
            System.out.print("Input c: ");
            c = input.nextInt();
            checkEdge(c);
            checkTriangle(a, b, c);
        }
        catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());

        }
    }
}