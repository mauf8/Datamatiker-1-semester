package Demo;

import java.util.Scanner;

public class Main {
            Scanner in = new Scanner(System.in);

            public void larsjørgen(){
                System.out.println("type your name: ");
                in.nextLine();
                System.out.println("It works!");

            }

            void Go() {
                larsjørgen();
                askage();

            }

            void askage() {
                System.out.println("Enter your age");
                int yourage = in.nextInt();
                System.out.println("your age is: " + yourage);

            }






    public static void main(String[] args) {
                new Main().Go();

    }

}
