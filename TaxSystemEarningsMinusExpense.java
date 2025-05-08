public class TaxSystemEarningsMinusExpense extends TaxSystem {
    public int taxdebitMinusCredit(int debit, int credit) {

        int tax = (debit - credit) * 15 / 100;
        return Math.max(tax, 0);
    }

}


