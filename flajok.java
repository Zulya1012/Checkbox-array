import java.util.Scanner;
public class flajok{
	public static void main (String[] arg){
		int checkbox=0;
		String username []={"One", "Two", "Three", "Four", "Five"};
		Scanner s=new Scanner(System.in);
		String number=s.nextLine();
		for (int i=0; i<username.length; i++){
			if (username[i].equals(number)){
				checkbox=1;
				System.out.println("This number is in the array");
				break;
			}
		}
		if (checkbox==0)
			System.out.println("This number isn't in the array");
	}
}