public class Score{

    public static void main(String args[])
            throws java.io.IOException {
        char choice;
        Assistant assistant = new Assistant();
        Chief chief = new Chief();
        Accountant accountant = new Accountant();
        SecurityGuard securityGuard= new SecurityGuard();
        Cashier cashier = new Cashier();

        do {
            System.out.println("Информация");
            System.out.println(" 1. бугалтерия");
            System.out.println(" 2. персонал");
            System.out.println(" 3. продукты");
            System.out.println("4. отдыхают ли сатрудники");
            System.out.println("выберете вариант");


            choice = (char) System.in.read();
        }
        while (choice< '1' || choice > '4' );
        System.out.println("\n");
        switch (choice){
            case '1':
                System.out.println("\n");
                System.out.println("Зарплата всех сотрудников за месец");
                accountant.moneyForSalary();
                System.out.println("Аренда памищения за год");
                accountant.taxMoney();
                System.out.println("Прибль в день");
                accountant.income();
                break;
            case '2':
                System.out.println("\n");
                chief.staff();

                break;
            case '4':
                System.out.println("\n");
                System.out.println("отдыхает ли охраник");
                securityGuard.restSecurityGuard();
                System.out.println("отдыхает ли кассир");
                cashier.restCashier();
                System.out.println("отдыхает ли бугалтер");
                accountant.restAccountant();
                System.out.println("отдыхает ли ассистент");
                assistant.restAssistant();

                break;
            case '3':
                System.out.println("\n");
                assistant.assistant();
                break;




        }

    }
}