import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Client c0= new Client("jon","0000");
        Client c1= new Client("jone","1111");
        Client c2= new Client("mikel","2222");
        Client c3= new Client("mikele","3333");
        Client c4= new Client("amets","4444");
        Salon salon0 = new Salon(10, 10);
        salon0.addClient(c0);
        salon0.addClient(c1);
        salon0.addClient(c2);
        salon0.setMembershipClient("0000", "Premium");
        salon0.setMembershipClient("1111", "Gold");
        System.out.println(c0.toString());
        Date date0=new java.util.Date();
        Date date1=new java.util.Date();
        Date date2=new java.util.Date();
        Visit v0 = new Visit(c0, date0);
        Visit v1 = new Visit(c1, date1);
        Visit v2 = new Visit(c2, date2);
        v0.addCost(50);
        v1.addCost(50);
        v2.addCost(50);
        salon0.addVisit(v0);
        salon0.addVisit(v1);
        salon0.addVisit(v2);
        salon0.ShowVisits();
    }
}
