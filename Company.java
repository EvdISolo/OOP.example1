import java.util.Scanner;

public class Company {
    private String title;
    private int debit = 0;
    private int credit = 0;
    private TaxSystem taxSystem;


    public Company(String title, int debit, int credit, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;

    }

    public boolean shiftMoney(int amount) {
        if (amount > 0) {
            debit = +amount;
        } else if (amount < 0) {
            credit = +Math.abs(amount);
        } else amount = 0;

        return false;
    }

    public int payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания" + title + "уплатила налог в размере" + tax + "руб");
        return tax;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }


}
















