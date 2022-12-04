public class Main {
    public static void main(String[] args) {

        int bill = 100;
        int refill = 1100;
        int count = refill / 100;

        int amount = count + bill + refill;

       if  (refill > 100) {
           amount = count + (bill+ refill);

        } else {
           amount = 0 + bill + refill;
       }
        System.out.println(amount);
    }
}
