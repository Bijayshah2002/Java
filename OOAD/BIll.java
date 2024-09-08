class Bill {
    private String Bill_no;
    private String Mobile_number;
    private double Amount;

    public Bill(String bill_no, String mobileNumber, double amount) {
        Bill_no = bill_no;
        Mobile_number = mobileNumber;
        Amount = amount;
    }

    public void set(String bill_no, String mobileNumber, double amount) {
        Bill_no = bill_no;
        Mobile_number = mobileNumber;
        Amount = amount;
    }

    public void display() {
        System.out.println("Bill No: " + Bill_no + ", Mobile Number: " + Mobile_number + ", Amount: " + Amount);
    }
}
