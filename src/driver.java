import java.util.Scanner;
@SuppressWarnings("unused")

public class driver{
	static String commands = "\"help\", \"quit\", \"multiply\"";
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("What operation do you want?\nType \"help\" for list of commands.\nOperation: ");
			String command = in.next();
			if(command.contentEquals("help")) System.out.println(commands);
			else if(command.contentEquals("multiply")) operations.multiply(in);
			else if(command.contentEquals("quit")) break;
		}
		in.close();
	}
}