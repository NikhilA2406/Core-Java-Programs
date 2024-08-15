package ObjectSynchronization;

public class LaunchOLS1 
{
    public static void main(String[] args) 
    {
        HSBCBank bank=new HSBCBank(4000);

        ATM atm=new ATM(bank);
        atm.setName("ATM Thread");

        Googlepay gpay=new Googlepay(bank);
        gpay.setName("GPAY Thread");

        Phonepe ppay=new Phonepe(bank);
        ppay.setName("PPAY Thread");

        atm.start();
        gpay.start();
        ppay.start();


        
    }
    
}
