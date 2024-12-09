package decorator;

public class WhatsapNotifier extends NotifierDecorator {

    protected WhatsapNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(Message message) {
        super.notify(message);
        System.out.println("Whatsapp Notifier: " + message.message());
    }
}
