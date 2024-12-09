package decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        Message message = new Message(233788L, "Your house is burning!!!");

        INotifier emailNotifier = new EmailNotifier();
        INotifier smsNotifier = new SmsNotifier(emailNotifier);
        INotifier slackNotifier = new SlackNotifier(smsNotifier);
        INotifier whatsapp = new WhatsapNotifier(slackNotifier);

        whatsapp.notify(message);


    }
}
