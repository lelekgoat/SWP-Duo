# PHP: typische Schülerfehler

## Bugs
- `$` vor Variablen vergessen; Semikolon fehlt.
- `.` für String-Verkettung, nicht `+`.
- Variablen in einfachen Anführungszeichen werden nicht ersetzt (`'Hallo $name'`).
- `$_POST['feld']` ohne `isset()` oder `??` gibt "Undefined index"-Warnung.
- `==` vergleicht locker (`"0" == false` ist wahr); `===` verwenden.
- `header()` oder `session_start()` nach einer Ausgabe: "headers already sent".
- Formular `method="post"`, Code liest `$_GET`.
- `mysqli`-Fehler nicht geprüft; Verbindung nie geschlossen.

## Struktur / OOP
- Datenbank-Logik, HTML und Verarbeitung in einer Datei vermischt.
- Zugangsdaten mehrfach im Code statt in einer Konfigurationsdatei.
- Klassen: Attribute `public` statt `private`, Konstruktor `__construct` falsch geschrieben.

## Stil
- Variablen `camelCase` oder `snake_case`, aber einheitlich.
- Einrückung bei verschachteltem PHP und HTML.

## Sicherheit (bei PHP besonders wichtig)
- **SQL-Injection:** `"SELECT ... WHERE name = '$_POST[name]'"`. Prepared Statements mit PDO oder `mysqli` verwenden.
- **XSS:** Benutzereingaben ungefiltert ausgeben. Mit `htmlspecialchars()` ausgeben.
- Passwörter mit `md5()`/`sha1()` oder im Klartext. Richtig: `password_hash()` und `password_verify()`.
- Keine Eingabeprüfung (Typ, Länge, leere Felder) auf dem Server, nur im HTML.
- `display_errors` im Livebetrieb an.
