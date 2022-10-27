public class Buyer {
double people;
double  priceFruit = 8;
double priceVegetables = 10;
double priceFish = 20;
double priceMeat = 22;
    public static double getRandomNumber(){

        double getRandomNumber = (int)(Math.random() * ( 1000 - 100 )) + 1;
        return getRandomNumber;
    }
    public static double  priceFruitNumber() {
        double priceFruitNumber = (int) (Math.random() * (100 - 0)) + 1;
        return priceFruitNumber;
    }
    public static double priceVegetablesNumber() {
        double priceVegetablesNumber = (int) (Math.random() * (200 - 0)) + 1;
        return priceVegetablesNumber;
    }
    public static double priceMeatNumber() {
        double  priceMeatNumber = (int) (Math.random() * (200 - 0)) + 1;
        return priceMeatNumber;
    }
    public static double priceFishNumber() {
        double  priceFishNumber = (int) (Math.random() * (200 - 0)) + 1;

        return  priceFishNumber;
    }
    public void incomes()
    {
        people = getRandomNumber();

        double priceVegetablesNumber = priceVegetablesNumber();

        double priceFruitNumber = priceFruitNumber();

        double priceMeatNumber = priceMeatNumber();

        double priceFishNumber = priceFishNumber();

       double income = people * ((priceVegetablesNumber * priceVegetables) + (priceFruit * priceFruitNumber) +
               (priceMeatNumber * priceMeat) + (priceFishNumber * priceFish));

        System.out.println(income);
    }
}
