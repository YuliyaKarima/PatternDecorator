package decorator;

import org.junit.Test;
import report.Report;
import report.ReportImpl;

import static org.junit.Assert.*;

public class FooterSignDecoratorTest {
    Report report = new ReportImpl();

    @Test
    public void decorate() throws Exception {
        //given
        String sign = "Sign";
        String expected = "====Report====\n" + sign + "\n";
        //when
        report = new FooterSignDecorator(report, sign);
        //then
        assertEquals("test failed", expected, report.report());
    }

}