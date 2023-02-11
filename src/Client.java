public class Client {
    private String name;
    private String idCard;
    private boolean member;
    private String membership;/*platinum, gold or premium*/
    public Client (String n, String i, boolean m ,String ms){
        this.name=n;
        this.idCard=i;
        this.member=m;
        this.membership=ms;
    }

    public Client (String n, String i){
        this.name=n;
        this.idCard=i;
        this.member=false;
        this.membership=null;
    }
    /*
    =======================================================================================================================================================================
       - Returns the discount for the client taking into consideration the membership .
       - Platinum=10% | Gold=15% | Premium=20% |
       */
    public int getDiscount(){
        int discount=0;
        if (this.member==true){
            switch(this.membership) {
                case "Platinum":
                    discount=10;
                    break;
                case "Gold":
                    discount=15;
                    break;
                case "Premium":
                    discount=20;
                    break;
                default:
                    discount=0;
            }
        }
        else {
            System.out.println("The user is not a member.");
            discount=0;
        }
        return discount;
    }
    /*
    =======================================================================================================================================================================
       - Returns the information of the client.
       */
    public String toString(){
        String result=null;
        if (this.member==true){
            result=("| NAME: " + this.name + " | ID: " + this.idCard + " | MEMBERSHIP: " + this.membership + " |");
        } else if (this.member==false) {
            result=("| NAME: " + this.name + " | ID: " + this.idCard + " | MEMBER: No | ");
        }
        return result;
    }
    /*
    =======================================================================================================================================================================
       - Geters.
       */
    public String getName(){
        return this.name;
    }
    public String getIdCard(){
        return this.name;
    }
    public String getMembership(){
        return this.membership;
    }
    /*
    =======================================================================================================================================================================
       - Seters.
       */
    public void setMember(boolean intro){

    }
    public void setMembership(String intro){

    }

}
