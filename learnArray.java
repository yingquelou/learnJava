import java.util.Random;

public class learnArray {

  // 数组
  public static void main(String[] args) {
    Random r = new Random();
    // 动态初始化
    int[] arr = new int[3];
    // int arr[] = new int[3];//也可以这样定义
    for (int i = 0; i < arr.length; ++i) {
      arr[i] = r.nextInt(10);
    }
    for (int i : arr) {
      System.out.println(i);
    }
    System.out.println("----------");
    // 静态初始化
    int[] arr2 = new int[] { 1, 2, 3 };
    // int[] arr2 = { 1, 2, 3 };//或者
    for (int i : arr2) {
      System.out.println(i);
    }
  }
}
