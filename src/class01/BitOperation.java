package class01;

public class BitOperation {
    public static void  print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print( (num & (1<<i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public  static void main(String[] args) {
        // 32位
        int num = 1;
        print(num);
    }
}
