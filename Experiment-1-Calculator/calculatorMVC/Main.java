package calculatorMVC;
public class Main {

    public static void main(String[] args) {

        CViews view = new CViews();

        CModules model = new CModules();

        CController controller =
                new CController(view, model);
    }
}