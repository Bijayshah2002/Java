class Mobile {
    private String number;
    private String brand;

    public Mobile(String number, String brand) {
        this.number = number;
        this.brand = brand;
    }

    public void set(String number, String brand) {
        this.number = number;
        this.brand = brand;
    }

    public void display() {
        System.out.println("Mobile Number: " + number + ", Brand: " + brand);
    }
}