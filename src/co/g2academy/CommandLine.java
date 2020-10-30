package co.g2academy;

public class CommandLine{
 	public static void main(String[] args) {
		for(int i = 0 ; i < args.length; i++) {
			System.out.println("This is args No " + i + " : " + args[i]);
		}

	}
}