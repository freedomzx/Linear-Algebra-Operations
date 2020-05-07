import java.util.Scanner;
@SuppressWarnings("unused")

public class driver{
	public static void main(String[] args) {
		System.out.print("What operation do you want?\nType \"help\" for list of commands.\nOperation: ");
		Scanner in = new Scanner(System.in);
		String command = in.next();
		if(command.contentEquals("multiply")) operations.multiply();
		in.close();
	}
}