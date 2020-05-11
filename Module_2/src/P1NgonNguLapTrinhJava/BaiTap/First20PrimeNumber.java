package P1NgonNguLapTrinhJava.BaiTap;

public class First20PrimeNumber {
    public static boolean primeCheck(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number=20;
        int count=0;
        int N=2;
        while(count<=number){
            if(primeCheck(N)){
                count++;
                System.out.println(N);
            }
            N++;
        }
    }
}
