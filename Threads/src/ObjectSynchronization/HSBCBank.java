package ObjectSynchronization;

public class HSBCBank {

    int accountBal;
    public HSBCBank(int accountBal)
    {
        this.accountBal=accountBal;
    }
    synchronized public void withdrawal(int withdrawalAmount)
    {
        accountBal=this.accountBal-withdrawalAmount;
    }
    synchronized public void deposit(int depositAmount)
    {
        accountBal=this.accountBal+depositAmount;
    }
    synchronized public void checkingBal()
    {
        System.out.println("The Balance in the Account is "+accountBal);

    }
    
}
