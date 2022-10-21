public class Cashier extends Provider {
    public double moneyCashier = 45000;
    public void moneyCashier() {
        System.out.println(moneyCashier + "salary");
    }

    public boolean restCashier(double secondNumber , double firstNumber) {
        if (firstNumber>secondNumber)

            return true;
        else if (firstNumber == secondNumber)
            return false;
        else
            return true;

    }

    public static double firstNumber() {
        double Number = (int)(Math.random() * ( 3 - 1 )) + 1;
        return Number;
    }
    public static double secondNumber() {
        double Number = (int)(Math.random() * ( 3 - 1 )) + 1;
        return Number;
    }
    double firstNumbers = firstNumber();
    double secondNumber = secondNumber();

    public void restCashier(){
        System.out.println(restCashier( firstNumbers ,secondNumber));
    }

}
