public class GoogleUpdates implements ISubscriber {
    Integer totalScore = 0;
    Integer overs = 0;

    IPublisher publisher;

    public GoogleUpdates(IPublisher publisher) {
        this.publisher = publisher;
        publisher.addListerner(this);
    }

    @Override
    public void onUpdate(Integer runs) {
        if (runs == -1) {
            totalScore = 0;
            overs = 0;
            return;
        }
        overs++;
        totalScore += runs;
        System.out.println(String.format("GOOGLE: %d runs in %d overs(This over: %d).", totalScore, overs, runs));
    }
}
