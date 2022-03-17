import org.junit.jupiter.api.Assertions;
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
    public void setIncomeTaxTestTest (float newIncome, float expected) {
        TaxCalculation account = new TaxCalculation();
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
    public void setExpensesTaxTest(float newIncome, float newExpenses, float expected) {
        TaxCalculation account = new TaxCalculation();
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
            "500,-500,0",
            "268,-587,0",
            "1000,500,75",
            "-154,-158,0",
            "25.25,-68,0",
            "-59.25,698,0"


    })
    public void ExpensesTaxTest(float newIncome, float newExpenses, float expected) {
        TaxCalculation account = new TaxCalculation();
        account.setIncome(newIncome);
        account.setExpenses(newExpenses);

        float actual = account.expensesTax( account.setIncome(newIncome), account.setExpenses(newExpenses));
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
    public void incomeTaxTest(float newIncome, float expected, float income) {
        TaxCalculation account = new TaxCalculation();
        account.setIncome(newIncome);


        float actual = account.incomeTax(account.setIncome(newIncome));
        Assertions.assertEquals(expected, actual);

    }

}
