public class ThinCrust extends Pizza {

    private String description;

    public ThinCrust() {
        this.description  = "Thin crust pizza";
    }

    @Override
    public String getDescription() {
        return description;
    }

    public double price() {
        return 100.0;
    }
}
