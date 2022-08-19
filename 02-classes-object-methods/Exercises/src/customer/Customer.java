package customer;

import bank.Bank;
import bank.BankManager;

public class Customer {
    private String name;
    private int deposit;

    public Customer(String name, int deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public void accessVault(Bank bank) {
//        bank.accessVault();
    }


    public static void main(String[] args) {
        Bank myBank = new Bank();
        Customer myCustomer = new Customer("John", 5000);
        BankManager myBankManager = new BankManager();

        myBankManager.accessVault(myBank);
        myCustomer.accessVault(myBank);

        // Customer john = new Customer(); ==> requires arguments
        // System.out.println(myBank.getVault()); ==> had protected access
    }
}
