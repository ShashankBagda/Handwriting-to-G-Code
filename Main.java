import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame {

    private BufferedImage backgroundImage;
    private JButton startButton;

    public Main() {
        try {
            // Load the initial background image from file
            backgroundImage = ImageIO.read(new File("background.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set the frame properties
        setTitle("Handwriting to CNC");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true); // Allow resizing

        // Create the Start button
        startButton = new JButton("Start");
        startButton.setBounds(350, 250, 100, 50);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Change the background image when the button is clicked
                    backgroundImage = ImageIO.read(new File("menu.png"));
                    // Repaint the panel to reflect the change
                    repaint();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Add a JPanel with overridden paintComponent method to draw the background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    // Scale the image to fit the panel
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
                }
            }
        };

        // Set the layout to null to allow absolute positioning of components
        panel.setLayout(null);

        // Add the Start button to the panel
        panel.add(startButton);

        // Add any other components to the panel here

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main frame = new Main();
            frame.setVisible(true);
        });
    }
}
