
public class Main {
    public static void main(String[] args) {

        int bill = 100;
        int refill = 1100;
        int bonus = refill / 100;

        int amount = bonus + bill + refill;

        if (refill > 100) {
            amount = bonus + (bill + refill);

        } else {
            amount = 0 + bill + refill;
        }
        System.out.println(amount);
        System.out.println(bonus);
    }
}