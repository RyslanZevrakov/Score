public class Chief {
    String  accountant = "Accountant";
    Accountant objectAccountant = new Accountant();
    String assistant = "Assistant";
    Assistant objectAssistant =new Assistant();

    String cashier = "Cashier";

    Cashier objectCashier = new Cashier();

    String securityGuard = "Security Guard";

    SecurityGuard objectSecurityGuard = new SecurityGuard();

    public void staff(){
        System.out.println(accountant);
        objectAccountant.maniAccountant();
        System.out.println(assistant);
        objectAssistant.moneyAssistant();
        System.out.println(cashier);
        objectCashier.moneyCashier();
        System.out.println(securityGuard);
        objectSecurityGuard.moneySecurityGuard();
    }
}
