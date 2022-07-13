package Problems;

public class EmployeeService {
    public EmployeeService() {

    }

    // This class violates S.R.P. We should extract sendEmail methods and put it
    // inside a new class called EmailService.

    public void employeeRegistration(Employee employee) {
        // registering an employee
        sendEmail(employee.getEmail(), "Registration", "Congratulations!");
    }

    private void sendEmail(String email, String subject, String message) {
        // Sending an email

        // MIME stands for Multipurpose Internet Main Extensions and it is an extension
        // of the original Simple Mail Transport Protocol (SMTP) email protocol. It lets
        // users exchange different kinds of data files, including audio, video, images
        // and application programs, over email.

        // SMTP stands for Simple Main Transfer Protocol and it is an application that
        // is used to send, receive, and relay outgoing emails between senders and
        // receivers.
    }

}
