package report;

/**
 * Encapsulates report parts and provides method for output report on thr console
 */
public abstract class Report {

    private ReportElement head;
    private ReportElement body;
    private ReportElement footer;
    private ReportElement summary;
    private String report = "====Report====\n";

    /**
     * Concatenates report's part in one String line
     * @return report
     */
    public String report() {
        if (head != null) {
            report += head.getText();
        }
        if (body != null) {
            report += body.getText();
        }
        if (footer != null) {
            report += footer.getText();
        }
        if (summary != null) {
            report += "Summary: " + summary.getText();
        }
        return report;
    }

    public ReportElement getHead() {
        return head;
    }

    public void setHead(ReportElement head) {
        this.head = head;
    }

    public ReportElement getBody() {
        return body;
    }

    public void setBody(ReportElement body) {
        this.body = body;
    }

    public ReportElement getFooter() {
        return footer;
    }

    public void setFooter(ReportElement footer) {
        this.footer = footer;
    }

    public ReportElement getSummary() {
        return summary;
    }

    public void setSummary(ReportElement summary) {
        this.summary = summary;
    }
}
