public class BasicScanner implements Scanable {
    @Override
    public void scan(String dstPath) {
        System.out.println("Scanning to: " + dstPath);
    }
}