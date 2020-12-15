public class computer {
    private String monitor;
    private String process;
    private String keyboard;
    
    public void setMonitor(String monitor){
        this.monitor = monitor;
    }

    public String getMonitor() {
        return this.monitor;
        
    }
    public void setKeyboard(String keyboard){
        this.keyboard = keyboard;
    }

    public String getKeyboard() {
        return this.keyboard;
        
    }
    public void setProcess(String process){
        this.process = process;
    }

    public String getProcess() {
        return this.process;
        
    }

    public static void main(String[] args) {
        computer dell = new computer();
         dell.setMonitor("RX50");
        System.out.println(" model is "+ dell.getMonitor()); 
    }

    }
