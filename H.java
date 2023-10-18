	//LinkedList
import java.util.*;
public class H {
				private String add;
				public H (String i){
								this.add = i;
				}
				public String myadd (){
								return add;
				}
				public String toString(){
								return "Your data: "+ add;
				}
				public void ln(String ln){
								System.out.println(ln);
				}
				public void l(String l){
								System.out.print(l);
				}
				public static void main(String[] args) {
							//	System.out.println("Hello, World!");
								LinkedList <String> mylink = new LinkedList <> ();
								Scanner scan = new Scanner (System.in);
								while(true){
												System.out.println("\n\t\t LINKEDLIST");
								System.out.println("\t1. Add");
								System.out.println("\t2. Delete");
							System.out.println("\t3. Update");
							System.out.println("\t4. Display");
												System.out.println("\t5. Exit");
								System.out.print("Enter a number: ");
								String ak = scan.nextLine();
								
								switch(ak){
												case "1":
												System.out.println("\t\tAdd");
												System.out.print("Please Enter: ");
												String en = scan.nextLine();
												mylink.add(en);
												break;
												case "2":
												System.out.println("\t\tDelete");
												System.out.print("Enter the element to remove: ");
												String ko = scan.nextLine();
												mylink.remove(ko);
												break;
												case "3":
												System.out.print("Enter the element you want to update: ");
												String ind = scan.nextLine();
												mylink.remove(ind);
												System.out.print("Enter a new data: ");
												String da = scan.nextLine();
												mylink.add(da);
												break;
												case "4":
												for(String ij: mylink){
																System.out.println(ij);
												}
												break;
												case "5":
												System.exit(0);
												break;
								}
								}
				}
				
}