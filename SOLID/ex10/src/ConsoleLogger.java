public class ConsoleLogger implements LoggerI {
    @Override
    public void log(String msg){ 
        System.out.println("[LOG] " + msg); 
    }
}