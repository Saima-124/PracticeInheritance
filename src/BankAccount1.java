public class BankAccount1 {

        private double balance;

        public BankAccount1(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public boolean deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                return true;
            } else {
                return false;
            }
        }

        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        }
    }


