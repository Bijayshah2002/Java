import java.util.ArrayList;
class Person {
    private String id;
    private String name;
    private ArrayList<Mobile> mobiles = new ArrayList<>(); 

    public Person(String id, String name) {
        this.id = id;
        this.name = name; 
    }

    public void set(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addMobile(Mobile mobile) {
        if (mobiles.size() < 2) {
            mobiles.add(mobile);
        } else {
            System.out.println("A person can own 1 or 2 mobiles.");
        }
    }

    public void display() {
        System.out.println("Person ID: " + id + ", Name: " + name);
        for (Mobile mobile : mobiles) {
            mobile.display();
        }
    }
}