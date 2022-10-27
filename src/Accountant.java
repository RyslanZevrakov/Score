public class Accountant {

    Assistant assistant = new Assistant();

    Cashier cashier = new Cashier();

    SecurityGuard securityGuard = new SecurityGuard();

    Provider provider = new Provider();

    Buyer buyer = new Buyer();

    double moneyAccountant = 50000;

    public static double moneyForSalary;

    public static double taxMoney;

    public static double pricePerSqM = 42500;

    public static double sqM = 100;

    public static double rent;

    public double watt= 4700;

    public double pricePerWatt = 4;

    public double electricity;

    public double cubicMWater = 6100;

    public double priceForWater = 28;

    public double water;

      public void maniAccountant()
      {
        double moneyAccountant = 50000;

        System.out.println(moneyAccountant + " salary");
      }
      public void moneyForSalary( )
      {

        moneyForSalary = moneyAccountant + assistant.moneyAssistant + cashier.moneyCashier
                + securityGuard.moneySecurityGuard;

        System.out.println(moneyForSalary);
      }
      public void  taxMoney()
      {
        rent = pricePerSqM * sqM;

        electricity= watt * pricePerWatt;

        water= cubicMWater * priceForWater;

        taxMoney = provider.moneyProvider + rent + electricity + water;

        System.out.println(taxMoney);
      }
      public void income()
      {
        buyer.incomes();
      }
    public boolean restAccountant (double secondNumber , double firstNumber)
    {
        if (firstNumber>secondNumber)

            return true;

        else if (firstNumber == secondNumber)

            return false;

        else

            return true;

    }

    public static double firstNumber()
    {
        double firstNumber = (int)(Math.random() * ( 3 - 1 )) + 1;

        return firstNumber;
    }
    public static double secondNumber()
    {
        double  secondNumber = (int)(Math.random() * ( 3 - 1 )) + 1;

        return  secondNumber;
    }

    double firstNumbers = firstNumber();

    double secondNumber = secondNumber();

    public void restAccountant(){
        System.out.println(restAccountant( firstNumbers ,secondNumber));
    }
}
