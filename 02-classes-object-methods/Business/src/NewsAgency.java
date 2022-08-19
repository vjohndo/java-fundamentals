import otherPackage.Company;

public class NewsAgency {
    Company company;
    String name;

    public void accessMethod() {
        Person person = new Person();
        person.lastName = "tom"; // if you make a field public you can access from another class
        person.dob = "321"; // if you make a field protected you can access from the sme package
    }
}
