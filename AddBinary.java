import java.io.*;
public class AddBinary {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter first binary number: ");
		String s1=br.readLine();
		
		System.out.print("Enter second binary number: ");
		String s2=br.readLine();
		
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
        int sum= n1+n2;
        
		System.out.println("Addition: "+Integer.toBinaryString(sum));

	}

}
