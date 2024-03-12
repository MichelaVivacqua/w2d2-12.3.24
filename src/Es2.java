import java.util.*;

public class Es2 {
    public static void main(String[] args) {

        System.out.println("Inserisci il numero di elementi della lista");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> listaNumCasuali = creaListaNumCasuali(n);
        printList(listaNumCasuali);
        List<Integer> ordineInverso = creaListaOrdineInverso(listaNumCasuali);
        printList(ordineInverso);
        pariODispari(ordineInverso, false);
        pariODispari(ordineInverso, true);

        scanner.close();
    }

    public static List<Integer> creaListaNumCasuali(int n) {

        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr.add(rnd.nextInt(0, 101));
        }
        Collections.sort(arr);
        return arr;
    }

    public static List<Integer> creaListaOrdineInverso(List<Integer> list) {
        List<Integer> ordineInverso = new ArrayList<>(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            ordineInverso.add(list.get(i));
        }
        return ordineInverso;
    }

    public static void printList(List<Integer> list) {
        System.out.println("Stampo lista da " + list.size() + "elementi");
        int index = 0;
        for (Integer numero : list) {
            System.out.println("Posizione (" + (index++) + "): " + numero);

        }
    }

    public static void pariODispari(List<Integer> list, boolean even) {
        System.out.println("Stampo lista da " + list.size() + "elementi");
        String pOd = even ? "pari" : "dispari";
        System.out.println("ma stampo solo i numeri in posizione " + pOd);
        int index = 0;
        for (Integer numero : list) {
            index++;
            if (even) {
                if (index % 2 == 0)
                    System.out.println("Posizione [" + index + "]: " + numero);
            } else {
                if (index % 2 != 0)
                    System.out.println("Posizione [" + index + "]: " + numero);
            }

        }
    }
}
