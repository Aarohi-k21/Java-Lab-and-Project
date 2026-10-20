package calculatorMVC;
import javax.swing.*;

public class CViews extends JFrame {

    JLabel labelA, labelB, labelResult;

    JTextField textA, textB, textResult;

    JButton plusButton;
    JButton minusButton;
    JButton multiplyButton;
    JButton divideButton;

    public CViews() {

        setTitle("Basic Calculator");

        setLayout(null);

        labelA = new JLabel("Enter A:");
        labelA.setBounds(50, 50, 100, 30);
        add(labelA);

        textA = new JTextField();
        textA.setBounds(150, 50, 150, 30);
        add(textA);

        labelB = new JLabel("Enter B:");
        labelB.setBounds(50, 100, 100, 30);
        add(labelB);

        textB = new JTextField();
        textB.setBounds(150, 100, 150, 30);
        add(textB);

        plusButton = new JButton("+");
        plusButton.setBounds(50, 160, 60, 30);
        add(plusButton);

        minusButton = new JButton("-");
        minusButton.setBounds(120, 160, 60, 30);
        add(minusButton);

        multiplyButton = new JButton("*");
        multiplyButton.setBounds(190, 160, 60, 30);
        add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.setBounds(260, 160, 60, 30);
        add(divideButton);

        labelResult = new JLabel("Result:");
        labelResult.setBounds(50, 220, 100, 30);
        add(labelResult);

        textResult = new JTextField();
        textResult.setBounds(150, 220, 150, 30);
        textResult.setEditable(false);
        add(textResult);

        setSize(400, 350);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}