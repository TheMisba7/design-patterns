package decorator;

public abstract class NotifierDecorator implements INotifier {
    private final INotifier notifier;

    protected NotifierDecorator(INotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notify(Message message) {
        notifier.notify(message);
    }
}
