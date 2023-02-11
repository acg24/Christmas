public class Salon {
    private Client[] clients;
    private Visit[] visits;
    private int cNum;
    private int vNum;
    public Salon(int maxNumClients, int maxNumVisits){
        this.clients= new Client[maxNumClients];
        this.visits= new Visit[maxNumVisits];
    }

}
