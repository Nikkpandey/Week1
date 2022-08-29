import java.io.*;
public class VowConst {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the element: ");
		char ch=(char)br.read();
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+" is a vowel");
		}
		else
			System.out.println(ch+" is a consonant");

	}

}
