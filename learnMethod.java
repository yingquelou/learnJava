import java.util.Scanner;

public class learnMethod {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = 0;
    while (s.hasNextInt()) {
      num = s.nextInt();
      IsSingle(num);
    }
    s.close();
    System.out.println(ADD(num, 1.0));
    showArray(new int[] { 1, 2 });
  }

  // 方法定义
  // 基本数据类型的形参只是实参的临时拷贝
  // 类似C语言中的传值调用
  // 而引用类型类似于传址调用,比如数组名
  public static void IsSingle(long num) {
    if (num % 2 == 1) {
      System.out.println(num + "是奇数");
    } else {
      System.out.println(num + "是偶数");
    }
  }

  // 方法重载
  public static double ADD(double num1, double num2) {
    System.out.println("doule");
    return num1 + num2;
  }

  public static int ADD(int num1, int num2) {
    System.out.println("int");
    return num1 + num2;
  }

  public static void showArray(int[] arr) {
    if (arr.length < 1) {
      System.out.println("arr is Invalid");
    } else {
      System.out.print("[");
      for (int i = 0; i < arr.length; ++i) {
        if (i == arr.length - 1) {
          System.out.println(arr[i] + "]");
        } else {
          System.out.print(arr[i] + ", ");
        }
      }
    }
  }
}
