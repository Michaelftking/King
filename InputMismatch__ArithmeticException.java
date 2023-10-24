import java.util.*;
public class InputMismatch__ArithmeticException {
				public static void main(String[] args) {
								Scanner scan = new Scanner (System.in);
								int a;
								System.out.println("\tDivide\n");
							try{
								System.out.print("Enter 1st number ");
								int str = scan.nextInt();
											System.out.print("Enter 2nd number: ");
											int num = scan.nextInt();
								a = str / num;
												System.out.println(str + " / " + num + " = " + a);
							}
								catch (InputMismatchException e){
												System.out.println("You can't enter String here Lol");
							}
								catch(ArithmeticException e){
												System.out.println("You can't divide a number by zero");
								}
								finally{
												System.out.println("\n\tThe end");
								}
				}
				
}