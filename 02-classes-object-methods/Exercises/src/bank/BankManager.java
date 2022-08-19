package bank;

public class BankManager {
    // A bank manager has an additional method allowing them to access the vault;

    public void accessVault(Bank bank) {
        bank.accessVault();
    }

    // No longer need this.
    //    public static void main(String[] args) {
    //        Bank myBank = new Bank();
    //        System.out.println(myBank.getVault());
    //    }
}
