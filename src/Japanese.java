public class Japanese extends Human implements Language {
    public Japanese(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    private String nationality;
    @Override
    public String sayGreeting() {
        return "こんにちは";
    }

    @Override
    public String sayGoodbye() {
        return null;
    }

    @Override
    public String sayThanks() {
        return "Japończyk";
    }

    @Override
    public String getType() {
        return "Japończyk";
    }
}
