import com.minhaplaylist.modelos.MinhasPreferidas;
import com.minhaplaylist.modelos.Musica;
import com.minhaplaylist.modelos.Podcast;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Música
        Musica musica1 = new Musica();
        musica1.setTitulo("Low Light");
        musica1.setCantor("Pearl Jam");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            musica1.curte();
        }

        // Podcast
        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Flow Podcast");
        podcast1.setApresentador("Igor 3k");

        for (int i = 0; i < 500; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i < 200; i++) {
            podcast1.reproduz();
        }

        // Minhas preferidas
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podcast1);
    }
}