public class SalesReport {

    private List<double[]> sales;
    private boolean shouldApplyDiscount;
    private String reportName;



    public SalesReport(List<double[]> sales, boolean shouldApplyDiscount, String reportName) {
        this.sales = sales;
        this.shouldApplyDiscount = shouldApplyDiscount;
        this.reportName = reportName;
    }

    public String generateReport() {
        double total = calculateTotal();


        if (shouldApplyDiscount) {
            total = DiscountCalculator.applyDiscount(total);
        }

        String status = StatusCalculator.determineStatus(total);
        return ReportBuilder.buildReport(reportName, total, status);
    }

    private double calculateTotal() {
        double total = 0;
        for (double[] sale : sales) {
            total += sale[1];
        }
        return total;
    }






}
