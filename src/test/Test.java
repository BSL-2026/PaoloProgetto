package test;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
    public class Test {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Inserisci il nome: ");
            String nome = scanner.nextLine();

            System.out.print("Inserisci il cognome: ");
            String cognome = scanner.nextLine();

            System.out.print("Inserisci il giorno di nascita: ");
            int giorno = scanner.nextInt();

            System.out.print("Inserisci il mese di nascita: ");
            int mese = scanner.nextInt();

            System.out.print("Inserisci l'anno di nascita: ");
            int anno = scanner.nextInt();

            LocalDate dataNascita = LocalDate.of(anno, mese, giorno);

            String giornoSettimana = dataNascita.getDayOfWeek()
                    .getDisplayName(TextStyle.FULL, Locale.ITALIAN);

            System.out.println(nome + " " + cognome +
                    " è nato il " + giornoSettimana +
                    " " + giorno + "/" + mese + "/" + anno);

            scanner.close();
        }
    }