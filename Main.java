import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Main extends JFrame implements ActionListener {
    private JButton createNew, existingButton;
    private JComboBox<String> languageSelector;

    public Main() {
        setTitle("Main Frame");
        setLayout(new BorderLayout());

        // Set background image
        setContentPane(new JLabel(new ImageIcon("Graphics/background.png")));

        // Create Create New button with image
        createNew = new JButton();
        createNew.setBorderPainted(true);
        createNew.setContentAreaFilled(false);
        createNew.addActionListener(this);
        createNew.setBounds(560, 860, 300, 100);
        // Add Create New button to the frame
        add(createNew, BorderLayout.CENTER);

        // Create Existing button with image
        existingButton = new JButton();
        existingButton.setBorderPainted(true);
        existingButton.setContentAreaFilled(false);
        existingButton.addActionListener(this);
        existingButton.setBounds(1060, 860, 300, 100);
        // Add Existing button to the frame
        add(existingButton, BorderLayout.CENTER);

        // Create JComboBox for language selection
        String[] languages = {"Select Language","English", "Hindi", "Gujarati"};
        languageSelector = new JComboBox<>(languages);
        languageSelector.setBounds(860, 750, 200, 50);
        
        // Change font size to 16 and set color to blue
        Font font = new Font("Arial", Font.BOLD, 20);
        languageSelector.setFont(font);
        languageSelector.setForeground(Color.BLUE);
        
        languageSelector.addActionListener(this);
        add(languageSelector);
        

        // Maximize the frame by default
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

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
        if (e.getSource() == createNew || e.getSource() == existingButton) 
        {
            if (languageSelector.getSelectedIndex() <= 0) 
            {
                JOptionPane.showMessageDialog(this, "Please select a language.", "Warning", JOptionPane.WARNING_MESSAGE);
            } 
            else 
            {
                String selectedLanguage = (String) languageSelector.getSelectedItem();

                if (e.getSource() == createNew) 
                {
                    switch (selectedLanguage) 
                    {
                        case "English":
                                EnglishFrame englishFrame = new EnglishFrame();
                                englishFrame.setVisible(true);
                            break;
                        case "Hindi":
                                HindiFrame hindiFrame = new HindiFrame();
                                hindiFrame.setVisible(true);
                            break;
                        case "Gujarati":
                                GujaratiFrame gujaratiFrame = new GujaratiFrame();
                                gujaratiFrame.setVisible(true);
                            break;
                        default:
                            break;
                    }
                } 
                else 
                {
                    ExistingFrame existingFrame = new ExistingFrame();
                    existingFrame.setVisible(true);
                }
                dispose(); // Close Main Frame
            }
        }        
    }

    public static void main(String[] args) {
        new Main();
    }
}