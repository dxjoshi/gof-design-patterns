public class StuffedCrust extends Pizza {

    private String description;

    public StuffedCrust() {
        this.description = "Stuffed crust pizza";
    }

    @Override
    public String getDescription() {
        return description;
    }

    public double price() {
        return 200.0;
    }
}
