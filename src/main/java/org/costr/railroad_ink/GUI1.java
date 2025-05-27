package org.costr.railroad_ink;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author costr
 */
@SpringBootApplication
public class GUI1 {
    Railroad_Ink game = new Railroad_Ink();

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(GUI1.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            // Create a new game instance
            Railroad_Ink game = new Railroad_Ink();
            game.init();

            GUI1 gui = new GUI1();
            gui.initialize();

        };
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
            bildpanel.removeAll();
            bildpanel.revalidate();
            bildpanel.repaint();

            try {
                for (int i = 0; i < 4; i++) {
                    Feld feld = game.würfen();
                    ImagePanel imgPanel = new ImagePanel(feld.getImage());
                    imgPanel.setPreferredSize(new java.awt.Dimension(
                            bildpanel.getWidth() / 4, bildpanel.getHeight()));
                    bildpanel.add(imgPanel);
                }
                bildpanel.revalidate();
                bildpanel.repaint();
            } catch (IOException ex) {
            }
        });
        frame.add(bildpanel, java.awt.BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

// Hilfsklasse für dynamisch skalierte Bilder
class ImagePanel extends JPanel {
    private final Image image;

    public ImagePanel(Image image) {
        this.image = image;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            int size = Math.min(getWidth(), getHeight());
            int x = (getWidth() - size) / 2;
            int y = (getHeight() - size) / 2;
            g.drawImage(image, x, y, size, size, this);
        }
    }
}
