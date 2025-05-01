import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class FactorialCalculatorGUI extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public FactorialCalculatorGUI() {
        // Set up the JFrame
        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        JLabel inputLabel = new JLabel("Enter a number:");
        inputField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate Factorial");
        resultLabel = new JLabel("");

        // Add components to the frame
        add(inputLabel);
        add(inputField);
        add(calculateButton);
        add(resultLabel);

        // Add action listener for the calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });
    }

    private void calculateFactorial() {
        try {
            int n = Integer.parseInt(inputField.getText());
            if (n < 0) {
                resultLabel.setText("Factorial undefined for negative numbers");
            } else {
                BigInteger factorial = calculateFactorial(n);
                resultLabel.setText("Factorial of " + n + " is " + factorial.toString());
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    private BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FactorialCalculatorGUI calculator = new FactorialCalculatorGUI();
            calculator.setVisible(true);
        });
    }
}
