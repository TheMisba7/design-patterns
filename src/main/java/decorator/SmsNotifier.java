package decorator;

public class SmsNotifier extends NotifierDecorator{

    protected SmsNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(Message message) {
        super.notify(message);
        System.out.println("SMS Notifier: " + message.message());
    }
}
