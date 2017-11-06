package decorator;

import report.Report;
import report.ReportElement;

/**
 * Decorator realization for adding head content with summary info
 */
public class HeadSummaryDecorator extends Decorator {
    private String summary;

    public HeadSummaryDecorator(Report report, String summary) {
        super(report);
        this.summary = summary;
        decorate();
    }

    @Override
    public void decorate() {
        getReport().setHead(new ReportElement(summary));
    }
}
