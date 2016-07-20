import java.util.Scanner;


public class alphabet {
	public static void main(String args[]){
		char ch;
		Scanner a=new Scanner(System.in);
		ch=a.next().charAt(0);
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
		{
			System.out.println("the given no is an alphabet");
		}
		else
		{
			System.out.println("the given no is not a alphabet");
		}
	}

}
