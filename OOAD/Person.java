import java.util.ArrayList;
import java.util.List;

class Person {
    private String id;
    private String name;
    private List<Mobile> mobiles; // List to store 1 to 2 Mobile objects

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
        this.mobiles = new ArrayList<>(); // Initialize the list
    }

    public void set(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addMobile(Mobile mobile) {
        if (mobiles.size() < 2) {
            mobiles.add(mobile);
        } else {
            System.out.println("A person can own a maximum of 2 mobiles.");
        }
    }

    public void display() {
        System.out.println("Person ID: " + id + ", Name: " + name);
        for (Mobile mobile : mobiles) {
            mobile.display();
        }
    }
}