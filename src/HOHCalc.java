public class HOHCalc {
    private double income;
    private double remainingIncome;
    private double tax;


    protected HOHCalc(double income) {
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

        } else if (remainingIncome > 250500) {
            tax = tax + ((remainingIncome - 250500) * 0.35);
            System.out.println(tax);
            remainingIncome = 250500;
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

        } else if (remainingIncome > 64850) {
            tax = tax + ((remainingIncome - 64850) * 0.22);
            System.out.println(tax);
            remainingIncome = 64850;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 17000) {
            if (income < 21900) {
                tax = 0;
                return tax;
            }
            tax = tax + ((remainingIncome - 17000) * 0.12);
            System.out.println(tax);
            remainingIncome = 17000;
            calculateTaxedIncome();
            return tax;

        } else {
            if (income < 21900) {
                tax = 0;
                return tax;
            }
            tax = tax + (remainingIncome * 0.10);
            System.out.println(tax);
            return tax;
        }
    }
}
