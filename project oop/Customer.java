

public class Customer extends Seller
{
    /*
     * (((((((((((This is the customer's class and contains the four methods shown below.)))))))))))
     */





     // This is the methodist so that the customer enters the names of the companies he wants to buy from
    public static void Cname(String a,String b,String c,String d)
    {
        CustoweryName.add(a.toUpperCase());
        CustoweryName.add(b.toUpperCase());
        CustoweryName.add(c.toUpperCase());
        CustoweryName.add(d.toUpperCase());
  
    }



    /*
     * This method is for the customer to enter the number of boxes he wants from each company
     */
    public static void CouterBox(int a,int b,int c,int d)
    {
       
        CustowerWeter.add(a);
        CustowerWeter.add(b);
        CustowerWeter.add(c);
        CustowerWeter.add(d);
        
    }




    /*
     * This method is to calculate the value of buyers to the customer from each company
     */
    public static void Cprice()
    {
        for (int i = 0; i < 4; i++)
        {
            CustoweryPrice.add(CustowerWeter.get(i)*CompanyPrice.get(i));
        }
       
      
     }



     /*
      * This method is to print the customer's invoice "without a saddle."
      */
    public static void invoice()
    {
        System.out.println("thes is invoice");
        System.out.println("______________________________________________");
        System.out.println("*********************************************|");
        System.out.println("**company:-\t"+" Total price\t"+"AmontrWeter *|");
        
        for (int i = 0; i < 4; i++)
        {System.out.print("*");
        System.out.println( CustoweryName.get(i)+"\t"+"\t"+CustoweryPrice.get(i)+"SR"+"\t"+"\t"+CustowerWeter.get(i)+"\t"+"    *|");
    }
    
         System.out.println("_______________________________________________");
         System.out.println("*********************************************|");
    

    }

    public static void main(String[] args)
    {
        Cname("SAAD", "ALII", "null", "NAWAF");
        CouterBox(3, 2, 2, 2);
        Cprice();
        invoice();
        
        
    }




}
