public class  Thread1 extends Thread {
    private Account act;
    public Thread1(Account act){
        this.act=act;

    }
    public void rum(){
        System.out.println("\n--------Thread1 started------");
        act.withdraw(2000);
        System.out.println("\n--Thread started-----");
    }
        
    }


