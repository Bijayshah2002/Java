public class Main {
    public static void main(String[] args) {
        Person person = new Person("1", "Bijay Shah");
        
        Mobile mobile1 = new Mobile("1234567890", "Samsung");
        Mobile mobile2 = new Mobile("0987654321", "Apple");
        
        person.addMobile(mobile1);
        person.addMobile(mobile2);
        
        person.display();

        Bill bill = new Bill("001", "1234567890", 150.75);
        bill.display();
    }
}