package report;

/**
 * Encapsulates report element content
 */
public class ReportElement {
    private String text;

    public ReportElement(String text) {
        this.text = text + "\n";
    }

    public ReportElement(int count) {
        text = "There is " + count + " goods on the store\n";
    }

    public ReportElement(double summ) {
        text = "Goods cost are " + summ + "\n";
    }

    public ReportElement(String sign, String adv) {
        text = "Sign: " + sign + "\n" + "Advertise: " + adv + "\n";
    }

    public String getText() {
        return text;
    }
}
