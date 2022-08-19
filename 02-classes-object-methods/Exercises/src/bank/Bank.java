package bank;

public class Bank {
    private String vault = "VAULT";

    // Alternative would be to use package protected.
    // Package protected prevents a subclass trying to access from a different package
    protected void accessVault() {
        System.out.println(this.vault);
    }
}
