public class TaxCalculate implements AccountNP {

    private double income;
    private double expenses;

    public double getIncome() {
        return income;
    }

    public double getExpenses() {
        return expenses;
    }

    @Override
    public void setIncome(double newIncome) {
        if (newIncome < 0) {
            income = 0;
        } else {
            income += newIncome;
        }

    }

    @Override
    public void setExpenses(double newExpenses) {

        if (newExpenses < 0) {
            expenses = 0;
        } else {
            expenses += newExpenses;
        }
    }

    public double incomeTax6() {
        double tax;
        if (getIncome() == 0) {
            tax = 0;
        } else {
            tax = getIncome() * 6 / 100;
        }
        return tax;
    }

    public double expensesTax15() {
        double tax;
        if (getIncome() == 0) {
            tax = 0;
        } else {
            if (getIncome() - getExpenses() < 0) {
                tax = 0;
            } else {
                tax = (getIncome() - getExpenses()) * 15 / 100;
            }

        }
        return tax;
    }
}