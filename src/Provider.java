public class Provider  {

    public double moneyProvider = 100000;

    public static  double vegetables = secondNumber();

    public static  double fruit = firstNumber();

    public static double meat = meatNumber();

    public static double fish = fishNumber();

    public static double firstNumber()
    {
        double Number = (int)(Math.random() * ( 500 - 100 )) + 100;

        return Number;
    }
    public static double secondNumber()
    {
        double Number = (int)(Math.random() * ( 300 - 100 )) + 100;

        return Number;
    }
    public static double fishNumber()
    {
        double Number = (int)(Math.random() * ( 300 - 100 )) + 100;

        return Number;
    }

    public static double meatNumber()
    {
        double Number = (int)(Math.random() * ( 300 - 100 )) + 100;

        return Number;
    }
}





