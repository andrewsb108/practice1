import java.util.Scanner;

public class Controller {

    public static final String REGEX_FIRST_ELEMENT = ".*\\bHello\\b.*";
    public static final String REGEX_SECOND_ELEMENT = ".*\\bworld\\b!*";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner input = new Scanner(System.in);

        model.setFirstElement(inputFirstStringValueWithScanner(input));
        model.setSecondElement(inputSecondStringValueWithScanner(input));
        view.printFirstMessageAndText(View.OUTPUT_TEXT, model.getFirstElement() + " " + model.getSecondElement());
    }

    public String inputFirstStringValueWithScanner(Scanner firstInput) {
        view.printMessage(View.INPUT_FIRST_ELEMENT);
        while (!firstInput.hasNext(REGEX_FIRST_ELEMENT)) {
            view.printMessage(View.WRONG_INPUT_ELEMENT + View.INPUT_FIRST_ELEMENT);
            firstInput.nextLine();
        }
        return firstInput.nextLine();
    }

    public String inputSecondStringValueWithScanner(Scanner secondInput) {
        view.printMessage(View.INPUT_SECOND_ELEMENT);
        while (!secondInput.hasNext(REGEX_SECOND_ELEMENT)) {
            view.printMessage(View.WRONG_INPUT_ELEMENT + View.INPUT_SECOND_ELEMENT);
            secondInput.nextLine();
        }
        return secondInput.nextLine();
    }
}
