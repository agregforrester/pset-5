import java.util.Scanner;

        public class Exercise7 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Enter a year: ");
                int year = in.nextInt();

                if (year % 4 == 0) {
                    System.out.println(" ");
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(" ");
                    System.out.println(year + " is not a leap year.");
                }

                in.close();
            }
        }