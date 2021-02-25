import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CricketMatchUpdate implements IPublisher {

    List<ISubscriber> subscribers;
    Integer runsPerOVer;

    public CricketMatchUpdate() {
        this.subscribers = new ArrayList<>();
    }

    public void addListerner(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeListerner(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyListerners() {
        subscribers.forEach(subscriber -> subscriber.onUpdate(runsPerOVer));
    }

    private void update(Integer runs) {
        this.runsPerOVer = runs;
        notifyListerners();
    }

    public void publish(Integer overs) {
        update(-1);
        Random random = new Random();
        int max = 5; // Test match
        if (overs <= 20) {
         //T20 match
            max = 20;
        } else if (overs <= 50){
         // ODI match
            max = 10;
        }
        for (int i = 1; i <= overs; i++) {
            try {
                Thread.sleep(200);
                update(random.nextInt(max+1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
