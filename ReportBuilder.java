public class ReportBuilder {
    public static String buildReport(String reportName, double total, String status) {
        return "Relatorio: " + reportName + "\n" +
               "Total: " + total + "\n" +
               "STATUS: " + status;
    }
}
