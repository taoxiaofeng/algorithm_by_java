import java.util.Scanner;
public class SwitchDemo {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    // System.out.println("请输入一个整数 (1-7) 代表星期几:");

    // int day = scanner.nextInt();
    // String dayName;

    // switch (day) {
    //   case 1:
    //     dayName = "Monday";
    //     break;
    //   case 2:
    //     dayName = "Tuesday";
    //     break;
    //   case 3:
    //     dayName = "Wednesday";
    //     break;
    //   case 4:
    //     dayName = "Thursday";
    //     break;
    //   case 5:
    //     dayName = "Friday";
    //     break;
    //   case 6:
    //     dayName = "Saturday";
    //     break;
    //   case 7:
    //     dayName = "Sunday";
    //     break;
    //   default:
    //     dayName = "Invalid day";
    //     break;
    // }

    // System.out.println("The day is: " + dayName);

    System.out.println("请输入一个月份 (1-12):");
    int month = scanner.nextInt();

    // case 穿透
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println(month + " 月有 31 天");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println(month + " 月有 30 天");
        break;
      case 2:
        System.out.println(month + " 月有 28 或 29 天");
        break;
      default:
        System.out.println("输入月份无效");
        break;
    }
  }
}
