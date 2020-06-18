public class Main {
    public static void main(String[] args) {
        double rate = 9.99;
        int term = 12;
        int credit = 1_000_000;
        int payment = (int) (credit * (rate + (rate / Math.pow((1 + rate), term) - 1)));
        System.out.println(payment);
    }
}
