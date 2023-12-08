package Pattern10;

public class EmailFacade {
    private MailServer mailServer;
    private MailSender mailSender;

    public EmailFacade() {
        this.mailServer = new MailServer();
        this.mailSender = new MailSender();
    }

    public void sendEmail(String content, String to, String server) {
        Message message = new Message(content);

        mailServer.setServer(server);
        mailSender.sendMail(message, to);
    }
}
