package decorator;

import org.junit.Test;
import report.Report;
import report.ReportImpl;

import static org.junit.Assert.*;

public class BodyCountDecoratorTest {
    Report report = new ReportImpl();

    @Test
    public void decorate() throws Exception {
        //given
        int count = 100;
        String expected = "====Report====\nThere is " + count + " goods on the store\n";
        //when
        report = new BodyCountDecorator(report, count);
        //then
        assertEquals("test failed", expected, report.report());
    }
}