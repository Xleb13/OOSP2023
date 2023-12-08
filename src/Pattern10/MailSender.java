package Pattern10;

public class MailSender {
    public void sendMail(Message message, String to) {
        System.out.println("Отправка сообщения на адрес " + to + ": " + message.getContent());
    }
}
