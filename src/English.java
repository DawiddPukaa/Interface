public class English extends Human implements Language {
    private String nationality;

    public English(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String sayGreeting() {
        return "Hello";
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
    public String getType(){
        return "Anglik";
    }
}
