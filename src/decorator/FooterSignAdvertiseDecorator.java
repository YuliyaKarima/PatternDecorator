package decorator;

import report.Report;
import report.ReportElement;

/**
 * Decorator realization for adding footer content with advertise and sign
 */
public class FooterSignAdvertiseDecorator extends Decorator {
    private String sign;
    private String advertise;

    public FooterSignAdvertiseDecorator(Report report, String sign, String advertise) {
        super(report);
        this.sign = sign;
        this.advertise = advertise;
        decorate();
    }

    @Override
    public void decorate() {
        getReport().setFooter(new ReportElement(sign, advertise));
    }
}
