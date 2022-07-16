public class ATMsynchronization {
    public static void main(String[] args) {
        ATM at = new ATM();
        Customer a = new Customer("man", 5000, at);
        Customer b = new Customer("op", 1000, at);
        Customer c = new Customer("dp", 800, at);

        a.start();
        b.start();
        c.start();
    }

}

class ATM {
    synchronized public void withdraw(String name, int bal) {

        System.out.println(name + " is withdrawing ");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        System.out.println(bal + " amount of money");
    }

    synchronized public void checkBalance(String name) {
        System.out.println(name + " is checking ");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        System.out.println("balance");
    }
}

class Customer extends Thread {
    String name;
    int amount;
    ATM atm;

    Customer(String n, int amt, ATM a) {
        name = n;
        atm = a;
        amount = amt;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}
// OUTPUT:-
// op is checking
// dp is checking
// man is checking
// balance
// op is withdrawing
// balance
// dp is withdrawing
// balance
// man is withdrawing
// 1000 amount of money
// 800 amount of money
// 5000 amount of money
// [Finished in 2.16s]

// man is checking
// balance
// man is withdrawing
// 5000 amount of money
// dp is checking
// balance
// dp is withdrawing
// 800 amount of money
// op is checking
// balance
// op is withdrawing
// 1000 amount of money
// [Finished in 2.39s]