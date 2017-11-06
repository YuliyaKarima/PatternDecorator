package decorator;

import report.Report;
import report.ReportImpl;

/**
 * Abstract Decorator class, provides method for adding report parts
 */
public abstract class Decorator extends Report {

    private Report report;

    public Decorator(Report report) {
        if (report instanceof ReportImpl) {
            this.report = report;
        } else {
            this.report = ((Decorator) report).getReport();
        }
    }

    public String report() {
        return report.report();
    }

    /**
     * Method that is realized by decorator descendants
     * to add certain parts of report
     */
    public abstract void decorate();

    public Report getReport() {
        return report;
    }
}
