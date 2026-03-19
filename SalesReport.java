public class SalesReport {

    private List<double[]> sales;
    private boolean shouldApplyDiscount;
    private String reportName;

    private static final double DISCOUNT_RATE = 0.1;

    public SalesReport(List<double[]> sales, boolean shouldApplyDiscount, String reportName) {
        this.sales = sales;
        this.shouldApplyDiscount = shouldApplyDiscount;
        this.reportName = reportName;
    }

    public String generateReport() {
        double total = calculateTotal();

        if (shouldApplyDiscount) {
            total = applyDiscount(total);
        }

        String status = determineStatus(total);

        return buildReport(total, status);
    }

    private double calculateTotal() {
        double total = 0;
        for (double[] sale : sales) {
            total += sale[1];
        }
        return total;
    }

    private double applyDiscount(double total) {
        return total - (total * DISCOUNT_RATE);
    }

    private String determineStatus(double total) {
        if (total > 10000) {
            return "A";
        } else if (total > 5000) {
            return "B";
        } else {
            return "C";
        }
    }

    private String buildReport(double total, String status) {
        return "Relatorio: " + reportName + "\n" +
               "Total: " + total + "\n" +
               "STATUS: " + status;
    }
}