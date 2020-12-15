/**
 * account
 */
public class account {

    private  String AccNumber;
    private  double balance;
    private  String name;
    private  String email;
    private  String phoneNum;

    public void deposit(double creditAmount) {
        this.balance += creditAmount;
        System.out.println("deposit of new balance " + creditAmount + "made. new balance is " + this.balance );
        
    }

    public void withdrawl(double debitAmount) {
        if(this.balance - debitAmount <0){
            System.out.println("only" + this.balance + " available withdrawl not processed");
        }
        
        else{
               this.balance -= debitAmount;
               System.out.println("withdrawl of " + debitAmount + "processing. remaining balance is ...." + this.balance);
        }
        
        
    }
/** AccNumber************************************************** */ 
    public void setacc(String AccNumber) {
        this.AccNumber = AccNumber;
        
    }
    public String getacc() {
        return this.AccNumber;
        
    }
/** balance******************************************************* */
    public void setbal(Double balance) {
        this.balance = balance;
        
    }
    public double getbal() {
        return this.balance;
        
    }
/** name********************************************************** */    
    public void setName(String name) {
        this.name = name;
        
    }
    public String getName() {
        return this.name;
        
    }
/** email******************************************************* */
    public void setEmail(String email) {
        this.email = email;
    
    }
    public String getEmail() {
        return this.email;
    
    }
    /**phone number********************************************* */   
    
    public void setMobile(String phoneNum) {
        this.phoneNum = phoneNum;
        
    }
    public String getMobile() {
        return this.phoneNum;
        
    }
 /**testing***************************************************** */   
    public static void main(String[] args) {
        account bob = new account();

        bob.deposit(50);
        bob.withdrawl(20);
    }
}