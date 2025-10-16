package Lab4;

public class MyHrDriver {
    public static void main(String[] args) {
        Address address = new Address("Main St", "Springfield", "Greene");
        Office office = new Office("GreenTechHQ", "Building A");
        Manager employee = new Manager("Charlie Brown", "Sedan", "211 D 2452", 10000 ,address, office);

        System.out.println(employee.toString());
        System.out.println();

        Address address2 = new Address("Green St", "Clohaman", "Waterford");
        Office office2 = new Office("GreenTechHQ", "Building A");
        Staff employee2 = new Staff("Ethan Payne", address2, office2);

        System.out.println(employee2.toString());

    }
}
