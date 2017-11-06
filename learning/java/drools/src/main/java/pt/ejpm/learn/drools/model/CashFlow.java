
package pt.ejpm.learn.drools.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author edgar.mateus
 */
public class CashFlow {
    
    private final Date mvtDate;
    private final BigDecimal amount;
    private final int type;
    private final String accountNo;

    public CashFlow(Date mvtDate, BigDecimal amount, int type, String accountNo) {
        this.mvtDate = mvtDate;
        this.amount = amount;
        this.type = type;
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Date getMvtDate() {
        return mvtDate;
    }

    public int getType() {
        return type;
    }
    
}
