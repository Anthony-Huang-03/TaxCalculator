public class MFJCalc {
    private double income;
    private double remainingIncome;
    private double tax;


    protected MFJCalc(double income) {
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
        if (remainingIncome > 751600) {
            tax = tax + ((remainingIncome - 751600) * 0.37);
            System.out.println(tax);
            remainingIncome = 751600;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 501050) {
            tax = tax + ((remainingIncome - 501050) * 0.35);
            System.out.println(tax);
            remainingIncome = 501050;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 394600) {
            tax = tax + ((remainingIncome - 394600) * 0.32);
            System.out.println(tax);
            remainingIncome = 394600;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 206700) {
            tax = tax + ((remainingIncome - 206700) * 0.24);
            System.out.println(tax);
            remainingIncome = 206700;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 96950) {
            tax = tax + ((remainingIncome - 96950) * 0.22);
            System.out.println(tax);
            remainingIncome = 96950;
            calculateTaxedIncome();
            return tax;

        } else if (remainingIncome > 23850) {
            if (income < 29200) {
                tax = 0;
                return tax;
            }
            tax = tax + ((remainingIncome - 23850) * 0.12);
            System.out.println(tax);
            remainingIncome = 23850;
            calculateTaxedIncome();
            return tax;

        } else {
            if (income < 29200) {
                tax = 0;
                return tax;
            }
            tax = tax + (remainingIncome * 0.10);
            System.out.println(tax);
            return tax;
        }
    }
}
