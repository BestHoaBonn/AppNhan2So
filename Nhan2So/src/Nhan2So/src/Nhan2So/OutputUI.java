package Nhan2So;

import javax.swing.JOptionPane;

public class OutputUI implements OutputInterface {

    @Override
    public void output(OutputData data) {
        JOptionPane.showMessageDialog(null, "Kết quả: " + data.getResult());
    }
}
