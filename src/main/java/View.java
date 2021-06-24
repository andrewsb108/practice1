public class View {
    public static final String INPUT_FIRST_ELEMENT = "Input first word: ";
    public static final String INPUT_SECOND_ELEMENT = "Input second word: ";
    public static final String OUTPUT_TEXT = "Output text is: ";
    public static final String WRONG_INPUT_ELEMENT = "Wrong input! Repeat please. ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printFirstMessageAndText(String firstValue, String secondValue) {
        System.out.println(firstValue + secondValue);
    }
}
