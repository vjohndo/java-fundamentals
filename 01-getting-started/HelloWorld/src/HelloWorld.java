import model.Person;
import java.time.LocalDate;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Person johnny = new Person("johnny", "smith", LocalDate.of(200, 11, 1));
        // Could allow amy to create Person.

        System.out.format("The person's first name is: %s.", johnny.getFirstName());
    }
}
