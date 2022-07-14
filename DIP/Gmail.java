package DIP;

public class Gmail {
    private String address;
    private String from;
    private String to;

    public Gmail() {
    }

    public Gmail(String address, String from, String to) {
        this.address = address;
        this.from = from;
        this.to = to;
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

    public void send() {
        // Code
    }
}
