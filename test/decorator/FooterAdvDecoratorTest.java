package decorator;

import org.junit.Test;
import report.Report;
import report.ReportImpl;

import static org.junit.Assert.*;

public class FooterAdvDecoratorTest {
    Report report = new ReportImpl();
    @Test
    public void decorate() throws Exception {
        //given
        String adv = "Advertise";
        String expected = "====Report====\n"+ adv + "\n";
        //when
        report = new FooterAdvDecorator(report, adv);
        //then
        assertEquals("test failed", expected, report.report());
    }

}