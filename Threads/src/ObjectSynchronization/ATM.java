package ObjectSynchronization;

public class ATM extends Thread 
{
     
    private HSBCBank bank;
    public ATM(HSBCBank bank)
    {
        this.bank=bank;
    }
    @Override
    public void run() 
    {
        System.out.println("Withdrawal");
        bank.withdrawal(4000);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   

}
