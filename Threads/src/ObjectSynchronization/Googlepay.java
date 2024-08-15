package ObjectSynchronization;

public class Googlepay extends Thread
{
    private HSBCBank bank;
    public Googlepay(HSBCBank bank)
    {
        this.bank=bank;
    }
    @Override
    public void run() 
    {
        System.out.println("Deposit");
        bank.deposit(6000);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
    
}
