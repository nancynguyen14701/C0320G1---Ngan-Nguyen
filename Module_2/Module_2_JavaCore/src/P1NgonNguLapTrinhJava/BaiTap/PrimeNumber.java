package P1NgonNguLapTrinhJava.BaiTap;

public class PrimeNumber {
    public static boolean primeCheck(int a) {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
    }

        public static void main (String[]args){

        for(int i=2;i<100;i++){
            if(primeCheck(i)){
                System.out.println(i+"\n");
            }
        }
        }
    }

