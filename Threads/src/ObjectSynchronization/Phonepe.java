package ObjectSynchronization;

public class Phonepe extends Thread 
{
    private HSBCBank bank;
    public Phonepe(HSBCBank bank)
    {
        this.bank=bank;
    }
    @Override
    public void run()
    {
        bank.checkingBal();
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}
