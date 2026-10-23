/**
 * Einstiegspunkt des Projekts SWP-Duo.
 *
 * @author Armin Dulic (Entwickler A)
 * @author Paul Häfele (Entwickler B)
 */
public class Main {
    public static void main(String[] args) {
        Entwickler entwicklerA = new Entwickler("A", "Armin Dulic");
        Entwickler entwicklerB = new Entwickler("B", "Paul Häfele");

        System.out.println(entwicklerA);
        System.out.println(entwicklerB);
    }
}
