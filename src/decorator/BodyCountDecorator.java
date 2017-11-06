package decorator;

import report.Report;
import report.ReportElement;

/**
 * Decorator realization for adding body content with amount calculation of goods to report
 */
public class BodyCountDecorator extends Decorator {
    private int count;

    public BodyCountDecorator(Report report, int count) {
        super(report);
        this.count = count;
        decorate();
    }

    @Override
    public void decorate() {
        getReport().setBody(new ReportElement(count));
    }

}
