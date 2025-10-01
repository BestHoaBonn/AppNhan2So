package Nhan2So;
import javax.swing.*;
import javax.swing.JOptionPane;

public class uI implements InputInterface{

	@Override
	public InputData input() {
		// TODO Auto-generated method stub
		String strNum1 = 
				JOptionPane.showInputDialog("[Nhap so dau tien ]");
		String strNum2 = 
				JOptionPane.showInputDialog("[Nhap so thu 2 ]");
		
		InputData inData = new InputData
				(Integer.parseInt(strNum1), 
						Integer.parseInt(strNum2));
		return inData;
	}

}
