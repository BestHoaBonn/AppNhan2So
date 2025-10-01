package Nhan2So;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppNhan2So {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		InputInterface inWrapper = (InputInterface) new uI();
		OutputInterface outWrappter = (OutputInterface) new OutputUI();

		Nhan2So nhan2So = new Nhan2So();
		
		Nhan2SoUseCaseControl control = new Nhan2SoUseCaseControl(inWrapper, outWrappter, nhan2So);
		control.execute();
	}
}
