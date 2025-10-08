package Nhan2So;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputUI implements InputInterface{
	private Scanner in;
	private PrintWriter out;

	public InputUI(Scanner in, PrintWriter out) {
		this.in = in;
		this.out = out;
	}
	
	@Override
	public InputData input() {
		out.print("Nhap so dau tien :");
		out.flush();
		int num1 = in.nextInt();
		out.print("Nhap so thu 2 :");
		out.flush();
		int num2 = in.nextInt();
		InputData input =new InputData(num1, num2);
		return input;
	}
}
