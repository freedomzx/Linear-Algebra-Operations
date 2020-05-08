import java.util.Scanner;
@SuppressWarnings("unused")

public class driver{
	static String commands = "\"help\", \"quit\"\n\"multiply\", \"add\", \"subtract\"\n\"transpose\", \"rref\" ";
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("What operation do you want?\nType \"help\" for list of commands.\nOperation: ");
			String command = in.next();
			if(command.contentEquals("help")) System.out.println(commands);
			else if(command.contentEquals("add")) basicOperations.add(in);
			else if(command.contentEquals("subtract")) basicOperations.subtract(in);
			else if(command.contentEquals("multiply")) basicOperations.multiply(in);
			else if(command.contentEquals("transpose")) transformations.transpose(in);
			else if(command.contentEquals("quit")) break;
			else System.out.println("Unknown command... Please try again.");
		}
		in.close();
	}
}