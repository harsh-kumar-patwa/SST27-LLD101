public class BasicFaxer implements Faxable {
    @Override
    public void fax(String number) {
        System.out.println("Faxing to number: " + number);
    }
}