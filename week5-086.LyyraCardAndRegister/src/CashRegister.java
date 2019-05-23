
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.5) {
            cashInRegister += 2.5;
            economicalSold++;
            return cashGiven - 2.5;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4) {
            cashInRegister += 4;
            gourmetSold++;
            return cashGiven - 4;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= 2.5) {
            card.pay(2.5);
            economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= 4) {
            card.pay(4);
            gourmetSold++;
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold
                + " gourmet lunches sold: " + gourmetSold;
    }
}
