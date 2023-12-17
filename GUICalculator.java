/*************************************************************************************************************************
 * File		        :   GUICalculator.java
 * Description      :   Write a Java program that works as a simple calculator. Arrange Buttons for digits and the
                        + - * % operations properly. Add a text field to display the result.Handle any possible
                        exceptions like divide by zero. Use Java Swing.
 * Author           :   Jibin Gigi
 * Version          :   1.0
 * Date             :   13/12/23
**************************************************************************************************************************/


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

// GUI Calculator class extending JFrame and implementing ActionListener
class GUICalculator extends JFrame implements ActionListener {
    JButton numberButtons[] = new JButton[10];
    JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
    int operand1, operand2;
    char operator;
    JTextField resultField;

    // Constructor for the GUI Calculator
    GUICalculator() {
        // Set the title of the frame
        setTitle("Calculator By Jibin");
        setLayout(new BorderLayout(10, 10));

        // Panel to hold the calculator buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 7, 17));
        buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttonPanel.setBackground(java.awt.Color.white);

        // Initialize and add number buttons (7-9) to the panel
        for (int i = 7; i <= 9; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
            numberButtons[i].addActionListener(this);
        }

        // Add the clear button and set its ActionListener
        clearButton = new JButton("C");
        buttonPanel.add(clearButton);
        clearButton.addActionListener(this);

        // Initialize and add number buttons (4-6) to the panel
        for (int i = 4; i <= 6; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
            numberButtons[i].addActionListener(this);
        }

        // Add the addition button and set its ActionListener
        addButton = new JButton("+");
        buttonPanel.add(addButton);
        addButton.addActionListener(this);

        // Initialize and add number buttons (1-3) to the panel
        for (int i = 1; i <= 3; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
            numberButtons[i].addActionListener(this);
        }

        // Add the subtraction button and set its ActionListener
        subtractButton = new JButton("-");
        buttonPanel.add(subtractButton);
        subtractButton.addActionListener(this);

        // Add the number button 0 to the panel
        numberButtons[0] = new JButton(String.valueOf(0));
        buttonPanel.add(numberButtons[0]);
        numberButtons[0].addActionListener(this);

        // Add the multiplication button and set its ActionListener
        multiplyButton = new JButton("*");
        buttonPanel.add(multiplyButton);
        multiplyButton.addActionListener(this);

        // Add the division button and set its ActionListener
        divideButton = new JButton("%");
        buttonPanel.add(divideButton);
        divideButton.addActionListener(this);

        // Add the equals button and set its ActionListener
        equalsButton = new JButton("=");
        buttonPanel.add(equalsButton);
        equalsButton.addActionListener(this);

        // Initialize the result field
        resultField = new JTextField(10);
        resultField.setPreferredSize(new Dimension(200, 50));

        // Add components to the frame
        add(buttonPanel, BorderLayout.CENTER);
        add(resultField, BorderLayout.NORTH);

        // Set frame properties
        setVisible(true);
        setSize(280, 400);
    }

    // ActionListener method for button clicks
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        // Check which button was clicked
        if (clickedButton == clearButton) {
            operand1 = operand2 = 0;
            resultField.setText("");
        } else if (clickedButton == equalsButton) {
            operand2 = Integer.parseInt(resultField.getText());
            evaluate();
            resultField.setText(String.valueOf(operand1));
            operand1 = 0; // Reset operand1 for future calculations
        } else {
            boolean isOperator = false;

            // Check if an operator button was clicked
            if (clickedButton == addButton) {
                operator = '+';
                isOperator = true;
            }
            if (clickedButton == subtractButton) {
                operator = '-';
                isOperator = true;
            }
            if (clickedButton == multiplyButton) {
                operator = '*';
                isOperator = true;
            }
            if (clickedButton == divideButton) {
                operator = '/';
                isOperator = true;
            }

            // Check if a number button was clicked
            if (!isOperator) {
                for (int i = 0; i < 10; i++) {
                    if (clickedButton == numberButtons[i]) {
                        String currentText = resultField.getText();
                        currentText += i;
                        resultField.setText(currentText);
                    }
                }
            } else {
                operand1 = Integer.parseInt(resultField.getText());
                resultField.setText("");
            }
        }
    }

    // Method to evaluate the expression based on the selected operator
    void evaluate() {
        switch (operator) {
            case '+':
                operand1 += operand2;
                break;
            case '-':
                operand1 -= operand2;
                break;
            case '*':
                operand1 *= operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    operand1 /= operand2;
                } else {
                    resultField.setText("Error: Divide by zero");
                }
                break;
        }
    }

    // Main method to create an instance of the GUI Calculator
    public static void main(String[] args) {
        new GUICalculator();
    }
}
