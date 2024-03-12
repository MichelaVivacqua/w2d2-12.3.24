import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Es3 {
    private static final Map<String, String> rubrica = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            aggiungiContatto("Mario Bros", "123456789");
            aggiungiContatto("Luigi Bros", "987654321");
            aggiungiContatto("Peach", "789456123");
            aggiungiContatto("Daisy", "456123789");
            System.out.println("Aggiunti " + rubrica.size() + " contatti");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int rubricaIniziale = rubrica.size();
        rimuoviContatto("Peach");
        System.out.println("Rimossi " + (rubricaIniziale - rubrica.size()) + " contatti");

        System.out.print("Inserisci un numero di telefono da cercare: ");
        String numeroDaCercare = scanner.nextLine();
        cercaConNumero(numeroDaCercare);

        System.out.print("Inserisci un nome da cercare: ");
        String nomeDaCercare = scanner.nextLine();
        cercaConNome(nomeDaCercare);

        rubricaAggiornata();
    }

    private static void aggiungiContatto(String name, String phone) {
        rubrica.put(name, phone);
    }

    private static void rimuoviContatto(String name) {
        rubrica.remove(name);
    }

    private static void cercaConNumero(String phone) {
        String result = "";
        for (String name : rubrica.keySet()) {
            if (phone.equals(rubrica.get(name))) {
                result = name;
            }
        }
        System.out.println(!result.isEmpty() ? "Il nome associato al numero è: " + result : "Contatto non trovato");
    }

    private static void cercaConNome(String name) {
        String phone = rubrica.get(name);
        System.out.println(phone != null ? "Il numero associato al nome è: " + phone : "Contatto non trovato");
    }

    private static void rubricaAggiornata() {
        System.out.println("Rubrica aggiornata:");
        for (String name : rubrica.keySet()) {
            System.out.println("Nome: " + name + ", numero di telefono: " + rubrica.get(name));
        }
    }
}
