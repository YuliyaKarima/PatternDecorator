package decorator;

import report.Report;
import report.ReportElement;

/**
 * Decorator realization for adding summary content with full info from head
 */
public class SummaryFullHeadDecorator extends Decorator {
    private String fullHeader;

    public SummaryFullHeadDecorator(Report report, String header) {
        super(report);
        this.fullHeader = header;
        decorate();
    }

    @Override
    public void decorate() {
        if (getReport().getHead() != null) {
            getReport().setSummary(getReport().getHead());
        } else {
            getReport().setSummary(new ReportElement(fullHeader));
        }
    }
}
