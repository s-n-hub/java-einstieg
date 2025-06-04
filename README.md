# Java-Einstiegsübungen

In diesem Repository sammle ich einfache Java-Übungen aus meiner Weiterbildung zur Softwareentwicklerin. Sie  dienen dem Einüben grundlegender Sprachmittel und Konzepte wie Variablen, Eingaben, Verzweigungen, Schleifen und einfache Methoden.

Die Programme sind bewusst einfach gehalten. Sie illustrieren bestimmte Sprachstrukturen und dienen zum Erproben der Java-Syntax. Einige enthalten bereits Hinweise auf mögliche Erweiterungen oder Verbesserungsideen.

## Inhalt

| Übung                                                   | Thema                           | Beschreibung                                                           |
|---------------------------------------------------------|---------------------------------|------------------------------------------------------------------------|
| [DurchschnittsnotenRechner](#durchschnittsnotenrechner) | Variablen, Operatoren, Ausgabe  | Berechnung von Notenpunkten anhand von Schülerzahl und Notenschnitt    |
| [ZweiZahlenRechner](#zweizahlenrechner)                 | Eingaben, Variablen, Operatoren | Führt mit zwei Zahlen alle vier Grundrechenarten durch                 |
| [TierKlassifizierer](#tierklassifizierer)               | Benutzereingabe, Verzweigungen  | Klassifikation nach Lebensdauer und Flugfähigkeit anhand der Eingaben  |
| [SchleifenDemo](#schleifendemo)                         | Schleifen, Benutzereingabe      | Demonstration von while-, do-while- und for-Schleifen                  |
| [TextAdventure](#textadventure)                         | Kontrollstrukturen              | Konsolenbasiertes Escape-Spiel mit Raumlogik und Entscheidungsstruktur |
| ...                                                     | ...                             | ...                                                                    |

## Setup
Alle Programme können direkt in einer Java-IDE ausgeführt werden. SDK: Java 21.

---

---

## DurchschnittsnotenRechner

**Thema:** Variablen, Operatoren, Konsolenausgabe  
**Datei:** `DurchschnittsnotenRechner.java`

**Beschreibung:**  
Berechnet die Gesamtanzahl der Notenpunkte aus einer Schüleranzahl und einer Durchschnittsnote. Die Schüleranzahl wird zuvor erhöht.

**Lernziele:**
- Deklaration und Initialisierung von Variablen (`int`, `double`)
- Arithmetische Operatoren: `*`, `+=`
- Konsolenausgabe mit `System.out.println`

**Erweiterungsideen:**
- Benutzereingabe mit `Scanner`
- Formatierung der Ausgabe
- Umwandlung in eine Methode

---
## ZweiZahlenRechner

**Thema:** Eingaben, Variablen, Operatoren, einfache Verzweigung  
**Datei:** `ZweiZahlenRechner.java`

**Beschreibung:**  
Liest zwei ganze Zahlen über die Konsole ein und führt die vier Grundrechenarten (Addition, Subtraktion, Multiplikation, Division) durch. Eine versuchte Division durch Null wird erkannt und entsprechend behandelt.

**Lernziele:**
- Verwendung des `Scanner` zur Benutzereingabe
- Deklaration und Nutzung von Variablen
- Grundrechenarten mit `int` und Typumwandlung für Division
- Einfache `if-else`-Verzweigung zur Fehlervermeidung
- Konsolenausgabe mit `System.out.println`

**Erweiterungsideen:**
- Auslagerung der Rechenoperationen in eigene Methoden
- Eingabeprüfung für nicht-numerische Inputs
- Auswahl der Rechenart über ein Menü

---
## TierKlassifizierer

**Thema:** Benutzereingabe, if-else-Verzweigung  
**Datei:** `TierKlassifizierer.java`

**Beschreibung:**  
Fragt über die Konsole tierbezogene Informationen ab (Name, Lebensdauer, Flugfähigkeit) und ordnet das Tier anhand der Lebensdauer und Flugfähigkeit einer Kategorie zu. Die Ergebnisse werden formatiert ausgegeben.

**Lernziele:**
- Verwendung des `Scanner`-Objekts zur Benutzereingabe
- Arbeiten mit primitiven Datentypen (`int`, `String`)
- Vergleich von Strings mit `.equalsIgnoreCase()`
- Kontrollstrukturen mit `if`, `else if`, `else`
- Strukturierte Konsolenausgabe

**Erweiterungsideen:**
- ungültige Eingaben abfangen und Möglichkeit zur Neueingabe
- Auslagerung der Klassifikationen in eigene Methoden

---
## SchleifenDemo

**Thema:** Schleifen, Benutzereingabe  
**Datei:** `SchleifenDemo.java`

**Beschreibung:**  
Demonstriert den Einsatz von drei verschiedenen Schleifentypen:
- `while`: Zählt von 1 bis 10
- `do-while`: Fragt wiederholt nach einem „Zauberwort“ (hier: „bitte“)
- `for`: Zählt rückwärts von 10 bis 1

**Lernziele:**
- Verständnis der Unterschiede zwischen `while`, `do-while` und `for`
- Verwendung von Kontrollstrukturen zur Steuerung des Programmablaufs
- Einfache Benutzereingabe mit `Scanner` und Stringvergleich (`equalsIgnoreCase`)

**Erweiterungsideen:**
- Auslagerung der Schleifen in eigene Methoden
- Ausgabe-Verzögerung mit `Thread.sleep()`, um den Zahlenlauf sichtbar zu machen

---
## TextAdventure

**Thema:** Kontrollstrukturen, Konsoleneingabe  
**Datei:** `TextAdventure.java`

**Beschreibung:**  
Ein einfaches Text-Adventure-Spiel, in dem der Spieler mehrere Räume durchläuft und jeweils eine Entscheidung treffen muss, um weiterzukommen. Am Ende kann das Spiel wiederholt werden.

**Lernziele:**
- Verwendung von Kontrollstrukturen: `switch-case`, `while`, `for`, `do-while`
- Konsoleneingabe mit `Scanner`
- Strukturierung eines Spiels mit fortschreitender Spiellogik

**Erweiterungsideen:**
- Unterschiedliche richtige Entscheidungen je Raum
- Auslagerung der Raum-Logik in Methoden
- Eingabe-Validierung und Fehlerbehandlung
- Erweiterung der Spielwelt mit ASCII-Art, Rätseln oder zusätzlichen Story-Elementen
---
