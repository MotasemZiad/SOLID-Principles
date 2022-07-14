package DIP;

public class Notification {
    // DI Dependency Inversion is the concept
    // DI Dependency Injection is the implementation

    private Gmail gmail = new Gmail("address", "miziad2000@gmail.com", "moatasem.abunema@gmail.com");
    private Hotmail hotmail = new Hotmail("address", "miziad2000@gmail.com", "moatasem.abunema@gmail.com");

    public void sendGmail() {
        gmail.send();
    }

    public void sendHotmail() {
        hotmail.send();
    }
}
