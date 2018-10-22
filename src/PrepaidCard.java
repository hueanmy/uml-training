public class PrepaidCard extends Ticket {
    public PrepaidCard(int value){
        super();
    }
    public void adjustValue(int amount){
        deduct(amound);
    }
    public boolean isValid(){
        return getValue()>0;
    }
}
