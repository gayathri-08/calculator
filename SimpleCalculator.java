import java.util.Scanner;
public class SimpleCalculator{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fm;
    int sm;
    char operator;
    System.out.println("Write the first number");
    fm = sc.nextInt();
    System.out.println("Write the second number");
    sm = sc.nextint();
    System.out.println("write operation");
    c=sc.next().charAt(0);
    switch(c) {
    case '+': Add(fm, sm);
            break;
    case '-':Sub(fm, sm);
            break;
    case '*': Mult(fm, sm);
            break;
    case '/': div(fm,sm);
            break;
    default:
           System.out.printf("You have entered wrong operator");
                }
  }
    static void Add( int fm, int sm ) {
        System.out.println("Addition = " + (fm + sm));
    }
    static void Sub( int fm, int sm ) {
        System.out.println("Substratcion = " + (fm - sm));
    }
    static void Mul( int fm, int sm ) {
        System.out.println("Multiplication = " + (fm * sm));
    }
    static void div( int fm, int sm) {
        System.out.println("Division= "+(fm / sm));
    }
}
