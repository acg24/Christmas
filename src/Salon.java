public class Salon {
    private Client[] clients;
    private Visit[] visits;
    private int cNum;
    private int vNum;
    public Salon(int maxNumClients, int maxNumVisits){
        this.clients= new Client[maxNumClients];
        this.visits= new Visit[maxNumVisits];
    }
    /*
    =======================================================================================================================================================================
       - Intro a idCard(String).
       - return the client with that idCard.
       */
    public Client getClient(String intro){
        Client result=null;
        for (int i=0; i<clients.length;i++){
            if (clients[i].getIdCard()==intro){
                result=clients[i];
            }
        }
        return result;
    }
    /*
   =======================================================================================================================================================================
      - Intro a Client.
      - Add it to clients array.
      */
    public void addClient(Client intro){
        int aux=0;
        for (int i=0; i<clients.length;i++){
            if (clients[i]==null && aux<1){
                clients[i]=intro;
                i++;
                System.out.println("The client " + clients[i].getName() +" is correctly added.");
            }
        }
    }
    /*
   =======================================================================================================================================================================
      - Intro a idCard(String).
      - Delete it from clients array.
      */
    public void unsuscribeClient(String intro){
        for (int i=0; i<clients.length;i++){
            if (clients[i].getIdCard()==intro){
                clients[i].setMember(false);
                clients[i].setMembership("");
            }
        }
    }
    /*
   =======================================================================================================================================================================
      - Intro a idCard(String) and a membership(String) .
      - change the membership of the client by the one that you intro.
      */
    public void setMembershipClient(String introId , String introm){
        for (int i=0; i<clients.length;i++){
            if (clients[i].getIdCard()==introId){
                clients[i].setMembership(introm);
            }
        }
    }
    /*
   =======================================================================================================================================================================
      - Intro a Visit.
      - Add it to visits array.
      */
    public void addVisit(Visit intro){
        int aux=0;
        for (int i=0; i<clients.length;i++){
            if (visits[i]==null && aux<1){
                visits[i]=intro;
                i++;
                System.out.println("The visit is correctly added.");
            }
        }
    }
}
