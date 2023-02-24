public class Seller extends varibal {
    /*
     * (((((((((This is the seller's class and contains the four methodists shown below)))))))))).
     */



    //This is the method for the seller to enter the names of the companies he deals with
    public static void  NAME(String a,String b,String c,String d)
    {
        CompanyName.add(a.toUpperCase());
        CompanyName.add(b.toUpperCase());
        CompanyName.add(c.toUpperCase());
        CompanyName.add(d.toUpperCase());
    }


    //This method for the seller to enter the price of one box for each company
    public static void price(int a,int b ,int c,int d)
    {  
        CompanyPrice.add(a);
        CompanyPrice.add(b);
        CompanyPrice.add(c);
        CompanyPrice.add(d);
    }


    //This method so that the seller can enter the number of boxes he bought from each company
    public static void couterWeter(int a,int b ,int c,int d)
    {  
        couterWeter.add(a);
        couterWeter.add(b);
        couterWeter.add(c);
        couterWeter.add(d);
    }



    /*This method is for the seller to print the list 
    of his products from the name of the company and 
    the price of one box and how much he has a box from each company
    */
    public static void minu()
    { 
        System.out.println("thes is minu");
        System.out.println("______________________________________________");
        System.out.println("*********************************************|");
        System.out.println("**company:-\t"+"priceUnit\t"+"AmontrWeter *|");
        
        for (int i = 0; i < couterWeter.size(); i++)
        {System.out.print("*");
        System.out.println( CompanyName.get(i)+"\t"+"\t"+CompanyPrice.get(i)+"SR"+"\t"+"\t"+couterWeter.get(i)+"\t"+"    *|");
    }
         System.out.println("_______________________________________________");
         System.out.println("*********************************************|");
        
        
       
        
    }




public static void main(String[] args)
 {
    NAME("SAAD", "ALII", "NASER","NAWAF");
    price(10, 20, 30,0);
   couterWeter(1, 20, 30, 0);
    minu();
   

 }


}