package Library;

public class SubscriberAddress {
    public SubscriberAddress(String strName, int strNum, String city, String country, int zip){
        this.strName = strName;
        this.strNum = strNum;
        this.city = city;
        this.country = country;
        this.zip = zip;
    }

    private String strName;
    private int strNum;
    private String city;
    private String country;
    private int zip;
}
