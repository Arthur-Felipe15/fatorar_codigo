public class StatusCalculator {
    public static String determineStatus(double total) {
        if (total > 10000) {
            return "A";
        } else if (total > 5000) {
            return "B";
        } else {
            return "C";
        }
    }
}
