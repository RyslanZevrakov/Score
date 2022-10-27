public class Assistant extends Provider {

    public double moneyAssistant = 40000;

    public void assistant()
    {
            System.out.println(vegetables + " овощей на первой полку");

            System.out.println(fruit + " фруктов на второй полку");

        System.out.println(meat + " Мясо в правом холодильнике " + fish +
                " Рыба в левом холодильнике");
    }

    public void moneyAssistant()

    {

        System.out.println(moneyAssistant + " salary");
    }

    public boolean restAssistant( double secondNumber , double firstNumber)
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

    public void restAssistant()
    {
        System.out.println(restAssistant( firstNumbers ,secondNumber));
    }
    }
