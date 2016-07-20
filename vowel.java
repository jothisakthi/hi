import java.util.Scanner;


public class vowel
{
public static void main(String args[])
{
char ch;
Scanner s=new Scanner(System.in);
ch = s.next().charAt(0);
	if(ch=='a'||ch=='A'||ch=='E'||ch=='e'||ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='u'||ch=='U')
	{
	System.out.println("vowel");
	}
	else
	{
		System.out.println("consonant");
}
}}