# C++: typische Schülerfehler

## Bugs
- Variablen nicht initialisiert: zufälliger Wert.
- Array-Grenzen überschritten: kein Fehler, sondern undefiniertes Verhalten.
- `=` statt `==` in `if`.
- `cin >> x` gefolgt von `getline()` liest eine leere Zeile.
- Ganzzahl-Division `5 / 2` ergibt `2`.
- Rückgabe einer Referenz oder eines Zeigers auf eine lokale Variable.
- `new` ohne `delete` (Speicherleck); `delete` statt `delete[]` bei Arrays.
- Zeiger nach `delete` weiterverwendet; `nullptr` nicht geprüft.
- Semikolon nach Klassendefinition vergessen.
- Parameter als Kopie übergeben, obwohl die Funktion ihn ändern soll (Referenz `&` fehlt).

## OOP
- Attribute `public` statt `private`.
- Klasse verwaltet Speicher, aber kein Destruktor (Regel der Drei / Fünf).
- Basisklasse ohne `virtual` Destruktor bei Vererbung.
- Methoden, die nichts ändern, nicht als `const` markiert.
- Konstruktor ohne Initialisierungsliste.

## Effizienz
- Große Objekte (`string`, `vector`) als Kopie statt `const &` übergeben.
- `std::endl` in Schleifen statt `'\n'` (leert jedes Mal den Puffer).

## Stil
- `using namespace std;` in Header-Dateien.
- Rohe Arrays und `new` statt `std::vector`, `std::string`, Smart Pointer.
- Header ohne Include-Guards oder `#pragma once`.
