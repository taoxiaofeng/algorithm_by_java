public class OperatorTest {
  public static void main(String[] args) {
    // int weight1 = 180;
    // int weight2 = 220;

    // boolean isHeavier = weight1 == weight2 ? true : false;

    // System.out.println("Is weight2 heavier than weight1? " + isHeavier);

    int height1 = 150;
    int height2 = 210;
    int height3 = 165;

    int tempHeight = height1 > height2 ? height1 : height2;
    int maxHeight = tempHeight > height3 ? tempHeight : height3;

    System.out.println("The tallest height is: " + maxHeight);
    
  }
}
