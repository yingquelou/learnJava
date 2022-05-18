import java.util.Random;

public class learnRandom {

  public static void main(String[] args) {
    Random r = new Random();
    double num = r.nextDouble() * 10;
    System.out.println("The number is " + num);
  }
}
