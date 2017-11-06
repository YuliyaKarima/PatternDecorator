package decorator;

import org.junit.Test;
import report.Report;
import report.ReportImpl;

import static org.junit.Assert.*;

public class FooterSignAdvertiseDecoratorTest {
    Report report = new ReportImpl();
    @Test
    public void decorate() throws Exception {
        //given
        String adv = "Advertise";
        String sign = "Sign";
        String expected = "====Report====\nSign: " + sign + "\n" + "Advertise: " + adv + "\n";
        //when
        report = new FooterSignAdvertiseDecorator(report, sign, adv);
        //then
        assertEquals("test failed", expected, report.report());
    }

}