import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JButton startButton;

    public Main() {
        setTitle("Main Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setResizable(false);
        setLocationRelativeTo(null);

        // Set background image
        JLabel background = new JLabel(new ImageIcon("background.png"));
        background.setLayout(new BorderLayout());
        setContentPane(background);

        // Start Button
        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close current frame
                new ProcessFrame(); // Open process frame
            }
        });
        startButton.setPreferredSize(new Dimension(100, 50));
        startButton.setFocusPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setBorderPainted(false);
        startButton.setOpaque(false);
        background.add(startButton, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}

class ProcessFrame extends JFrame {
    private JButton processButton, selectButton;
    private JFileChooser fileChooser;

    public ProcessFrame() {
        setTitle("Process Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setResizable(false);
        setLocationRelativeTo(null);

        // Set background image
        JLabel background = new JLabel(new ImageIcon("menu.png"));
        background.setLayout(null); // Using absolute positioning for labels
        setContentPane(background);

        // Process Button
        processButton = new JButton("Process");
        processButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Process");
            }
        });
        processButton.setBounds(50, 50, 100, 50);
        background.add(processButton);

        // Select Button
        selectButton = new JButton("Select");
        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fileChooser == null) {
                    fileChooser = new JFileChooser();
                }
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    // File selected
                    System.out.println("Selected file: " + fileChooser.getSelectedFile());
                }
            }
        });
        selectButton.setBounds(200, 50, 100, 50);
        background.add(selectButton);

        // Labels
        for (int i = 0; i < 93; i++) {
            JLabel label = new JLabel();
            label.setOpaque(true);
            label.setBackground(Color.WHITE);
            label.setBounds(50 + (i % 10) * 60, 150 + (i / 10) * 60, 50, 50);
            background.add(label);
        }

        // Large label
        JLabel largeLabel = new JLabel();
        largeLabel.setOpaque(true);
        largeLabel.setBackground(Color.WHITE);
        largeLabel.setBounds(500, 50, 300, 700);
        background.add(largeLabel);

        // Progress Bar
        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        progressBar.setBounds(50, 500, 700, 50);
        background.add(progressBar);

        setVisible(true);
    }
}
