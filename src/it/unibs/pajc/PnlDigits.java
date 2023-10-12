package it.unibs.pajc;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PnlDigits extends JPanel {
    public PnlDigits() {
        setLayout(new BorderLayout());

        for(int i = 1; i < 10; i++){
            JButton button = new JButton(Integer.toString(i));
            add(button);
        }
    }
}
