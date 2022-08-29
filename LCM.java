import java.io.*;
public class LCM {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the numbers: ");
		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		
		int lcm;
		lcm=(num1 > num2)? num1 : num2;
		
		for( ; ; )
		{
			if(lcm % num1==0 && lcm % num2 == 0)
			{
				break;
			}
			lcm= lcm+1;
		}
		System.out.println("The LCM of "+num1+" and "+num2+" is: "+lcm);

	}

}
