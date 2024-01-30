import java.util.Scanner;

public class showroom implements utility{
    String showroom_name;
    String showroom_address;
    String Manager_name;
    int total_number_of_employee;
    int total_car_in_stock=0;

    @Override
    public void set_detail() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the showroom name");
        showroom_name=sc.nextLine();
        System.out.println("Enter the showroom address");
        showroom_address=sc.nextLine();
        System.out.println("enter Manager name");
        Manager_name=sc.nextLine();
        System.out.println("enter the car in stock");
        total_car_in_stock=sc.nextInt();
        System.out.println("Enter the number of employees");
        total_number_of_employee=sc.nextInt();
    }

    public void get_detail()
    {
        System.out.println("showroom name "+showroom_name);
        System.out.println("showroom_address "+showroom_address);
        System.out.println("Manger_name" +Manager_name);
        System.out.println("Total no. of employees "+total_number_of_employee);
        System.out.println("Total car in stock "+total_car_in_stock);
        System.out.println("\n");
    }
}



