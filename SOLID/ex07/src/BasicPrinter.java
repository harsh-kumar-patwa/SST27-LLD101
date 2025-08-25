public class BasicPrinter implements Printable {
    @Override
    public void print(String text) {
        System.out.println("Print: " + text);
    }
}