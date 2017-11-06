package decorator;

import org.junit.Test;
import report.Report;
import report.ReportImpl;

import static org.junit.Assert.*;

public class SummarySummDecoratorTest {
    Report report = new ReportImpl();
    @Test
    public void decorate() throws Exception {
        //given
        double summ = 13433.99;
        String expected = "====Report====\nSummary: Goods cost are " + summ + "\n";
        //when
        report = new SummarySummDecorator(report, summ);
        //then
        assertEquals("test failed", expected, report.report());
    }
}