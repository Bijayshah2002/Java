class Bill {
    private String billNo;
    private String mobileNumber;
    private double amount;

    public Bill(String billNo, String mobileNumber, double amount) {
        this.billNo = billNo;
        this.mobileNumber = mobileNumber;
        this.amount = amount;
    }

    public void set(String billNo, String mobileNumber, double amount) {
        this.billNo = billNo;
        this.mobileNumber = mobileNumber;
        this.amount = amount;
    }

    public void display() {
        System.out.println("Bill No: " + billNo + ", Mobile Number: " + mobileNumber + ", Amount: " + amount);
    }
}
