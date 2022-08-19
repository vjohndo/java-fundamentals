public class LearnStrings {
    public static void main(String[] args) {
        String fruit = "apple"; // Object of type string. Java allocates the word in memory and the address gets stored in variable.
        String anotherFruit = "apple"; // will end up taking the same reference as "fruit"

        String vegetable = new String("broccoli"); // will create a new instance
        String anotherVegetable = new String("broccoli"); // will create a new instance

        System.out.println(fruit == anotherFruit); // checking if the address i.e. ref is the same ==> true
        System.out.println(vegetable == anotherVegetable); // checking if the address i.e. ref is the same ==> false
    }
}