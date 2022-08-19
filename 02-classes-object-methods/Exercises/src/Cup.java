public class Cup {
    private String name;
    private Boolean hasHandle;
    private Boolean isRound;

    public Cup () {};

    public Cup (String name, Boolean hasHandle, Boolean isRound) {
        this.name = name;
        this.hasHandle = hasHandle;
        this.isRound = isRound;
    }

    public Boolean isRound() {
        return this.isRound;
    }

    public static void main(String[] args) {
        Cup myCup = new Cup("big cup", true, false);
        System.out.println(myCup.isRound());
    }
}
