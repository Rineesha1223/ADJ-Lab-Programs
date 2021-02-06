package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket s = new Socket("Localhost",2002);
		DataInputStream din = new DataInputStream(s.getInputStream());
		PrintStream pw = new PrintStream(s.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers and operand with space(operand operand operator):");
		String num = sc.nextLine();
		
		String str = String.valueOf(num);
		pw.println(str);
		System.out.println("Answer is:"+ din.readLine());
		
		
		s.close();
		sc.close();
	}

}
