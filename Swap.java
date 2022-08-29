import java.io.*;
public class Swap {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter 1st number: ");
		int n=Integer.parseInt(br.readLine());
		
		System.out.print("Enter 2nd number: ");
		int m=Integer.parseInt(br.readLine());
		
		int c;
		c=n;
		n=m;
		m=c;
		
		System.out.print("Swapped number: "+n+"\t"+m);
		

	}

}
