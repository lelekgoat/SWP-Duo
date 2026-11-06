# Python: typische Schülerfehler

## Bugs
- `input()` liefert immer einen String: `input() + 1` gibt `TypeError`. Mit `int()` umwandeln.
- `IndentationError`: Tabs und Leerzeichen gemischt, oder Einrückung nach `if`/`for`/`def` fehlt.
- `=` statt `==` in Bedingungen.
- `range(1, 10)` endet bei 9, nicht bei 10.
- Veränderliche Standardwerte: `def f(liste=[])` teilt die Liste zwischen allen Aufrufen.
- Liste ändern, während man darüber iteriert.
- Funktion gibt nichts zurück (`print` statt `return`), Ergebnis ist `None`.
- Variable in Funktion zuweisen, die global ist: `UnboundLocalError`.
- `/` liefert immer `float`, `//` ist ganzzahlige Division.

## OOP
- `self` als erster Parameter von Methoden vergessen.
- Attribute in `__init__` nicht mit `self.` gespeichert.
- Klassenattribut statt Instanzattribut (geteilte Liste zwischen allen Objekten).
- `__str__` fehlt für lesbare Ausgabe.
- Interne Attribute ohne `_`-Präfix, wenn sie nicht von außen geändert werden sollen.

## Stil (PEP 8)
- Funktionen und Variablen `snake_case`, Klassen `PascalCase`, Konstanten `GROSS`.
- 4 Leerzeichen Einrückung.
- `if x == True` statt `if x`; `if len(liste) == 0` statt `if not liste`.
- `for i in range(len(liste))` statt `for element in liste` oder `enumerate()`.

## Sicherheit
- `eval()` auf Benutzereingaben.
- SQL mit f-Strings statt Platzhaltern (`cursor.execute("... WHERE id = ?", (id,))`).
- Leeres `except:` fängt alle Fehler, auch Tippfehler.
