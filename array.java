import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		//String s0="Hello world";
		String[] st = s.split(" ",0);
		for(int i=0;i<st.length;i++)
			System.out.println(st[i]);
		String s1 = String.join(" ", st);
		System.out.println(s1);
	}
}
