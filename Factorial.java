import java.io.*;
public class Factorial {

	public static void main(String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number: ");
        int num=Integer.parseInt(br.readLine());
        
        int fact=1;
        for(int i=1; i<=num; i++)
        {
        	fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
	}

}
