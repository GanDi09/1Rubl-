
public class Main {
    public static void main(String[] args) {

        int bill = 100;
        int refill = 100;

        int bonus = 0;
        int amount = bill + refill;

        if (refill > 1000) {
            bonus = refill / 100;
        }
        System.out.println("сумма:" + (amount + bonus));
        System.out.println("бонус:" + bonus);
    }
}
