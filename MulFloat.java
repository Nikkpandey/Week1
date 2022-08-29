import java.io.*;
public class MulFloat {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter 1st Float number: ");
		float f1=Float.parseFloat(br.readLine());
		
		System.out.print("Enter 2nd Float number: ");
		float f2=Float.parseFloat(br.readLine());
		
		System.out.println("Sum= "+(f1+f2));
		

	}

}
