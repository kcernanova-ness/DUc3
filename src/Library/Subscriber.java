package Library;

public class Subscriber {
    public Subscriber(String firstN, String lastN, SubscriberAddress address, String email, int age){
        this.firstN = firstN;
        this.lastN = lastN;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public Subscriber(String firstN, String lastN, SubscriberAddress address, String email){
        this.firstN = firstN;
        this.lastN = lastN;
        this.address = address;
        this.email = email;
    }

    private String firstN;
    private String lastN;
    private SubscriberAddress address;
    private String email;
    private int age;
}
