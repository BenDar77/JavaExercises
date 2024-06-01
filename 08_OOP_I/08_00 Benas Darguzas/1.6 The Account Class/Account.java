public class Account {

    private final String id;
    private final String name;
    private int balance;


    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }


    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getBalance() {
        return balance;
    }


    public void credit(int newAmount) {
        this.balance += newAmount;
        System.out.println("Adding " + newAmount + " to " + name + "'s account. New balance is: " + this.balance);
    }


    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited " + amount + " from " + name + "'s account. New balance is: " + this.balance);
        } else {
            System.out.println("Amount exceeded balance for " + name + "'s account");
        }
    }


    public void transferTo(Account account, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            account.credit(amount);
            System.out.println("Transferred " + amount + " to " + account.getName() + "'s account. New balance is: " + this.balance);
        } else {
            System.out.println("Amount exceeded balance for transfer from " + name + "'s account");
        }
    }


    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
