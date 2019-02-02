import java.util.Scanner;
class PrintingPyramid {
 public static void main(String[] args) {
  int a, b, n;
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter number of steps:");
  n = scan.nextInt();
  scan.close();
  for (a=1; a<=n; a++){
	   for (b=a; b<n; b++)
	    System.out.print(" ");
	   for (b=1; b<=a; b++)
	    System.out.print(b);
	   for (b = a - 1; b >= 1; b--)
	    System.out.print(b);
        System.out.print("\n");
  }}}


