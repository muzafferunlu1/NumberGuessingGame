import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frm = new JFrame("SAYI TAHMİN OYUNU");
        frm.setBounds(0,0,800,600);
        frm.setLayout(null);

        Border br = BorderFactory.createLineBorder(Color.gray,2);

        JLabel lblName1 = new JLabel("1. Oyuncu Tahmini: ");
        lblName1.setBounds(100,100,120,30);
        lblName1.setForeground(Color.black);
        lblName1.setBackground(Color.CYAN);
        lblName1.setOpaque(true);
        lblName1.setBorder(br);
        frm.add(lblName1);

        JTextField txtName1 = new JTextField();
        txtName1.setBounds(225,100,120,30);
        txtName1.setBackground(Color.lightGray);
        txtName1.setBorder(br);
        frm.add(txtName1);

        JLabel lblName2 = new JLabel("2. Oyuncu Tahmini: ");
        lblName2.setBounds(400,100,120,30);
        lblName2.setForeground(Color.black);
        lblName2.setBackground(Color.CYAN);
        lblName2.setOpaque(true);
        lblName2.setBorder(br);
        frm.add(lblName2);

        JTextField txtName2 = new JTextField();
        txtName2.setBounds(525,100,120,30);
        txtName2.setBackground(Color.lightGray);
        txtName2.setBorder(br);
        frm.add(txtName2);

        JButton btnName1 = new JButton("BAŞLAT");
        btnName1.setBounds(335,160,80,30);
        btnName1.setBackground(Color.DARK_GRAY);
        btnName1.setForeground(Color.red);
        btnName1.setBorder(br);
        frm.add(btnName1);

        int sayi = (int)(Math.random()*10);

        JLabel lblName3 = new JLabel("Tahmin Sayisi");
        lblName3.setBounds(600,250,100,30);
        lblName3.setForeground(Color.black);
        lblName3.setBackground(Color.GREEN);
        lblName3.setOpaque(true);
        lblName3.setBorder(br);
        lblName3.setVisible(false);
        frm.add(lblName3);

        JLabel lblName4 = new JLabel(Integer.toString(sayi));
        lblName4.setBounds(620,280,60,20);
        lblName4.setForeground(Color.black);
        lblName4.setBackground(Color.WHITE);
        lblName4.setHorizontalAlignment(SwingConstants.CENTER);
        lblName4.setOpaque(true);
        lblName4.setBorder(br);
        lblName4.setVisible(false);
        frm.add(lblName4);

        JLabel lblName5 = new JLabel("1. Oyuncu Sonuç");
        lblName5.setBounds(150,350,100,30);
        lblName5.setForeground(Color.black);
        lblName5.setBackground(Color.CYAN);
        lblName5.setOpaque(true);
        lblName5.setBorder(br);
        lblName5.setVisible(false);
        frm.add(lblName5);

        JTextField txtName3 = new JTextField();
        txtName3.setBounds(150,380,100,30);
        txtName3.setBackground(Color.lightGray);
        txtName3.setForeground(Color.black);
        txtName3.setBorder(br);
        //txtName3.setEnabled(false);
        txtName3.setVisible(false);
        frm.add(txtName3);

        JLabel lblName6 = new JLabel("2. Oyuncu Sonuç");
        lblName6.setBounds(450,350,100,30);
        lblName6.setForeground(Color.black);
        lblName6.setBackground(Color.CYAN);
        lblName6.setOpaque(true);
        lblName6.setBorder(br);
        lblName6.setVisible(false);
        frm.add(lblName6);

        JTextField txtName4 = new JTextField();
        txtName4.setBounds(450,380,100,30);
        txtName4.setBackground(Color.lightGray);
        txtName4.setForeground(Color.black);
        txtName4.setBorder(br);
        //txtName4.setEnabled(false);
        txtName4.setVisible(false);
        frm.add(txtName4);

        btnName1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblName3.setVisible(true);
                lblName4.setVisible(true);
                lblName5.setVisible(true);
                txtName3.setVisible(true);
                lblName6.setVisible(true);
                txtName4.setVisible(true);

                int sonuc=Math.abs(Integer.parseInt(txtName1.getText())-sayi);
                txtName3.setText(Integer.toString(sonuc));
                sonuc = Math.abs(Integer.parseInt(txtName2.getText())-sayi);
                txtName4.setText(Integer.toString(sonuc));

                if(Integer.parseInt(txtName1.getText()) == sayi) {
                    JOptionPane.showMessageDialog(null,"1. Oyuncu Sayiyi Bildi","1. Oyuncu Kazandı" ,JOptionPane.INFORMATION_MESSAGE);
                } else if (Integer.parseInt(txtName2.getText()) == sayi) {
                    JOptionPane.showMessageDialog(null,"2. Oyuncu Sayiyi Bildi","2. Oyuncu Kazandı" ,JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,"Oyun Bitti","Kazanan Yok !" ,JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });


        frm.setVisible(true);
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
