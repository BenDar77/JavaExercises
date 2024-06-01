public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("1", "Walter White", 1200);
        Account a2 = new Account("2", "Jesse Pinkman", 1300);


        System.out.println("Transfer Operation:");
        a1.transferTo(a2, 500);

        System.out.println("Initial Balances:");
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

        System.out.println("Account Details:");
        System.out.println(a1.getId());
        System.out.println(a1.getName());
        System.out.println(a2.getId());
        System.out.println(a2.getName());

        System.out.println("Account Objects:");
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("Credit Operations:");
        a1.credit(1000);
        a2.credit(1000);

        System.out.println("Debit Operations:");
        a1.debit(2000);
        a2.debit(3000);

        System.out.println("Before transfer Balances:");
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

        System.out.println("Final Balances:");
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
}