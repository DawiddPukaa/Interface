public class Polish extends Human implements Language {
    private String nationality;

    public Polish(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String sayGreeting() {
        return "Dzien dobry";
    }

    @Override
    public String sayGoodbye() {
        return null;
    }

    @Override
    public String sayThanks() {
        return null;
    }

    @Override
    public String getType() {
        return "Polak";
    }

}
