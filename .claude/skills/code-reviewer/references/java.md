# Java: typische Schülerfehler

## Bugs
- Strings mit `==` statt `.equals()` vergleichen.
- `NullPointerException`: Objekt deklariert, aber nie mit `new` erzeugt; Array von Objekten angelegt, Elemente aber leer.
- `ArrayIndexOutOfBoundsException`: `i <= array.length` statt `i < array.length`.
- Ganzzahl-Division: `5 / 2` ergibt `2`. Für Kommazahlen `5.0 / 2` oder Cast.
- `Scanner`: `nextInt()` lässt das Zeilenende im Puffer, danach liefert `nextLine()` einen leeren String.
- Semikolon nach `if (...)` oder `for (...)` beendet die Anweisung sofort.
- Fehlendes `break` im `switch`.
- Methode mit Rückgabetyp, aber nicht jeder Zweig hat ein `return`.
- `ConcurrentModificationException`: Element aus `ArrayList` in einer for-each-Schleife entfernen.

## OOP
- Attribute `public` statt `private` mit Getter/Setter (Kapselung).
- Konstruktor setzt Attribute nicht, weil Parameter gleich heißt und `this.` fehlt (`name = name;`).
- Alles in `main` oder `static`, statt Objekte zu verwenden.
- `equals()` überschrieben, aber `hashCode()` nicht.
- `toString()` fehlt, Ausgabe zeigt `Kunde@1b6d3586`.
- Vererbung, wo Komposition passt ("ist ein" vs. "hat ein").

## Stil
- Klassen `PascalCase`, Methoden und Variablen `camelCase`, Konstanten `GROSS_MIT_UNTERSTRICH`.
- Eine öffentliche Klasse pro Datei, Dateiname = Klassenname.
- Magische Zahlen durch benannte Konstanten ersetzen.

## Sicherheit
- JDBC: SQL mit String-Verkettung statt `PreparedStatement`.
- `Scanner`/Ressourcen nicht geschlossen; besser `try-with-resources`.
- Leerer `catch`-Block verschluckt Fehler.
