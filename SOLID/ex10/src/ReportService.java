public class ReportService {
    LoggerI logger;
    ReportService(LoggerI logger){
        this.logger =logger;
    }
    void generate(){
        logger.log("Generating daily report...");
        System.out.println("Report contents...");
    }
}