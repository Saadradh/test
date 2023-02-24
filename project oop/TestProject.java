public class TestProject extends Profit
{


    /*
     * Student Name : Saad radh harbi AL-matrafi
     * 
     * (((((((((This program is a project in object-oriented programming)))))))))
     * 
     * This project consists of 5 classes for the seller and contains a group of methodists that include
     *  the companies he deals with, their prices and number, and prints a list for a customer regarding
     *  the existing goods. And a special class for the customer, where he enters the companies he wants
     *  and how many boxes he wants, and also his invoice can be printed in this class, and there is also
     *  a class responsible for calculating the total value without tax, and also calculating it with the
     *  tax, and he can print you a separate tax as well, and a special class for variable, in which I put
     *  all the varibles that I used in my project. And the last class is what makes all these methods work
     * Work with each other. 
     */
    public static void main(String[] args)
    {
        //this part for Seller
        System.out.println("-------(((((((((Hi this is the seller's part))))))))))----------");
        NAME("SAFA", "HANA", "BEREN","ALHADA");
        price(10, 8,15,6);
        couterWeter(10, 10, 10, 10);
        minu();
        // end part of seller
        //************************************************** */


        //this part for customer
        System.out.println("-------(((((((((Hi this is the customer's part))))))))))----------");
         System.out.println("Please choose the names of the companies you want and if the company does not want write NO:");
        System.out.println("if you want SAFA write {SAFA} , if not want write {NO} ");
        String oneCompany= sc.nextLine();
        System.out.println("How many boxes did you take from {SAFA} : ");
        int boxesFor1company = sc.nextInt();
        sc.nextLine();
        System.out.println("if you want SAFA write {HANA} , if not want write {NO} ");
        String towCompany= sc.nextLine();
        System.out.println("How many boxes did you take from {HANA} : ");
        int boxesFor2company = sc.nextInt();
        sc.nextLine();


        System.out.println("if you want SAFA write {BEREN} , if not want write {NO} ");
        String threCompany= sc.nextLine();
        System.out.println("How many boxes did you take from {BEREN} : ");
        int boxesFor3company = sc.nextInt();
        sc.nextLine();
        
        System.out.println("if you want SAFA write {ALHADA} , if not want write {NO} ");
        String fourCompany= sc.nextLine();
        System.out.println("How many boxes did you take from {ALHADA} : ");
        int boxesFor4company = sc.nextInt();
        sc.nextLine();
        Cname(oneCompany, towCompany, threCompany, fourCompany);

        System.out.println("***************************************************************");
        System.out.println("***************************************************************");
        System.out.println("***************************************************************");
        System.out.println("***************************************************************");
        System.out.println("***************************************************************");


        
        
       
        

        CouterBox(boxesFor1company, boxesFor2company, boxesFor3company, boxesFor4company);
        Cprice();
        invoice();
        // end part for Coustomer



        //part from Profit
        totalAmount();
        CulcoletAmountTax();


    }
}