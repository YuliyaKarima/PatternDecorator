package decorator;

import report.Report;
import report.ReportElement;

/**
 * Decorator realization for adding footer content with sign
 */
public class FooterSignDecorator extends Decorator {
    private String sign;

    public FooterSignDecorator(Report report, String sign) {
        super(report);
        this.sign = sign;
        decorate();
    }

    @Override
    public void decorate() {
        getReport().setFooter(new ReportElement(sign));
    }
}
