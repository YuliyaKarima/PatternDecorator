package decorator;

import report.Report;
import report.ReportElement;

/**
 * Decorator realization for adding body content with summary calculation of goods to report
 */
public class BodySummDecorator extends Decorator {
    private double summ;

    public BodySummDecorator(Report report, double summ) {
        super(report);
        this.summ = summ;
        decorate();
    }

    @Override
    public void decorate() {
        getReport().setBody(new ReportElement(summ));
    }

}
