import java.util.Date;

public class Visit {
    private Client person;
    private Date vDate;
    private double cost;
    public Visit (Client c,Date d){
        this.person=c;
        this.vDate=d;
        this.cost=0;
    }

}
