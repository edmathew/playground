package pt.ejpm.learn.drools.model;

import java.math.BigDecimal;

/**
 *
 * @author edgar.mateus
 */
public class Account {

    private final String accountNo;
    private final BigDecimal accountBalance;

    public Account(String accountNo, BigDecimal accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }
    
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public String getAccountNo() {
        return accountNo;
    }
    
    
    
    
    
    
}
