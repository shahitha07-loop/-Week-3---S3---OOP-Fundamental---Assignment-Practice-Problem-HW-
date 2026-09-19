class PayrollAccount {
    // Private fields for encapsulation
    private double basicSalary;
    private double bonus;

    // Constructor validating initial basic salary
    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Invalid basic salary. Setting to 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }

    // Method to add bonus if amount > 0
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid bonus amount.");
        } else {
            this.bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    // Method to deduct tax by percentage if percent is within 0-100 range
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax percentage.");
        } else {
            this.basicSalary -= (this.basicSalary * percent / 100);
            System.out.println("Tax deducted: " + (int)percent + "%");
        }
    }

    // Read-only getter method for net salary
    public double getNetSalary() {
        return this.basicSalary + this.bonus;
    }
}

public class PayrollTest {
    public static void main(String[] args) {
        // Create PayrollAccount with opening basic salary of 50000
        PayrollAccount account = new PayrollAccount(50000);

        // Credit bonus of 5000
        account.creditBonus(5000);

        // Deduct tax of 10%
        account.deductTax(10);

        // Print final net salary
        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}