package sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;

        System.out.println("☆★WINNER WINNER CHICKEN WINNER★☆");
        System.out.println("SELECT YOUR FAVORITE CHICKEN BRAND!!!!!");
        System.out.println("1. BHC");
        System.out.println("2. DDORAE ORAE");
        System.out.println("3. GOOBNE");
        System.out.println("4. YES YES");
        System.out.println("5. KFC");
        System.out.println("6. HOSICK'S 2 CHICKENS");
        System.out.println("7. MY FAVORITE IS NOT IN THIS LIST");


        System.out.println();
        System.out.println("PLEASE ENTER THE NUMBER OF YOUR CHOICE");

        Scanner scanner = new Scanner(System.in);


        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("WINNNNNER");
                break;
            case 2:
                System.out.println("YOU ARE A VERY PRECIOUS PERSON");

//             System.out.println("WHAT IS YOUR FAVORITE TASTE?");

//        System.out.println("1. FRIED");
//        System.out.println("2. YANGNYOM");
//        System.out.println("3. HALF/HALF & LOTS OF PI2CKLED RADISH");
//        switch (choice) {
//           case 1:   System.out.println("OH I CANNOT PLAY WITH YOU");
//              break;
//           case 2:   System.out.println("WE ARE SOULMATES");
//              break;
//           case 3:   System.out.println("ATTACHED TO LIVER FLIPPED TO SSULGAE");
//              break;
//        }
                break;
            case 3:
                System.out.println("YOU ARE A NO-JAM PERSON");
                break;
            case 4:
                System.out.println("GU-ROM-YO DANG-YON-HA-JYO NENE CHICKEN~");
                break;
            case 5:
                System.out.println("YANKEY-GO-HOME");
                break;
            case 6:
                System.out.println("VERY AJAE-TIC");
                break;
            case 7:
                System.out.println("PICKY DONKEY");
                break;

        }
        //System.out.println("TRY AGAIN?---> (1) YES (2) NO <---ENTER NUMBER");
        scanner.close();
    }
}