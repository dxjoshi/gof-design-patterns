public interface IPublisher {

    void addListerner(ISubscriber subscriber);
    void removeListerner(ISubscriber subscriber);
    void notifyListerners();
    void publish(Integer overs);
}
