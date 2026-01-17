import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {

    // 创建对象
    Scanner scanner = new Scanner(System.in);

    // 接收身高数据
    System.out.println("Please enter three heights:");
    int height1 = scanner.nextInt();
    System.out.println("Enter second height:");
    int height2 = scanner.nextInt();
    System.out.println("Enter third height:");
    int height3 = scanner.nextInt();

    // 计算最高身高
    int tempHeight = height1 > height2 ? height1 : height2;
    int maxHeight = tempHeight > height3 ? tempHeight : height3;

    // 输出最高身高
    System.out.println("The tallest height is: " + maxHeight);
    
    
  }
}
