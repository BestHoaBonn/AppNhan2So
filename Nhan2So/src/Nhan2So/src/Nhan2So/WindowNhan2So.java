package Nhan2So;  
import javax.swing.*; 
import java.awt.*;     

public class WindowNhan2So extends JFrame {
    public WindowNhan2So() {
        this.setTitle("Nhân 2 số");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        khoiTao();
        this.setVisible(true);
    }

    private void khoiTao() {
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        JTextField tf1 = new JTextField(10);

        JLabel lblSo2 = new JLabel("Số thứ hai:");
        JTextField tf2 = new JTextField(10);

        JButton btnNhan = new JButton("Nhân");
        JLabel lblKetQua = new JLabel("Kết quả: ");

        setLayout(new GridLayout(3, 2, 5, 5));

        add(lblSo1);
        add(tf1);
        add(lblSo2);
        add(tf2);
        add(btnNhan);
        add(lblKetQua);

        btnNhan.addActionListener(e -> {
            try {
                double a = Double.parseDouble(tf1.getText());
                double b = Double.parseDouble(tf2.getText());
                lblKetQua.setText("Kết quả: " + (a * b));
            } catch (NumberFormatException ex) {
                lblKetQua.setText("Lỗi: nhập số hợp lệ!");
            }
        });
    }

    public static void main(String[] args) {
        new WindowNhan2So();
    }
}
