# SQL: typische Schülerfehler

## Bugs
- `= NULL` statt `IS NULL`.
- `GROUP BY` fehlt oder unvollständig: Spalte im `SELECT`, die weder gruppiert noch aggregiert ist.
- `WHERE` mit Aggregatfunktion statt `HAVING` (`WHERE COUNT(*) > 2` ist falsch).
- `JOIN` ohne `ON`-Bedingung erzeugt ein Kreuzprodukt.
- `INNER JOIN`, wo `LEFT JOIN` nötig ist: Datensätze ohne Partner verschwinden.
- Strings in doppelten statt einfachen Anführungszeichen (je nach DBMS).
- `UPDATE` oder `DELETE` ohne `WHERE` ändert alle Zeilen.
- `AND`/`OR` ohne Klammern, falsche Rangfolge.
- `LIKE` ohne `%` wirkt wie `=`.

## Struktur / Datenmodell
- Kein Primärschlüssel; Fremdschlüssel ohne `FOREIGN KEY`-Constraint.
- Nicht normalisiert: Wiederholungsgruppen (Telefon1, Telefon2), Daten doppelt gespeichert.
- Falsche Datentypen: Preis als `FLOAT` statt `DECIMAL`, Datum als `VARCHAR`.
- `SELECT *` statt benötigter Spalten.

## Stil
- Schlüsselwörter groß (`SELECT`, `FROM`), Tabellen und Spalten klein und einheitlich.
- Tabellen-Aliase bei Joins (`k.name`), damit Spalten eindeutig sind.
- Eine Klausel pro Zeile bei längeren Abfragen.

## Sicherheit
- SQL-Injection: Abfrage aus Benutzereingaben zusammengesetzt statt Prepared Statements.
- Passwörter im Klartext gespeichert.
