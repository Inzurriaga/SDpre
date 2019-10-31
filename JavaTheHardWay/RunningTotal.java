import java.util.Scanner;

public class RunningTotal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int current, total = 0;

    System.out.print("Type in a bunch of values and I'll add them up. ");
    System.out.println("I'll stop when you type a zero.");

    // current = 0;
    // while(current != 0) {
    //   System.out.print("Value: ");
    //   current = input.nextInt();
    //   total += current;
    //   System.out.println("the total so far is: " + total);
    // }

    do {
      System.out.print("Value: ");
      current = input.nextInt();
      total += current;
      if(current != 0)
        System.out.println("the total so far is: " + total);
    } while(current != 0);

    System.out.println("The final total is: " + total);
  }
}