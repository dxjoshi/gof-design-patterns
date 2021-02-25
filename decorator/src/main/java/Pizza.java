public abstract class Pizza {

    String description = "Basic Pizza";

    public String getDescription() {
        return description;
    }

    abstract double price();
}
