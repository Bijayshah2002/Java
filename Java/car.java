import java.util.Scanner;
public class car extends showroom implements utility {
    String car_name;
    String car_color;
    String fuel_type;
    int car_price;
    String car_type;
    String car_transmmision;

    public void set_detail() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter car name");
        car_name=sc.nextLine();
        System.out.println("Enter car color");
        car_color=sc.nextLine();
        System.out.println("enter fuel type");
        fuel_type=sc.nextLine();
        System.out.println("Enter car price");
        car_price=sc.nextInt();
        System.out.println("Enter the car transmission");
        car_transmmision=sc.nextLine();
        System.out.println("Enter the car typr ");
        car_type=sc.nextLine();
    }

    public void get_detail()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Car name "+car_name);
        System.out.println("Enter car color "+car_color);
        System.out.println("enter fuel type "+fuel_type);
        System.out.println("Enter car price "+car_price);
        System.out.println("Enter the car transmission "+car_transmmision);
        System.out.println("Enter the car type "+car_type);
    }
}