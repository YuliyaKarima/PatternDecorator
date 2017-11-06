package decorator;

import org.junit.Test;
import report.Report;
import report.ReportImpl;

import static org.junit.Assert.*;

public class HeadFullDecoratorTest {
    Report report = new ReportImpl();
    @Test
    public void decorate() throws Exception {
        //given
        String fullHead = "Full Head";
        String expected = "====Report====\n" + fullHead + "\n";
        //when
        report = new HeadFullDecorator(report, fullHead);
        //then
        assertEquals("test failed", expected, report.report());
    }
}