package org.costr.railroad_ink;

import java.awt.Image;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author costr
 */

public class GUI1 {
    public static void main(String[] args) {
        // Create a new game instance
        Railroad_Ink game = new Railroad_Ink();

        GUI1 gui = new GUI1();
        gui.initialize();
    }

    public void initialize() {
        JFrame frame = new JFrame("Railroad Ink");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new java.awt.Dimension(800, 600));
        frame.setResizable(true);
        frame.pack(); // Pack the frame to fit the preferred size
        frame.setLocationRelativeTo(null); // Center the window on the screen
        frame.setLayout(new java.awt.BorderLayout());
        JPanel bildpanel = new JPanel();
        bildpanel.setLayout(new BoxLayout(bildpanel, BoxLayout.X_AXIS));

        // Add components to the frame
        JButton button = new JButton("würfeln");
        frame.add(button, java.awt.BorderLayout.SOUTH);
        button.addActionListener(e -> {
            // Clear the panel before adding new images
            bildpanel.removeAll();
            bildpanel.revalidate();
            bildpanel.repaint();

            // Call the method to roll the dice
            try {
                Feld rolledField = new Feld(1);
                Image image = rolledField.getImage();
                JLabel label = new JLabel(new ImageIcon(image));
                bildpanel.add(label);
                bildpanel.revalidate();
            } catch (IOException ex) {
            }
        });
        frame.add(bildpanel, java.awt.BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
