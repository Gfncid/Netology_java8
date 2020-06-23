public class CreditPaymentService {
    public int calculate(int credit, int term) {
        double rate = 0.008325;
        int payment = (int) (credit * (rate + (rate / ((Math.pow((1 + rate), term)) - 1))));
        return payment;
    }
}