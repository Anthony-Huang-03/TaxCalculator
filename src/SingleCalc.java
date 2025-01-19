public class SingleCalc {
    private double income;
    private double remainingIncome;
    private double tax;


    protected SingleCalc(double income) {
        this.income = income;
        this.remainingIncome = income;
        this.tax = 0;
    }

    protected double getIncome() {
        return income;
    }

    protected void setIncome(double income) {
        this.income = income;
    }

    protected double calculateTaxedIncome() {
        if (remainingIncome > 626350) {
            tax = tax + ((remainingIncome - 626350) * 0.37);
            System.out.println(tax);
            remainingIncome = 626350;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 250525) {
            tax = tax + ((remainingIncome - 250525) * 0.35);
            System.out.println(tax);
            remainingIncome = 250525;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 197300) {
            tax = tax + ((remainingIncome - 197300) * 0.32);
            System.out.println(tax);
            remainingIncome = 197300;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 103350) {
            tax = tax + ((remainingIncome - 103350) * 0.24);
            System.out.println(tax);
            remainingIncome = 103350;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 48475) {
            tax = tax + ((remainingIncome - 48475) * 0.22);
            System.out.println(tax);
            remainingIncome = 48475;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 11925) {
            if (income < 14600) {
                tax = 0;
                return tax;
            }
            tax = tax + ((remainingIncome - 11925) * 0.12);
            System.out.println(tax);
            remainingIncome = 11925;
            calculateTaxedIncome();
            return tax;

        } else {
            if (income < 14600) {
                tax = 0;
                return tax;
            }
            tax = tax + (remainingIncome * 0.10);
            System.out.println(tax);
            return tax;
        }
    }
}
