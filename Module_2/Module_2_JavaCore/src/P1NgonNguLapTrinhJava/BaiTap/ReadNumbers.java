package P1NgonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        int weight = scanner.nextInt();
        int ones;
        String[] from1To9 = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int tens;
        String result = "";
        if (weight<1000 && weight>=100){
            ones = weight % 10;
            tens = (weight - ones) %100/ 10    ;
            int hundreds=(weight-(weight  %100))/100;
            int rest= weight - hundreds*100;
            result = from1To9[hundreds] + (hundreds == 1 ? " hundred " : " hundreds ");
            weight=rest;
        }
        if (weight < 100 && weight >= 20) {
            ones = weight % 10;
            tens = (weight - ones) / 10;

            switch (tens) {
                case 2: {
                    result += "twenty ";
                    result += from1To9[ones];
                    System.out.println(result);
                    break;
                }
                case 3: {
                    result += "thirty ";
                    result += from1To9[ones];
                    System.out.println(result);
                    break;
                }
                case 4: {
                    result += "forty ";
                    result += from1To9[ones];
                    System.out.println(result);
                    break;
                }
                case 5: {
                    result += "fifty ";
                    result += from1To9[ones];
                    System.out.println(result);
                    break;
                }
                case 6: {
                    result += "sixty ";
                    result += from1To9[ones];
                    System.out.println(result);
                    break;
                }
                case 7: {
                    result += "seventy ";
                    result += from1To9[ones];
                    System.out.println(result);
                    break;
                }
                case 8: {
                    result += "eighty ";
                    result += from1To9[ones];
                    System.out.println(result);
                    break;
                }
                case 9: {
                    result += "ninety ";
                    result += from1To9[ones];
                    System.out.println(result);
                    break;
                }
            }
        }
        if (weight < 20 && weight >= 10) {
            ones = weight - 10;
            switch (ones) {
                case 0: {

                    System.out.println(result + " ten");
                    break;
                }
                case 1: {
                    System.out.println(result+"eleven");
                    break;
                }
                case 2: {
                    System.out.println(result + "twelve");
                    break;
                }
                case 3: {
                    System.out.println(result+ "thirteen");
                    break;
                }
                case 4: {
                    System.out.println(result+"fourteen");
                    break;
                }
                case 5: {
                    System.out.println(result+"fifteen");
                    break;
                }
                case 6: {
                    System.out.println(result+"sixteen");
                    break;
                }
                case 7: {
                    System.out.println(result+"seventeen");
                    break;
                }
                case 8: {
                    System.out.println(result+"eighteen");
                    break;
                }
                case 9: {
                    System.out.println(result+"nineteen");
                    break;
                }
            }

        }
        if (weight >= 0 && weight < 10) {
            ones = weight;
            switch (ones) {
                case 0: {
                    System.out.println(result+"zero");
                    break;
                }
                case 1: {
                    System.out.println(result+"one");
                    break;
                }
                case 2: {
                    System.out.println(result+"two");
                    break;
                }
                case 3: {
                    System.out.println(result+"three");
                    break;
                }
                case 4: {
                    System.out.println(result+"four");
                    break;
                }
                case 5: {
                    System.out.println(result+"five");
                    break;
                }
                case 6: {
                    System.out.println(result+"six");
                    break;
                }
                case 7: {
                    System.out.println(result+"seven");
                    break;
                }
                case 8: {
                    System.out.println(result+"eight");
                    break;
                }
                case 9: {
                    System.out.println(result+"nine");
                    break;
                }
                default: {
                    System.out.println("out of ability");
                    break;
                }

            }
        }




    }
}






