public class SecurityGuard {

    public double moneySecurityGuard = 30000;

    public void moneySecurityGuard()

    {
        System.out.println(moneySecurityGuard + "salary");
    }

    public boolean restSecurityGuard(double secondNumber , double firstNumber) {
            if (firstNumber>secondNumber)

                return true;
            else if (firstNumber == secondNumber)
                return false;
            else
                return true;
    }
    public static double firstNumber()
    {
        double Number = (int)(Math.random() * ( 3 - 1 )) + 1;

        return Number;
    }
    public static double secondNumber()
    {
        double Number = (int)(Math.random() * ( 3 - 1 )) + 1;

        return Number;
    }
    double firstNumbers = firstNumber();

    double secondNumber = secondNumber();

public void restSecurityGuard()
{
    System.out.println(restSecurityGuard( firstNumbers ,secondNumber));
}
}
