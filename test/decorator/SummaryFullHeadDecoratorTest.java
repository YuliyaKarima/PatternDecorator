package decorator;

import org.junit.Test;
import report.Report;
import report.ReportImpl;

import static org.junit.Assert.*;

public class SummaryFullHeadDecoratorTest {
    Report report = new ReportImpl();
    @Test
    public void decorate() throws Exception {
        //given
        String summaryHead = "Summary Head";
        String expected = "====Report====\nSummary: " + summaryHead + "\n";
        //when
        report = new SummaryFullHeadDecorator(report, summaryHead);
        //then
        assertEquals("test failed", expected, report.report());
    }
}