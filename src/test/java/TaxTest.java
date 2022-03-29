import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TaxTest {

    @ParameterizedTest
    @CsvSource(value = {
            "0,0",
            "500,500",
            "-500, 0",
            "0,0",
            "-500, 0",
            "0,0",
            "25, 25",
            "-258,0"
    })
    public void setIncomeTaxTestTest(double newIncome, double expected) {
        TaxCalculate account = new TaxCalculate();
        account.setIncome(newIncome);

        double actual = account.getIncome();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0,0,0",
            "500,500,500",
            "-500, 0,0",
            "500,-500,0",
            "-258,-256,0"

    })
    public void setExpensesTaxTest(double newIncome, double newExpenses, double expected) {
        TaxCalculate account = new TaxCalculate();
        account.setIncome(newIncome);
        account.setExpenses(newExpenses);

        double actual = account.getExpenses();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0,0,0",
            "500,500,0",
            "-500, 0,0",
            "500,-500,75",
            "268,-587,40.2",
            "1000,500,75",
            "-154,-158,0",
            "25.25,-68,3.7875",
            "-59.25,698,0",
            "150,250,0"


    })
    public void ExpensesTaxTest(double newIncome, double newExpenses, double expected) {
        TaxCalculate account = new TaxCalculate();
        account.setIncome(newIncome);
        account.setExpenses(newExpenses);

        double actual = account.expensesTax15();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0,0,0",
            "-500, 0,-500",
            "268,16.08,0",
            "1000,60,6",
            "-154,0,0"


    })
    public void incomeTaxTest(double newIncome, double expected, double income) {
        TaxCalculate account = new TaxCalculate();
        account.setIncome(newIncome);


        double actual = account.incomeTax6();
        Assertions.assertEquals(expected, actual);

    }

}


