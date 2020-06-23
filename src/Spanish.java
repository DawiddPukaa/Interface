public class Spanish extends Human implements Language {
    private String nationality;

    public Spanish(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String sayGreeting() {
        return "Hola";
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
        return "Hiszpan";
    }
}
