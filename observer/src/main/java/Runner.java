public class Runner {
    public static void main(String[] args) {
        IPublisher cricketScore = new CricketMatchUpdate();
        // Adding subscribers to the Cricket Updates publisher
        ISubscriber google = new GoogleUpdates(cricketScore);
        ISubscriber cricbuzz = new Cricbuzz(cricketScore);

        // Start the match
        System.out.println("--------------------T-20 match updates--------------------");
        cricketScore.publish(20);
        System.out.println("--------------------ODI match updates--------------------");
        cricketScore.publish(50);
        System.out.println("--------------------Test match updates--------------------");
        cricketScore.publish(120);

    }
}
