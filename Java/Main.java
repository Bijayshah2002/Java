
import java.util.Scanner;

interface utility
{
public void set_detail();
public void get_detail();
}

public class Main
{
public static void main(String[] args) {
play p=new play();
Scanner sc=new Scanner(System.in);
showroom []s=new showroom[5];
car []c=new car[5];
employee []e=new employee[5];
int car_counter=0;
int showroom_counter=0;
int employee_counter=0;
int option;
System.out.println("Enter your choice");
 option=p.menu();
while(option!=0){
if (option==1)
{
    s[showroom_counter]=new showroom();
s[showroom_counter].set_detail();
showroom_counter++;
option=p.menu();
} else if (option==2) {
c[car_counter].set_detail();
car_counter++;
option=p.menu();

} else if (option==3) {
for (int i=0;i<showroom_counter;i++)
{
s[i].get_detail();
}
option=p.menu();
}
else{
    System.out.println("invalid number entered.Please select");
    option=p.menu();
}
}

}
}
class play
{
int menu()
{
    Scanner sc=new Scanner(System.in);
System.out.println("1.Add showroom\t\t\t 2.Add car\t\t\t 3.showroom details\t\t\t 0.exit");
int x=sc.nextInt();
return x;

}
}  