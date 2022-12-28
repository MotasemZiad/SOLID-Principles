package DIP;

public class Notification {
    // DI Dependency Inversion is the concept
    // DI Dependency Injection is the implementation
    private IMessage mailService;

    // Constructor Injection
    public Notification(IMessage mailService) {
        this.mailService = mailService;
    }

    public Notification() {
    }

    // Method Injection
    public void sendMail(IMessage mailService) {
        mailService.send();
    }

    // Method Overloading
    public void sendMail() {
        mailService.send();
    }
}
