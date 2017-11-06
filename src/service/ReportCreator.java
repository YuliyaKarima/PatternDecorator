package service;

import decorator.*;
import report.Report;
import report.ReportImpl;

import java.io.*;

/**
 * Report decorator testing
 */
public class ReportCreator {
    private String fullHead = "Full Head";
    private String summaryHead = "Summary Head";
    private int count = 100;
    private double summ = 13433.99;
    private String adv = "Advertise";
    private String sign = "Sign";

    /**
     * Creates reports and writes them to a file
     *
     * @param path1 path to file
     */
    public void createReport(String path1, String path2, String path3) {
        Report decorateReport1 = new ReportImpl();
        decorateReport1 = new HeadFullDecorator
                (new BodySummDecorator
                        (new FooterAdvDecorator
                                (new SummaryFullHeadDecorator(decorateReport1, fullHead), adv), summ), fullHead);
        Report decorateReport2 = new ReportImpl();
        decorateReport2 = new HeadSummaryDecorator
                (new BodyCountDecorator
                        (new SummarySummDecorator
                                (decorateReport2, summ), count), summaryHead);
        Report decorateReport3 = new ReportImpl();
        decorateReport3 = new BodySummDecorator(new SummarySummDecorator(decorateReport3, summ), summ);
        try (BufferedWriter out1 = new BufferedWriter(new FileWriter(path1));
             BufferedWriter out2 = new BufferedWriter(new FileWriter(path2));
             BufferedWriter out3 = new BufferedWriter(new FileWriter(path3))) {
            out1.write(decorateReport1.report());
            out2.write(decorateReport2.report());
            out3.write(decorateReport3.report());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFullHead() {
        return fullHead;
    }

    public void setFullHead(String fullHead) {
        this.fullHead = fullHead;
    }

    public String getSummaryHead() {
        return summaryHead;
    }

    public void setSummaryHead(String summaryHead) {
        this.summaryHead = summaryHead;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSumm() {
        return summ;
    }

    public void setSumm(double summ) {
        this.summ = summ;
    }

    public String getAdv() {
        return adv;
    }

    public void setAdv(String adv) {
        this.adv = adv;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
