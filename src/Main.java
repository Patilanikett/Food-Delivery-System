import gui.LoginFrame;
import utils.DatabaseConnection;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Set look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Test database connection
        if (DatabaseConnection.getConnection() == null) {
            JOptionPane.showMessageDialog(null,
                    "Database connection failed. Please check your MySQL server and credentials.",
                    "Database Error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        // Launch application
        SwingUtilities.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
}