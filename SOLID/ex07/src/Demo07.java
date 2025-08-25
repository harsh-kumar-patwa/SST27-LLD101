public class Demo07 {
    public static void main(String[] args) {
        Printable printer = new BasicPrinter();
        Scanable scanner = new BasicScanner();
        Faxable faxer = new BasicFaxer();

        printer.print("Hello");
        scanner.scan("/tmp/out");
        faxer.fax("1234567890");
    }
}