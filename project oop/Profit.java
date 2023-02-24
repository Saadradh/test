public class Profit extends Customer
{
    
    public static void  totalAmount()
    {
        
        for (int i = 0; i < 4; i++)
        {
            SumTheGain=SumTheGain+ CustoweryPrice.get(i) ;
        }
        System.out.println("the amount with SR without tax : "+SumTheGain+"SR");

    }


    public static void  CulcoletAmountTax()
    {
        int result = (SumTheGain*15)/100;

        System.out.println("                    the tax : "+result+"SR");
        System.out.println("the amount with SR with tax : "+(SumTheGain+result)+"SR");
    }



}
