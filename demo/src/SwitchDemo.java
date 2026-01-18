import java.util.Scanner;
public class SwitchDemo {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("请输入一个整数 (1-7) 代表星期几:");

    int day = scanner.nextInt();
    String dayName;

    switch (day) {
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;
      default:
        dayName = "Invalid day";
        break;
    }

    System.out.println("The day is: " + dayName);
  }
}
