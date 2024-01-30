import java.util.Scanner;
public class employee extends showroom implements utility {
    String emp_name;
    String emp_id;
    String emp_address;

    @Override
    public void get_detail() {
        System.out.println("Employee name "+emp_name);
        System.out.println("Employee Id "+emp_id);
        System.out.println("Employee address "+emp_address);
    }

    @Override
    public void set_detail() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        emp_name=sc.nextLine();
        System.out.println("enter address");
        emp_address=sc.nextLine();
        System.out.println("Enter the ID");
        emp_id=sc.nextLine();
    }
}
