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
    /*
        =======================================================================================================================================================================
           - Allows to change the cost.
           - intro cost
           - change the cost of the visit.
           */
    public void addCost(int intro){
        double aux=0;
        aux= intro-(intro*(person.getDiscount()/100));
        cost=cost+aux;
        System.out.println("intro:" + intro + " discount:" + person.getDiscount() );
    }

}
