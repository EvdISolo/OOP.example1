public class TaxSystemEarnings extends TaxSystem {
    public static int TaxDebitplus(int debit, int credit) {
        int tax = (debit) * 6 / 100;
        return tax;

    }
}
