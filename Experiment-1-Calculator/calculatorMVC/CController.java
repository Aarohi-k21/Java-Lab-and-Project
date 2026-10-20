package calculatorMVC;
import java.awt.event.*;

public class CController implements ActionListener {

    CViews view;
    CModules model;

    public CController(CViews view, CModules model) {

        this.view = view;
        this.model = model;

        view.plusButton.addActionListener(this);

        view.minusButton.addActionListener(this);

        view.multiplyButton.addActionListener(this);

        view.divideButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        double a = Double.parseDouble(
                view.textA.getText()
        );

        double b = Double.parseDouble(
                view.textB.getText()
        );

        double result;

        if (e.getSource() == view.plusButton) {

            result = model.add(a, b);

            view.textResult.setText(
                    String.valueOf(result)
            );
        }

        else if (e.getSource() == view.minusButton) {

            result = model.subtract(a, b);

            view.textResult.setText(
                    String.valueOf(result)
            );
        }

        else if (e.getSource() == view.multiplyButton) {

            result = model.multiply(a, b);

            view.textResult.setText(
                    String.valueOf(result)
            );
        }

        else if (e.getSource() == view.divideButton) {

            result = model.divide(a, b);

            view.textResult.setText(
                    String.valueOf(result)
            );
        }
    }
}