public class TaxCalculation implements AccountNP {


    private float income;
    private float expenses;
    private float tax;


    public float getIncome() {
        return income;
    }

    public float getExpenses() {
        return expenses;
    }

    @Override
    public float setIncome(float newIncome) {
        if (newIncome < 0) {
            System.out.println("Введите корректный доход");
        } else {
            this.income = newIncome;
        }
        return newIncome;
    }


    @Override
    public float setExpenses(float newExpenses) {
        if (newExpenses < 0) {
            System.out.println("Введите корректный доход");
        } else {
            this.expenses = newExpenses;
        }

        return newExpenses;
    }

    public float incomeTax(float newIncome) {
        setIncome(newIncome);
        if (getIncome() == 0) {
            tax = 0;
        } else {
            tax = getIncome() * 6 / 100;
        }
        return tax;
    }

    public float expensesTax(float newIncome, float newExpenses) {
        setIncome(newIncome);
        setExpenses(newExpenses);
        if (getIncome() == 0 || getExpenses() == 0) {
            tax = 0;
        } else {
            if (getIncome() - getExpenses() == 0) {
                tax = 0;
            } else {
                tax = (getIncome() - getExpenses()) * 15 / 100;
            }
        }
        return tax;
    }
}
