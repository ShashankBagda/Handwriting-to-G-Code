import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.*;


class ExistingFrame extends JFrame implements ActionListener
{
    private JButton backButton, processButton;
    
    public ExistingFrame()
    {
        setTitle("Existing Data Frame");
        setLayout(new BorderLayout());
        // setResizable(false);
        // setUndecorated(true);

        // Set background image
        setContentPane(new JLabel(new ImageIcon("Graphics/existing.png")));

        // Maximize the frame by default
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        backButton = new JButton();
        backButton.setBorderPainted(true);
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(this);
        backButton.setBounds(10, 20, 45, 40);
        add(backButton, BorderLayout.CENTER);

        processButton = new JButton();
        processButton.setBorderPainted(true);
        processButton.setContentAreaFilled(false);
        processButton.addActionListener(this);
        processButton.setBounds(708, 762, 500, 120);
        add(processButton, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                JLabel label = (JLabel) getContentPane();
                label.setIcon(new ImageIcon(new ImageIcon("Graphics/existing.png").getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH)));
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        if (e.getSource() == backButton) 
        {
            Main main = new Main();
            main.setVisible(true);
            dispose();
        }
        if (e.getSource() == processButton) 
        {
            executePythonScript("embedder.py");
        }
    }

    private void executePythonScript(String scriptName) {
        try {
            // Change directory to where the Python script is located
            String workingDirectory = System.getProperty("user.dir");
            ProcessBuilder pb = new ProcessBuilder("python", scriptName);
            pb.directory(new File(workingDirectory));
            @SuppressWarnings("unused")
            Process process = pb.start();
            // Uncomment the following line if you want to wait for the script to finish execution
            // process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}