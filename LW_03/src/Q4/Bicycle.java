package Q4;

public class Bicycle {

    private Owner owner;

    public Bicycle(){
        this.owner = new Owner();
    }

    public Bicycle(String ownerName, String phoneNo){
        this.owner = new Owner(ownerName,phoneNo);
    }

    public String getBicycleowner(){
        return this.owner.getownerName();
    }

    public void setBicycleowner(String ownerName){
        this.owner.setOwnerName(ownerName);
    }

    public String getBicyclephoneno(){
        return this.owner.getphoneNo();
    }

    public void setBicyclephoneno(String phoneNo) {
        this.owner.setphoneNo(phoneNo);
    }

}
