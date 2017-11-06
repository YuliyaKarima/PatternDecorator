package decorator;

import report.Report;
import report.ReportElement;

/**
 * Decorator realization for adding head content with full info
 */
public class HeadFullDecorator extends Decorator {
    private String fullHeader;

    public HeadFullDecorator(Report report, String fullHeader) {
        super(report);
        this.fullHeader = fullHeader;
        decorate();
    }

    @Override
    public void decorate() {
        getReport().setHead(new ReportElement(fullHeader));
    }
}
