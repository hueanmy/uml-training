public class OneWayTicket extends Ticket {
    private boolean valid = true;
    public OneWayTicket(int value){
        super();
    }
    public void setOrigin(Gate gate){
        super.setOrigin(gate);
        if(gate == null){
            value = false;
        }
    }
    public void adjustValue(int amount){}
    public boolean isValid(){return valid;}
}
