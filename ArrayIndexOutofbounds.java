import java.util.*;
public class ArrayIndexOutofbounds {
				
						
				public static void main(String[] args) {
								Scanner scan = new Scanner (System.in);
								int [] ma = new int [2];
								try{
												System.out.print("Enter a range to iterate: ");
												int g = scan.nextInt();
												for(int i = 0; i<g; i++){
								System.out.print("Enter an integer element: ");
								ma [i]= scan.nextInt();
												}
								}
								catch(InputMismatchException e){
												System.out.println("\n\tYou can't enter String here");
								}
								catch (ArrayIndexOutOfBoundsException e){
												System.out.println("\n\tArray index is out of Bounds");
								}
								finally{
												System.out.println("\n\tThe range of the Index is only 2");
								}
				}
}