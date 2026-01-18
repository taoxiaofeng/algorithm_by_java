import java.util.Scanner;

public class IfTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // System.out.println("请输入一个整数:");
    // int number = scanner.nextInt();

    // if(number % 2 == 0) {
    //   System.out.println(number + " 是偶数");
    // } else {
    //   System.out.println(number + " 是奇数");
    // }

    System.out.println("请输入一个分数:");
    int score = scanner.nextInt();
    if(score < 0 || score > 100) {
      System.out.println("输入分数无效");
      return;
    }
    if(score >= 95 && score <= 100) {
      System.out.println("优秀");
    } else if(score >= 90 && score <= 94) {
      System.out.println("良好");
    } else if(score >= 80 && score <= 89) {
      System.out.println("中等");
    } else if(score >= 60) {
      System.out.println("及格");
    } else {
      System.out.println("不及格");
    }
  }
}
