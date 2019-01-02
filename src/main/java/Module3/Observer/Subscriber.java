package Module3.Observer;

public interface Subscriber {
    public void registerPublisher(Publisher p);

    public void removePublisher(Publisher p);

    public void notifyPublishers();

}