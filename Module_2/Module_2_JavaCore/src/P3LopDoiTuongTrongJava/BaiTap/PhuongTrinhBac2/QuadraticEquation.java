package P3LopDoiTuongTrongJava.BaiTap.PhuongTrinhBac2;

public class QuadraticEquation {
    private double a, b, c;
    private double delta;
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        delta =  (b*b)-(4*a*c);
        return delta;
    }
    public double getRoot1(){
        double r1 = (-b-Math.pow((delta),0.5))/2*a;
        return r1;
    }
    public double getRoot2(){
        double r2 = (-b+Math.pow((delta),0.5))/2*a;
        return r2;
    }

    QuadraticEquation(double a, double b, double c){
    this.a= a;
    this.b=b;
    this.c=c;

}
}
