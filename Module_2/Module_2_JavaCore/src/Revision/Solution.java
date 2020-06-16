package Revision;

import java.util.Scanner;

public class Solution {
   static int x;
   static int y;
   static int result;
   public static void check(int a, int b){

       if(b==0){
           throw new ArithmeticException("divide by 0");
       }   else{
           result = x/y;
           System.out.println(result);}
   }



    public static void main(String[] args)  {
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter x: ");
//        x = scanner.nextInt();
//        System.out.println("enter y: ");
//        y= scanner.nextInt();
//try{check(1,0);}
//catch(ArithmeticException e) {
//    e.getMessage();
//    System.out.println("trong khoi catch");
//        }
//
//        System.out.println("done");
        check(3,0);
}
    }

