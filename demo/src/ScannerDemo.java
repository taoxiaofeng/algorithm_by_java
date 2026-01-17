import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    // 创建对象
    Scanner scanner = new Scanner(System.in);

    // 接收数据
    int text = scanner.nextInt();

    // 输出数据
    System.out.println("You entered: " + text);

  }
}
