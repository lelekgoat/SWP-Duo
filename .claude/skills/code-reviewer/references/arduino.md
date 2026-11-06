# Arduino: typische Schülerfehler

Arduino ist C++ mit eigener Bibliothek. Zusätzlich zu den Punkten hier gilt `cpp.md`.

## Bugs
- `pinMode()` in `setup()` vergessen.
- `Serial.begin()` fehlt, oder Baudrate im Code passt nicht zum Seriellen Monitor.
- Taster ohne Pull-up/Pull-down: Eingang "flattert". `INPUT_PULLUP` verwenden, dann ist gedrückt = `LOW`.
- Taster nicht entprellt: ein Druck zählt mehrfach.
- `analogRead()` liefert 0–1023, `analogWrite()` erwartet 0–255; nur PWM-Pins (`~`) können `analogWrite()`.
- `millis()` in `int` gespeichert: Überlauf. `unsigned long` verwenden.
- Variablen in `loop()` deklariert, die ihren Wert behalten sollen (`static` oder global).
- `=` statt `==` in `if (digitalRead(pin) = HIGH)`.
- Pins 0 und 1 belegt, obwohl Serial verwendet wird.

## Effizienz
- `delay()` blockiert alles: Taster und Sensoren reagieren nicht. Mit `millis()` nicht-blockierend lösen.
- Großer `String`-Einsatz fragmentiert den knappen RAM (2 KB beim Uno). Feste Texte mit `F("...")`.
- Zu große Datentypen (`long`, `float`), wo `byte` oder `int` reicht.
- `Serial.print()` in jeder Schleife bremst.

## Struktur
- Pinnummern als magische Zahlen statt `const int LED_PIN = 13;`.
- Alles in `loop()` statt eigener Funktionen.
- Zustände mit vielen `bool`-Variablen statt Zustandsautomat (`switch` mit `enum`).

## Hardware-Hinweise (ansprechen, wenn passend)
- LED ohne Vorwiderstand.
- Motor oder Servo direkt am Pin statt über Treiber oder eigene Versorgung.
