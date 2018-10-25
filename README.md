# 1819_2ahitm_sew_assignment06
Figuren-Manager; Einleitende Übung zu OO

# Übung Figuren-Manager

## Lehrziele

- Vererbung von Klassen

## Aufgabenstellung

Das Programm soll in der Lage sein, den Flächeninhalt und den Umfang einiger geometrischer Figuren zu berechnen. 

Folgende Figuren sollen berücksichtigt werden:

- Triangle (Seite1, Seite2, eingeschlossener Winkel) - Rechteck (Länge, Breite)
- Quadrat (Seite)
- Ellipse (Hauptachse, Nebenachse)
- Kreis (Radius).

Es können Menü-gesteuert beliebige Figuren erstellt werden, welche alle in einem Array gespeichert werden.
Es können außerdem die Flächeninhalte und Umfänge aller gespeicherten Figuren angezeigt werden.
Erstelle zunächst ein Klassendiagramm der Daten-Klassen.

## Bildschirmausgabe

```
Datenanzeige:
-------------
Quadrat mit Seitenlänge 3: Fläche -> 9, Umfang -> 12
Ellipse mit Hauptachse 10 und Nebenachse 6: Fläche -> 188.496, Umfang -> 51.054
Kreis mit Radius 5: Fläche -> 78.54, Umfang -> 31.416
```

## Hinweis

Erstelle folgende abstrakte Methoden in der Superklasse (Figure), welche dann in den Subklassen überschrieben werden:

```
double area();           // berechnet den Flächeninhalt
double circumference();  // berechnet den Umfang
String output();         // erstellt die Zeichenkette zur Datenausgabe
```
