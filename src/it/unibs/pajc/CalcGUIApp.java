package it.unibs.pajc;

import com.sun.tools.javac.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.EventQueue;

public class CalcGUIApp extends JFrame {

    private JPanel MainPanel;
    private JPanel pnlDigits;

    public CalcGUIApp() {
        setTitle("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        PnlDigits pnlDigits = new PnlDigits();

        MainPanel.add(pnlDigits);

        add(MainPanel);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CalcGUIApp frame = new CalcGUIApp();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
