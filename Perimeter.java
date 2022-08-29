import java.io.*;
public class Perimeter {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Length and Breadth of rectangle: ");
		int len=Integer.parseInt(br.readLine());
		int brth=Integer.parseInt(br.readLine());
		
		int pmeter=2*(len+brth);
		
		System.out.println("Perimeter of rectangle= "+pmeter);

	}

}
