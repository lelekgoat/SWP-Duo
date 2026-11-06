# HTML (und CSS): typische Schülerfehler

## Bugs
- Tags nicht oder falsch verschachtelt geschlossen (`<b><i>Text</b></i>`).
- `<!DOCTYPE html>`, `<meta charset="UTF-8">` oder `lang`-Attribut fehlt: Umlaute kaputt.
- `id` mehrfach vergeben; `id` ist eindeutig, für Gruppen `class` verwenden.
- Relative Pfade zu Bildern oder CSS falsch (Groß-/Kleinschreibung, falscher Ordner).
- Formular: `name`-Attribut fehlt, dadurch kommt das Feld nicht beim Server an.
- `<label for>` passt nicht zur `id` des Eingabefelds.
- Block-Elemente in Inline-Elementen (`<div>` in `<span>`, `<p>` in `<p>`).

## Struktur
- Nur `<div>` statt semantischer Elemente (`<header>`, `<nav>`, `<main>`, `<footer>`, `<section>`).
- Überschriften-Hierarchie übersprungen (`<h1>` dann `<h4>`).
- Inline-Styles (`style="..."`) überall statt eigener CSS-Datei.
- Tabellen für das Seitenlayout.

## Barrierefreiheit
- `alt`-Text bei `<img>` fehlt.
- Links mit Text "hier klicken".
- Zu geringer Farbkontrast.

## Stil
- Einheitliche Einrückung, Attribute in Kleinbuchstaben, Werte in Anführungszeichen.

## Sicherheit
- Passwortfeld nicht `type="password"`.
- Formulardaten mit `method="get"` versenden: Passwort steht in der URL.
- Eingabeprüfung nur mit `required`/`pattern` im HTML: Der Server muss trotzdem prüfen.
- `target="_blank"` ohne `rel="noopener"`.
