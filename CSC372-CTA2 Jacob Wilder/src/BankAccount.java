/* @author Jacob Wilder
   CSC372-CTA2 Option 2
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class BankAccount {

    public static void main(String args[]) {

        JFrame myFrame = new JFrame();

        JButton myButton = new JButton("Click me!");
        JLabel myLabel = new JLabel("Hello World!");

        JPanel myPanel = new JPanel();
        myPanel.add(myButton);
        myPanel.add(myLabel);
        myFrame.add(myPanel);


        final int F_width = 800;
        final int F_height = 500;
        myFrame.setSize(F_width, F_height);
        myFrame.setTitle("Banking INC.");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.setVisible(true);

    }
}