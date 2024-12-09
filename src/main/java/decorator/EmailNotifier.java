package decorator;

public class EmailNotifier implements INotifier {
    @Override
    public void notify(Message message) {
        System.out.println("Email Notifier: " + message.message());
    }
}
