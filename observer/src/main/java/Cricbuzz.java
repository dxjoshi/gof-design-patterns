public class Cricbuzz implements ISubscriber {
    Integer totalScore = 0;
    Integer overs = 0;

    IPublisher publisher;

    public Cricbuzz(IPublisher publisher) {
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
        System.out.println(String.format("CRICBUZZ: Total score: %d | Overs: %d| Run rate: %.2f(This over: %d).", totalScore, overs,
                (double) totalScore/overs, runs));
    }
}
