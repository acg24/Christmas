import java.util.Date;

public class Visit {
    private Client vClient;
    private Date vDate;
    private double cost;
    public Visit (Client c,Date d){
        this.vClient=c;
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
        aux= intro-(intro*(vClient.getDiscount()/100));
        cost=cost+aux;
        System.out.println("intro:" + intro + " discount:" + vClient.getDiscount() );
    }
    /*
    =======================================================================================================================================================================
       - Returns the information of the visit.
       */
    public String toString(){
        String result=null;
        result=("| CLIENT: " + this.vClient + " | DATE: " + this.vDate + " | COST: " + this.cost + " |");
        return result;
    }
    /*
    =======================================================================================================================================================================
       - Geters.
       */
    public Client getClient(){
        return this.vClient;
    }
}
