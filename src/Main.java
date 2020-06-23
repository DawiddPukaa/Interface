public class Main {
    public static void przywitajSie(Language... languages) {
        for (Language h: languages) {
            System.out.println(h.sayGreeting());
            if (h instanceof Human){
                System.out.println("Narodowość obywatela: "+((Human)h).getType());
            }
        }
    }

    public static void main(String[] args) {

        przywitajSie(new English("Mark"),new Polish("Patryk"), new Spanish("Alexandra"), new Japanese("JapończykXD"));

    }
}