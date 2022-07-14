package DIP;

public class Hotmail implements IMessage{
    private String address;
    private String from;
    private String to;

    public Hotmail(String address, String from, String to) {
        this.address = address;
        this.from = from;
        this.to = to;
    }

    public Hotmail() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public void send() {
        // Code
    }
}
