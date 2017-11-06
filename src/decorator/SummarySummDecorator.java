package decorator;

import report.Report;
import report.ReportElement;

/**
 * Decorator realization for adding summary content with summary calculation from body
 */
public class SummarySummDecorator extends Decorator {
    private double summ;

    public SummarySummDecorator(Report report, double summ) {
        super(report);
        this.summ = summ;
        decorate();
    }

    @Override
    public void decorate() {
        if (getReport().getBody() != null) {
            getReport().setSummary(getReport().getBody());
        } else {
            getReport().setSummary(new ReportElement(summ));
        }
    }
}
