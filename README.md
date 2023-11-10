# EAN Checker

Hier ist ein Beispiel einer Java-Anwendung, die EAN-13-Codes generiert und überprüft. In diesem Code sind verschiedene
Arten von Fehlern eingebaut, die bei der Laufzeit entdeckt werden können. Diese Fehler sind subtil und
testen das Verständnis von Algorithmen, die Arbeit mit Arrays und Strings, sowie das Verhalten von Java unter bestimmten
Bedingungen.


### Fehler zum Entdecken:

**Leichte Fehler:**

1. Kann die Prüfziffer korrekt sein, wenn sie eine `0` ist? Prüfen, ob die Berechnung und Überprüfung der Prüfziffer
   korrekt ist.
2. Wie werden EAN-Codes mit führenden Nullen behandelt?

**Mittelschwere Fehler:**

1. Wie robust ist die Eingabeprüfung? Werden nur Ziffern akzeptiert, oder können auch andere Zeichen durchrutschen?
2. Wird die Prüfziffer korrekt berechnet, auch wenn in der Eingabe des Codes ein Fehler vorliegt?

**Schwere Fehler:**

1. Wird der generierte EAN-Code immer den EAN-13-Standards entsprechen? Was, wenn der Zufallsgenerator eine Zahlenfolge
   generiert, die eine spezielle Bedeutung hat (z.B. Ländercodes)?
2. Die Behandlung der Eingabe ist anfällig für verschiedenste Fehler. Was passiert bei zu langen oder zu kurzen
   Eingaben?
