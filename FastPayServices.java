import src.interfaces.TransLogger;
import src.models.CashPayment;

public class FastPayServices {
    public static void main(String[] args) {
        System.out.println("Hello from payment system FastPayServies");
        TransLogger logger = msg -> System.out.println("LOG: " + msg);
        CashPayment cashPayment = new CashPayment(15000, 10, logger);
        cashPayment.pay();
        
    }
}
