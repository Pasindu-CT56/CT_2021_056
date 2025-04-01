package Q4;

public class Owner {

    private String ownerName;
    private String phoneNo;

    public Owner(){
       ownerName = "Not Assign";
       phoneNo =  "Not Assign" ;
    }

    public Owner(String ownerName, String phoneNo){
        this.ownerName = ownerName;
        this.phoneNo =  phoneNo ;
    }

    public String getownerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getphoneNo(){
        return phoneNo;
    }

    public void setphoneNo(String phoneNo){
        this.phoneNo = phoneNo;

    }

}
