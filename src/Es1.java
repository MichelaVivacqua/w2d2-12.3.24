import java.util.*;

        public class Es1 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Set<String> parole = new HashSet<>();
                List<String> duplicati = new ArrayList<>();

                System.out.println("Inserisci il numero di parole da inserire nel set");
                int numParole = Integer.parseInt(scanner.nextLine());

                if (numParole > 0) {

                    for (int i = 0; i < numParole; i++) {
                        System.out.println("Aggiungi una parola al set");
                        String parola = scanner.nextLine();
                        boolean added = parole.add(parola);
                        if (!added) {
                            System.out.println(parola + " è già nel set");
                            duplicati.add(parola);
                        }
                    }

                    System.out.println("Numero di parole distinte: " + parole.size());
                    System.out.println("Elenco delle parole distinte: " + parole);
                    System.out.println("Elenco delle parole duplicate: " + duplicati);
                } else {
                    System.err.println("Inserisci un numero intero maggiore di 0");
                }

                scanner.close();
            }
        }