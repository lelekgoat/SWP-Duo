/**
 * Ein Entwickler im Projekt SWP-Duo.
 *
 * @author Armin Dulic (Entwickler A)
 * @author Paul Häfele (Entwickler B)
 */
public class Entwickler {
    private final String rolle;
    private final String name;

    public Entwickler(String rolle, String name) {
        this.rolle = rolle;
        this.name = name;
    }

    public String getRolle() {
        return rolle;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Entwickler " + rolle + ": " + name;
    }
}
