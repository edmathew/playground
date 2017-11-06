package pt.ejpm.learn.drools.model;

import java.util.Date;

/**
 *
 * @author edgar.mateus
 */
public class AccountingPeriod {

    private final Date startDate;
    private final Date endDate;

    public AccountingPeriod(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
