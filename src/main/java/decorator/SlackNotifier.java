package decorator;

public class SlackNotifier extends NotifierDecorator {

    protected SlackNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(Message message) {
        super.notify(message);
        System.out.println("Slack Notifier: " + message.message());
    }
}
