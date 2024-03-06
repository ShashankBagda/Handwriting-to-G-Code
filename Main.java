import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;

public class Main extends JFrame implements ActionListener {
    private JButton startButton;
    private JFrame processFrame;

    public Main() {
        setTitle("Main Frame");
        setLayout(new BorderLayout());
        

        // Set background image
        setContentPane(new JLabel(new ImageIcon("Graphics/background.png")));

        // Create Start button with image
        ImageIcon startIcon = new ImageIcon("Graphics/start.png");
        startButton = new JButton(startIcon);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.addActionListener(this);
        startButton.setBounds(810, 820, 300, 105);

        // Add Start button to the frame
        add(startButton, BorderLayout.CENTER);

        // Maximize the frame by default
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Add ComponentListener to adjust background image on resize
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                JLabel label = (JLabel) getContentPane();
                label.setIcon(new ImageIcon(new ImageIcon("Graphics/background.png").getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH)));
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            processFrame = new ProcessFrame();
            processFrame.setVisible(true);
            dispose(); // Close Main Frame
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}

class ProcessFrame extends JFrame implements ActionListener {
    private JButton processButton;
    private JButton selectButton;
    private JFileChooser fileChooser;
    private JProgressBar progressBar;

    public ProcessFrame() {
        setTitle("Process Frame");
        setLayout(new BorderLayout());

        // Set background image
        setContentPane(new JLabel(new ImageIcon("Graphics/menu.png")));

        // Create Process button with image
        ImageIcon processIcon = new ImageIcon("Graphics/process.png");
        processButton = new JButton(processIcon);
        processButton.setBorderPainted(false);
        processButton.setContentAreaFilled(false);
        processButton.addActionListener(this);
        processButton.setBounds(810, 820, 300, 105);

        // Add Start button to the frame
        // add(processButton, BorderLayout.CENTER);


        // Create Select button
        selectButton = new JButton("Select");
        selectButton.addActionListener(this);

        // Create Progress bar
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);

        // Add components to the frame
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(processButton);
        buttonPanel.add(selectButton);
        add(buttonPanel, BorderLayout.NORTH);
        add(progressBar, BorderLayout.SOUTH);

        // Create labels
        JPanel labelPanel = new JPanel(new GridLayout(8, 12)); // 93 labels
        for (int i = 0; i < 93; i++) {
            JLabel label = new JLabel();
            label.setPreferredSize(new Dimension(50, 50));
            labelPanel.add(label);
        }
        add(labelPanel, BorderLayout.CENTER);

        // Maximize the frame by default
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add ComponentListener to adjust background image on resize
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                JLabel label = (JLabel) getContentPane();
                label.setIcon(new ImageIcon(new ImageIcon("Graphics/menu.png").getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH)));
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == processButton) {
            // Perform process
            System.out.println("Process");
            // Update progress bar
            progressBar.setValue(50); // Set an arbitrary value for demonstration
        } else if (e.getSource() == selectButton) {
            // Open file chooser
            fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            }
        }
    }
}
