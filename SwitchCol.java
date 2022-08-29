import java.io.*;
public class SwitchCol {

	public static void main(String[] args)throws IOException 
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.print("Enter the character: ");
	 char color=(char)br.read();
	 
	 switch(color)
	 {
	 case 'r': System.out.println("Red");
	  break;
	 case 'b': System.out.println("Blue");
	  break;
	 case 'g': System.out.println("Green");
	  break;
	 case 'y': System.out.println("Yellow");
	  break;
	 default : System.out.println("No color");
	 }

	}

}
