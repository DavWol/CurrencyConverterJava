import java.util.Scanner;
public class skillsDemo1 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        //Variable declarations

        //Printing to console
        System.out.println("****Welcome to the Currency Converter****");
        System.out.println("1.Convert Euro to GBP");
        System.out.println("2.Convert GBP to Euro");
        System.out.println("3.Convert Euro to US Dollars");
        System.out.println("4.Convert US Dollar to Euro");
        System.out.println("5.Convert GBP to US Dollars;");
        System.out.println("6.Convert US Dollars to GBP");
        //Ask the user to select an option
        System.out.println("Please select an option");
        int option = sc.nextInt();

        if(option == 1) {
            System.out.println("Please select an amount in euro");
            double amount = sc.nextDouble();
            if(amount <=0) {
                System.out.println("Sorry you have entered an invalid amount");
            } else {
                System.out.println(amount+" is "+(amount*0.872)+" in GB Pounds");
            }
        } else if(option == 2) {
            System.out.println("Please select an amount in GB Pounds");
            double amount = sc.nextDouble();
            if(amount <=0) {
                System.out.println("Sorry you have entered an invalid amount");
            } else {
                System.out.println(amount+" is "+(amount/0.872)+" in Euro");
            }

        } else if(option == 3) {
            System.out.println("Please select an amount in Euro");
            double amount = sc.nextDouble();
            if(amount <=0) {
                System.out.println("Sorry you have entered an invalid amount");
            } else {
                System.out.println(amount+" is "+(amount*1.106)+" in US Dollars");
            }
        } else if(option == 4) {
            System.out.println("Please select an amount in US Dollars");
            double amount = sc.nextDouble();
            if(amount <=0) {
                System.out.println("Sorry you have entered an invalid amount");
            } else {
                System.out.println(amount+" is "+(amount/1.106)+" in Euro");
            }

        } else if(option == 5) {
            System.out.println("Please select an amount in GB Pounds");
            double amount = sc.nextDouble();
            if(amount <=0) {
                System.out.println("Sorry you have entered an invalid amount");
            } else {
                System.out.println(amount+" is "+(amount*1.314)+" in US Dollars");
            }

        } else if(option == 6) {
            System.out.println("Please select an amount in US Dollars");
            double amount = sc.nextDouble();
            if(amount <=0) {
                System.out.println("Sorry you have entered an invalid amount");
            } else {
                System.out.println(amount+" is "+(amount/1.314)+" in GB Pounds");
            }


        } else {
            System.out.println("Sorry you entered an invlaid option");
        }
    }
}

