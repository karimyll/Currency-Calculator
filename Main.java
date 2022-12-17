import java.util.Scanner;

public class Main {

    static void sellUSD(int usdValue) {
        float aznValue;
        if (usdValue == 1) {
            aznValue = 1.70f;
            System.out.println("Your money: " + aznValue + " AZN");
        } else {
            aznValue = usdValue * 1.697f;
            System.out.println("Your money: " + aznValue + " AZN");
        }
    }

    static void sellEUR(int eurValue) {
        float aznValue = eurValue * 1.791f;
        System.out.println("Your money: " + aznValue + " AZN");

    }

    static void buyUSD(int usdValue){
        float aznValue = usdValue * 1.702f;
        System.out.println("The amount you have to pay to buy: " + aznValue + " AZN");

    }

    static void buyEUR(int eurValue){
        float aznValue = eurValue * 1.8375f;
        System.out.println("The amount you have to pay to buy: " + aznValue + " AZN");

    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = true;
        while (valid == true) {
            System.out.println("0. Exit");
            System.out.println("1. I am sell");
            System.out.println("2. I am buy");

            System.out.print("Your choice: ");
            int firstSelection = input.nextInt();
            if (firstSelection == 1) {
                System.out.println("What do you sell?");
                System.out.println("1. USD");
                System.out.println("2. EUR");
                System.out.print("Your selection: ");
                int secondSelection = input.nextInt();
                switch (secondSelection) {
                    case 1:
                        System.out.print("How much do you sell? (USD): ");
                        int usdValue = input.nextInt();
                        sellUSD(usdValue);
                        break;

                    case 2:
                        System.out.print("How much do you sell? (EUR): ");
                        int eurValue = input.nextInt();
                        sellEUR(eurValue);
                        break;
                }
            } else if (firstSelection == 2) {
                System.out.println("What do you want to buy?");
                System.out.println("1. USD");
                System.out.println("2. EUR");
                System.out.print("Your selection: ");
                int secondSelection = input.nextInt();
                switch (secondSelection) {
                    case 1:
                        System.out.print("How much do you want to buy? (USD): ");
                        int usdValue = input.nextInt();
                        buyUSD(usdValue);
                        break;

                    case 2:
                        System.out.print("How much do you want to buy? (EUR): ");
                        int eurValue = input.nextInt();
                        buyEUR(eurValue);
                        break;

                }

                System.out.println("Your selection 2");
            } else if (firstSelection == 0) {
                System.out.println("Good Bye!");
                valid = false;
            } else {
                System.out.println("Please select correct choice!");
            }

        }

    }
}
