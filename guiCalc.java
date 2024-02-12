import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class guiCalc extends JFrame implements ActionListener {
    JButton buttons[] = new JButton[10];
    JButton addButton, subtractButton, multiplyButton, divisionButton, clearButton, equalsbButton, percentagebButton;
    int operand1, operand2;
    char operator;
    JTextField resultField;

    guiCalc() {
        JFrame frame = new JFrame("Calculator By Jibin");
        frame.setSize(280, 400);
        frame.setLayout(new BorderLayout(10, 10));

        resultField = new JTextField(10);
        resultField.setPreferredSize(new Dimension(200, 50));
        resultField.setHorizontalAlignment(JTextField.RIGHT); // Align text to the right
        resultField.setEditable(false); // Make the result field non-editable
        frame.add(resultField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10)); // Adjusted the layout and spacing
        buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttonPanel.setBackground(Color.GRAY);

        for (int i = 7; i <= 9; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(buttons[i]);
            buttons[i].addActionListener(this);
        }

        clearButton = new JButton("C");
        buttonPanel.add(clearButton);
        clearButton.addActionListener(this);

        for (int i = 4; i <= 6; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(buttons[i]);
            buttons[i].addActionListener(this);
        }

        addButton = new JButton("+");
        buttonPanel.add(addButton);
        addButton.addActionListener(this);

        for (int i = 1; i <= 3; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(buttons[i]);
            buttons[i].addActionListener(this);
        }

        subtractButton = new JButton("-");
        buttonPanel.add(subtractButton);
        subtractButton.addActionListener(this);

        buttons[0] = new JButton("0");
        buttonPanel.add(buttons[0]);
        buttons[0].addActionListener(this);

        multiplyButton = new JButton("X");
        buttonPanel.add(multiplyButton);
        multiplyButton.addActionListener(this);

        divisionButton = new JButton("/");
        buttonPanel.add(divisionButton);
        divisionButton.addActionListener(this);

        percentagebButton = new JButton("%");
        buttonPanel.add(percentagebButton);
        percentagebButton.addActionListener(this);

        equalsbButton = new JButton("=");
        buttonPanel.add(equalsbButton);
        equalsbButton.addActionListener(this);

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton == clearButton) {
            operand1 = operand2 = 0;
            resultField.setText("");
        } else if (clickedButton == equalsbButton) {
            operand2 = Integer.parseInt(resultField.getText());
            evaluate();
            resultField.setText(String.valueOf(operand1));
            operand1 = 0;
        } else {
            boolean isOperator = false;
            if (clickedButton == addButton) {
                operator = '+';
                isOperator = true;
            } else if (clickedButton == subtractButton) {
                operator = '-';
                isOperator = true;
            } else if (clickedButton == multiplyButton) {
                operator = '*';
                isOperator = true;
            } else if (clickedButton == percentagebButton) {
                operator = '%';
                isOperator = true;
            } else if (clickedButton == divisionButton) {
                operator = '/';
                isOperator = true;
            }

            if (!isOperator) {
                for (int i = 0; i < 10; i++) {
                    if (clickedButton == buttons[i]) {
                        String currentText = resultField.getText();
                        currentText += buttons[i].getText();
                        resultField.setText(currentText);
                    }
                }
            } else {
                operand1 = Integer.parseInt(resultField.getText());
                resultField.setText("");
            }
        }
    }

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
            case '%':
                if (operand2 != 0) {
                    operand1 %= operand2;
                } else {
                    resultField.setText("Error: Divide by zero");
                }
                break;
        }
    }

    public static void main(String[] args) {
        new guiCalc();
    }
}
