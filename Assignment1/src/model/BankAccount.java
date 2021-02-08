package model;

/**
 *
 * @author juhip
 * 
 * Account details have the different bank account information of Person

 */
public class BankAccount {
    //Bank name, bank routing number, bank account number, account balance, account type (saving)
    String bankName;
    int bankRoutingNum;
    private double bankAcctNumber;
    private double bankAccBalance;
    String accountType;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBankRoutingNum() {
        return bankRoutingNum;
    }

    public void setBankRoutingNum(int bankRoutingNum) {
        this.bankRoutingNum = bankRoutingNum;
    }

    public double getBankAcctNumber() {
        return bankAcctNumber;
    }

    public void setBankAcctNumber(double bankAcctNumber) {
        this.bankAcctNumber = bankAcctNumber;
    }

    public double getBankAccBalance() {
        return bankAccBalance;
    }

    public void setBankAccBalance(double bankAccBalance) {
        this.bankAccBalance = bankAccBalance;
    }

    public String getAccountType() {
       
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
//         String type = null;
//       if(type.equals("Checking")){
//           return
 //      }
    }
    
    
    
    
}
