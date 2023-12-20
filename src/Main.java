import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Studenti studente1 = new Studenti("Elian Bertola",23);
        Studenti studente2 = new Studenti("Carlo Montanari", 32);
        Studenti studente3 = new Studenti("Lionel Messi", 36);
        Studenti studente4 = new Studenti("Cristiano Ronaldo",38);

        List<Studenti> listaStudenti = new ArrayList<>();
        listaStudenti.add(studente1);
        listaStudenti.add(studente2);

        System.out.println(listaStudenti);

        listaStudenti.add(studente3);
        listaStudenti.add(studente4);

        System.out.println(listaStudenti);

    }
}