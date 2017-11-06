package decorator;

import report.Report;
import report.ReportElement;

/**
 * Decorator realization for adding footer content with advertise
 */
public class FooterAdvDecorator extends Decorator {
    private String adv;

    public FooterAdvDecorator(Report report, String adv) {
        super(report);
        this.adv = adv;
        decorate();
    }

    @Override
    public void decorate() {
        getReport().setFooter(new ReportElement(adv));
    }
}
