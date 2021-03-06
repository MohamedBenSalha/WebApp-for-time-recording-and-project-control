# Product Backlog

Hier werden **alle** Anforderungen in Form von **User Stories** geordnet aufgelistet.

## Epic 1 *Datenverwaltungssystem*

> Als *Benutzer* möchte ich *Daten in das System eintragen und modifizieren*, um *diese besser verwalten zu können*.

Ausführliche Beschreibung: Der Benutzer soll in der Lage sein, Daten zu Projekten, Kunden & Mitarbeiter in das System einzutragen und nachträglich verändern zu können. Zudem sollte es möglich sein, Mitarbeiter zu Projekten vollständig oder teilweise zuzuordnen, sowie auch von Projekten zu entfernen. Außerdem sollte der Benutzer die Möglichkeit haben, geleistete Leistungen pro Mitarbeiter in das System einzutragen. Zudem sollte das System den Export der Aufwände eines Projekts ermöglichen. Die Web-App sollte dem Nutzer auch Optimierungsvorschläge basierend auf den benötigten Kompetenzen in Projekten machen. Das System kommuniziert zusätzlich mit einem Ticketsystem, um die geleistete Arbeit direkt zu erfassen.

### Feature 1.1 *Kunde hinzufügen*

> Als *Nutzer* möchte ich *Kunden in das System eintragen*, um *sie besser zu verwalten*.

- Aufwandsschätzung: [XS]
- Akzeptanztests:
  - Ein Kunde konnte angelegt werden.
  - Der Kunde ist in der Liste aller Kunden sichtbar.
  - Der Kunde kann nachträglich bearbeitet werden.

#### Implementable Story 1.1.1 *Kunde hinzufügen*

> Als Nutzer möchte ich *Kunden zum System hinzufügen*, um *um eine bessere Übersicht zu haben*

- Aufwandsschätzung: 15 Story Points
- Akzeptanztests:
  - Der Kunde erscheint in der Kundenliste
  - Die Daten des Kundens werden in der Datenbank gespeichert

##### Task 1.1.1.1 *GUI für Kunde hinzufügen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.1.1.2 *Kundendaten in der Datenbank speichern*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 2 Stunden

#### Implementable Story 1.1.2 *Kunde bearbeiten*

> Als Nutzer möchte ich *Kunden im System bearbeiten*, um *Daten des Kundens zu aktualisieren*

- Aufwandsschätzung: 15 Story Points
- Akzeptanztests:
  - Die aktualisierten Daten erscheinen auf dem Profil des Kundens
  - Die Daten des Kundens werden in der Datenbank aktualisiert

##### Task 1.1.2.1 *GUI für Kunde bearbeiten*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.1.2.2 *Kundendaten in der Datenbank aktualisieren*

- Aufwandsschätzung: 0.5 Stunden
- Tatsäschlicher Aufwand : 0.25 Stunden

#### Implementable Story 1.1.3 *Kunde löschen*

> Als Nutzer möchte ich *Kunden aus dem System löschen*, um *irrelevante Kunden aus dem System zu entfernen*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Der Kunde erscheint nicht mehr in der Kundenliste
  - Die Daten des Kundens werden aus der Datenbank gelöscht

##### Task 1.1.2.1 *Pop-up Meldung "Sind Sie sicher Sie wollen den Kunden xyz löschen?"*

- Aufwandsschätzung: 0.2 Stunden
- Tatsäschlicher Aufwand : .5 Stunden

##### Task 1.1.2.2 *Kundendaten aus der Datenbank löschen*

- Aufwandsschätzung: 0.5 Stunden
- Tatsäschlicher Aufwand : 0.25 Stunden

##### Task 1.1.2.3 *Überprüfung ob der Kunde noch offene Projekte hat*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 0.5 Stunden

### Feature 1.2 *Projekt hinzufügen*

> Als *Nutzer* möchte ich *ein Projekt in das System anlegen*, um *die Mitarbeiter besser auf die Proejkte zu verteilen*.

- Aufwandsschätzung: [XS]
- Akzeptanztests:
  - Das Projekt konnte angelegt werden.
  - Das Projekt ist einem Kunden zugeordnet.
  - Der veranschlagte Aufwand ist erfasst.
  - Es wurde noch kein Aufwand geleistet.
  - Das Projekt ist in der Übersicht über alle Projekte vorhanden.

#### Implementable Story 1.2.1 *Projekt hinzufügen*

> Als Nutzer möchte ich *Projekte zum System hinzufügen*, um *um eine bessere Übersicht zu haben*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Das Projekt erscheint in der Projektenliste
  - Die Daten des Projekts werden in der Datenbank gespeichert

##### Task 1.2.1.1 *GUI für Projekt hinzufügen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.2.1.2 *Projektdaten in der Datenbank speichern*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1 Stunde

#### Implementable Story 1.2.2 *Projekt bearbeiten*

> Als Nutzer möchte ich *Projekte im System bearbeiten*, um *Daten des Projekts zu aktualisieren*

- Aufwandsschätzung: 15 Story Points
- Akzeptanztests:
  - Die aktualisierten Daten erscheinen auf dem Profil vom Projekt
  - Die Daten des Projekts werden in der Datenbank aktualisiert

##### Task 1.2.2.1 *GUI für Projekt bearbeiten*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.2.2.2 *Projektdaten in der Datenbank aktualisieren*

- Aufwandsschätzung: 0.5 Stunden
- Tatsäschlicher Aufwand : 0.5 Stunden

#### Implementable Story 1.1.3 *Projekt löschen*

> Als Nutzer möchte ich *Projekte aus dem System löschen*, um *irrelevante Projekte aus dem System zu entfernen*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Das Projekt erscheint nicht mehr in der Projektliste
  - Die Daten des Projekts werden aus der Datenbank gelöscht
  - Die zugeteilten Mitarbeiter für das Projekt werden vom Projekt entfernt
  - Projekte die noch laufen können nicht entfernt werden

##### Task 1.2.2.1 *Pop-up Meldung "Sind Sie sicher Sie wollen das Projekt xyz löschen?"*

- Aufwandsschätzung: 0.2 Stunden
- Tatsäschlicher Aufwand : 0.2 Stunden

##### Task 1.2.2.2 *Projektdaten aus der Datenbank löschen*

- Aufwandsschätzung: 0.5 Stunden
- Tatsäschlicher Aufwand : 0.25 Stunden

##### Task 1.2.2.3 *Überprüfung ob das Projekt noch läuft*

- Aufwandsschätzung: 0.5 Stunden
- Tatsäschlicher Aufwand : 0.5 Stunden

##### Task 1.2.2.4 *Zugeteilte Mitarbeiter vom Projekt entfernen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1 Stunde

### Feature 1.3 *Mitarbeiter und ihre verfügbare Arbeitszeit hinzufügen*

> Als *Nutzer* möchte ich *einen Mitarbeiter und seine Arbeitszeit in das System anlegen*, um *ihn optimal einsetzen zu können*.

- Aufwandsschätzung: [XS]
- Akzeptanztests:
  - Ein Mitarbeiter konnte angelegt werden.
  - Der Mitarbeiter ist in der Liste aller Mitarbeiter sichtbar.
  - Die verfügbare Wochenarbeitszeit ist ersichtlich.

#### Implementable Story 1.3.1 *Mitarbeiter hinzufügen*

> Als Nutzer möchte ich *Mitarbeiter zum System hinzufügen*, um *um eine bessere Übersicht über die Mitarbeiter zu haben*

- Aufwandsschätzung: 15 Story Points
- Akzeptanztests:
  - Der Mitarbeiter erscheint in der Mitarbeiterliste
  - Die Daten des Mitarbeiters werden in der Datenbank gespeichert

##### Task 1.3.1.1 *GUI für Mitarbeiter hinzufügen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.3.1.2 *Mitarbeiterdaten in der Datenbank speichern*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1.5 Stunden

#### Implementable Story 1.3.2 *Mitarbeiter bearbeiten*

> Als Nutzer möchte ich *Mitarbeiter im System bearbeiten*, um *Daten des Mitarbeiters zu aktualisieren*

- Aufwandsschätzung: 15 Story Points
- Akzeptanztests:
  - Die aktualisierten Daten erscheinen auf dem Profil vom Mitarbeiter
  - Die Daten des Mitarbeiters werden in der Datenbank aktualisiert

##### Task 1.3.2.1 *GUI für Mitarbeiter bearbeiten*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.3.2.2 *Mitarbeiterdaten in der Datenbank aktualisieren*

- Aufwandsschätzung: 0.5 Stunden
- Tatsäschlicher Aufwand : 0.5 Stunden

#### Implementable Story 1.1.3 *Mitarbeiter löschen*

> Als Nutzer möchte ich *Mitarbeiter aus dem System löschen*, um *Mitarbeiter zu löschen, die nicht mehr bei der Firma arbeiten*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Der Mitarbeiter erscheint nicht mehr in der Mitarbeiterliste
  - Die Daten des Mitarbeiters werden aus der Datenbank gelöscht
  - Der Mitarbeiter wird aus allen Projekten gelöscht, in denen er zugeteilt war

##### Task 1.3.2.1 *Pop-up Meldung "Sind Sie sicher Sie wollen den Mitarbeiter xyz löschen?"*

- Aufwandsschätzung: 0.2 Stunden
- Tatsäschlicher Aufwand : 0.25 Stunden

##### Task 1.3.2.2 *Mitarbeiterdaten aus der Datenbank löschen*

- Aufwandsschätzung: 0.5 Stunden
- Tatsäschlicher Aufwand : 0.5 Stunden

##### Task 1.3.2.3 *Mitarbeiter von zugeteilten Projekte entfernen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1 Stunde

### Feature 1.4 *Mitarbeiter einem Projekt zuteilen oder entfernen*

> Als *Nutzer* möchte ich *einen Mitarbeiter einem Projekt zuordnen oder entfernen*, um *eine bessere Übersicht über die verschiedenen Projekten und Mitarbeiter zu haben.* 

- Aufwandsschätzung: [S]
- Akzeptanztests:
  - Ein weiterer Mitarbeiter ist dem Projekt zugeordnet.
  - Der Mitarbeiter kann komplett oder teilweise dem Projekt zugeordnet werden.
  - Ein Mitarbeiter kann aus einem Projekt entfernt werden.
  - Der Mitarbeiter wird in der Liste der Mitarbeiter, die dem Projekt zugewiesen sind, angezeigt.
  - Die Gesamtkapazität an verfügbarer Arbeitszeit ist um den zugewiesenen Umfang gestiegen.

#### Implementable Story 1.4.1 *Mitarbeiter einem Projekt zuteilen*

> Als Nutzer möchte ich *Mitarbeiter zu Projekten zuteilen*, um *eine Übersicht über die Auslastungen der Projekte zu haben*

- Aufwandsschätzung: 15 Story Points
- Akzeptanztests:
  - Der Mitarbeiter erscheint in der Liste der Mitarbeiter für das Projekt
  - Nach der Zuteilung ist die verfügbare Arbeitszeit für das Projekt größer und für den Mitarbeiter kleiner

##### Task 1.4.1.1 *Mitarbeiter einem Projekt zuteilen*

- Aufwandsschätzung: 0.5 Stunden
- Tatsäschlicher Aufwand : 0.5 Stunden

##### Task 1.4.1.2 *Verfügbare Arbeitsstunden aktualisieren*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1 Stunde

### Feature 1.5 *Erfassung von geleisteten Aufwänden pro Mitarbeiter*

> Als *Mitarbeiter* möchte ich *meine geleistete Arbeit erfassen*, um *den Aufwand tracken zu können*.

- Aufwandsschätzung: [M]
- Akzeptanztests:
  - Alle relevanten Angaben zum Aufwand konnten erfasst werden:
    - Kurzbeschreibung der geleisteten Arbeit
    - Datum
    - Der geleistete Aufwand
    - Der entsprechende Mitarbeiter
  - Der insgesamt geleistete Aufwand ist entsprechend der erfassten Aufwände gestiegen.

#### Implementable Story 1.5.1 *Mitarbeiter erfasst Arbeitszeiten*

> Als Mitarbeiter möchte ich *meine Arbeitszeiten erfassen*, um *meinen Aufwand tracken zu können*

- Aufwandsschätzung: 30 Story Points
- Akzeptanztests:
  - Der Mitarbeiter erscheint in der Liste der Mitarbeiter für das Projekt
  - Nach der Zuteilung ist die verfügbare Arbeitszeit für das Projekt größer und für den Mitarbeiter kleiner

##### Task 1.5.1.1 *Erfasster Aufwand in Datenbank speichern*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.5.1.2 *Bereits getätigter Aufwand in Projekten aktualisieren*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1 Stunde

### Feature 1.6 *Gesammelte Erfassung von geleisteten Aufwänden pro Mitarbeiter*

> Als *Nutzer* möchte ich *gesammelte geleistete Arbeit ins System importieren*, um *alte Erfassungen in das neue System hinzuzufügen*.

- Aufwandsschätzung: [M]
- Akzeptanztests:
  - Aufwände, die in einer CSV gesammelt wurden, konnten in die Anwendung übernommen werden.
  - Es wurden alle Informationen gespeichert, die auch bei der einzelnen Erfassung vorhanden sind.

#### Implementable Story 1.6.1 *Import von erfassten Aufwänden*

> Als Mitarbeiter möchte ich *bereits getätigten Aufwand aus einer CSV Datei importieren*, um *alte Erfassungen zum System hinzuzufügen*

- Aufwandsschätzung: 20 Story Points
- Akzeptanztests:
  - Der Aufwand wird aus der CSV Datei in die Datenbank transferiert
  - Es wird überprüft, ob die CSV Datei die richtige Struktur und Datentypen beinhält

##### Task 1.6.1.1 *Daten aus CSV Datei lesen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 2.5 Stunden

##### Task 1.6.1.2 *Importierter Aufwand in Datenbank speichern*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.6.1.3 *Defensive Prüfung der CSV Datei (Struktur & Datentypen)*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

### Additional Feature 1.7 *Export der Aufwände für eine Rechnung*

> Als *Mitarbeiter* möchte ich *eine Rechnung für ein Kunde oder das Controlling erstellen*, um *die Kosten des Projekts darzustellen*.

- Aufwandsschätzung: [S]
- Akzeptanztests:
  - Eine CSV-Datei für den gewünschten Kunden und Zeitraum liegt vor.
  - Die CSV-Datei enthält:
    - Kurzbeschreibung der geleisteten Arbeit
    - Datum
    - Der geleistete Aufwand
    - Der entsprechende Mitarbeiter

#### Implementable Story 1.7.1 *Export einer Rechnung*

> Als Mitarbeiter möchte ich *eine Rechnung für ein Projekt exportieren*, um *den Aufwand für das Projekt einschätzen zu können*

- Aufwandsschätzung: 20 Story Points
- Akzeptanztests:
  - Der Aufwand in einer PDF geschrieben und exportiert

##### Task 1.7.1.1 *Aufwand aus der Datenbank lesen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.7.1.2 *CSV Datei erzeugen*

- Aufwandsschätzung: 0.5 Stunden
- Tatsäschlicher Aufwand : 0.25 Stunden

##### Task 1.7.1.3 *CSV Datei anbieten zum runterladen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 0.2 Stunden

### Additional Feature 1.8 *Ergänzung der vorhandenen Kompetenzen für Mitarbeiter und Projekte*

> Als *Mitarbeiter* möchte ich *zu einem Projekt oder Mitarbeiter Kompetenzen hinzufügen*, um *zu sehen welche Kompetenzen für Projekte fehlen*.

- Aufwandsschätzung: [S]
- Akzeptanztests(intern):
  - Kompetenzen können von Mitarbeiter/Projekt hinzugefügt oder entfernt werden
  - Es kann überprüft werden, ob alle Kompetenzen für ein Projekt abgedeckt werden
  - Kompetenzen können zum System hinzugefügt werden
  - Einsicht der hinzugefügten Kompetenzen

#### Implementable Story 1.8.1 *Kompetenz hinzufügen*

> Als Mitarbeiter möchte ich *eine Kompetenz zu einem Projekt oder Mitarbeiter hinzufügen*, damit *ich sehe welche Kompetenzen für Projekte fehlen*.

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Die hinzugefügte Kompetenz ist in der Liste der Kompetenzen des Projekts/Mitarbeiters sichtbar
  - Es kann nicht die gleiche Kompetenz 2 mal hinzugefügt werden
  - Nachdem eine Kompetenz hinzugefügt wurde, werden fehlende Kompetenzen für Projekte und für die Firma geupdatet

##### Task 1.7.1.1 *Kompetenz hinzufügen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.7.1.2 *Fehlende Kompetenzen für Projekte und Firma updaten*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 2 Stunden

#### Implementable Story 1.8.2 *Kompetenz entfernen*

> Als Mitarbeiter möchte ich *eine Kompetenz von einem Projekt oder Mitarbeiter entfernen*, damit *ich sehe welche Kompetenzen für Projekte benötigt werden*.

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Die hinzugefügte Kompetenz ist in der Liste der Kompetenzen des Projekts/Mitarbeiters nicht mehr sichtbar
  - Nachdem eine Kompetenz entfernt wurde, werden fehlende Kompetenzen für Projekte und für die Firma geupdatet

##### Task 1.8.2.1 *Kompetenz löschen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

##### Task 1.8.2.2 *Fehlende Kompetenzen für Projekte und Firma updaten*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 3 Stunden

### Additional Feature 1.9 *Auflistung benötigter Mitarbeiter im Unternehmen an Hand der benötigten Kompetenzen*

> Als *Mitarbeiter* möchte ich *sehen können, welche Mitarbeiter in der Firma wie sehr gebraucht werden*, um *alle Projekte rechtzeitig bewältigen zu können*.

- Aufwandsschätzung: [M]
- Akzeptanztests(intern):
  - Es werden die zusätzlich gebrauchten Mitarbeiter mit einem Bedarf Index angezeigt
  - Benötigen viele Projekte mit geringem Aufwand oder einzelne Projekte mit hohem Aufwand eine Kompetenz, ist der Bedarf hieran hoch.

#### Implementable Story 1.9.1 *Empfehlung für benötigten Mitarbeiter*

> Als *Mitarbeiter* möchte ich *sehen können, welche Mitarbeiter in der Firma wie sehr gebraucht werden*, um *alle Projekte rechtzeitig bewältigen zu können*

- Aufwandsschätzung: 50 Story Points
- Akzeptanztests:
  - Es werden die zusätzlich gebrauchten Mitarbeiter mit einem Bedarf Index angezeigt
  - Der Bedarfsindex wird richtig errechnet

##### Task 1.9.1.1 *Bedarfsindex für neue Mitarbeiter errechnen*

- Aufwandsschätzung: 5 Stunden
- Tatsäschlicher Aufwand : 4 Stunden

##### Task 1.9.1.2 *Benötigten Mitarbeiter anzeigen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 1.5 Stunden

### Additional Feature 1.10 *Auswertung von Projektdaten*

> Als *Nutzer* möchte ich *sehen, wie ich die Mitarbeiter am besten einsetzen kann*, um *Kosten zu sparen und alle Projekte rechtzeitig zu bewältigen*.

- Aufwandsschätzung: [XL]
- Akzeptanztests(intern):
  - Es wird angezeigt ob alle Projekte bewältigt werden können und wie man am besten die Mitarbeiter einsetzen kann
  - Projektkosten je nachdem wie man Mitarbeiter einsetzt werden angezeigt
  - Es wird angezeigt ob es zu Überstunden kommt
  - Ausgelastete bzw. nicht ausgelastete Mitarbeiter werden angezeigt und ein Verbesserungsvorschlag wird gemacht

#### Implementable Story 1.10.1 *Anzeige ob alle Projekte bewältigt werden und ob es zu Überstunden kommt*

> Als *Mitarbeiter* möchte ich *sehen ob aktuell alle Projekte bewältigt werden können und ob es für Mitarbeiter zu Überstunden kommt*, um *besser einschätzen zu können wie die aktuelle Lage ist*

- Aufwandsschätzung: 30 Story Points
- Akzeptanztests:
  - Es wird angezeigt ob alle Projekte bewältigt werden können
  - Es wird angezeigt ob es zu Überstunden kommt

##### Task 1.10.1.1 *Berechnung ob alle Projekte rechtzeitig bewältigt werden*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 2 Stunden

##### Task 1.10.1.2 *Berechnung ob es zu Überstunden kommt*

- Aufwandsschätzung: 4 Stunden
- Tatsäschlicher Aufwand : 3 Stunden

#### Implementable Story 1.10.2 *Verbesserungsvorschläge für den optimalen Einsatz der Mitarbeiter machen*

> Als *Leiter* möchte ich *Vorschläge bekommen, wie ich meine Mitarbeiter optimal einsetzen kann*, um *Kosten zu sparen und alle Projekte rechtzeitig zu bewältigen*

- Aufwandsschätzung: 50 Story Points
- Akzeptanztests:
  - Es werden Verbesserungsvorschläge gemacht, wie die Mitarbeiter eingesetzt werden müssen
  - Die Verbesserungsvorschläge müssen zu einer Kostenoptimierung oder zu einer Zeitoptimierung führen

##### Task 1.10.2.1 *Berechnung für den optimalen Einsatz der Mitarbeiter*

- Aufwandsschätzung: 20 Stunden

##### Task 1.10.2.2 *GUI für die Verbesserungsvorschläge*

- Aufwandsschätzung: 6 Stunden

### Additional Feature 1.11 *Erfassung der Aufwände aus einem Ticketsystem*

> Als *Mitarbeiter* möchte ich *meine bearbeiteten Tickets ins System importieren*, um *sie direkt in meinem Aufwand zu erfassen*.

- Aufwandsschätzung: [L]
- Akzeptanztests(intern):
  - Tickets können aus einem Ticketsystem importiert werden
  - Der Aufwand für das Ticket wird automatisch in das System erfasst
  - Gegebener Task ist nach dem Import erledigt

#### Implementable Story 1.11.1 *Import eines Tickets aus einem Ticketsystem*

> Als *Mitarbeiter* möchte ich *meine bearbeiteten Tickets aus einem Ticketsystem importieren*, um *sie nicht nochmal separat erfassen zu müssen*

- Aufwandsschätzung: 30 Story Points
- Akzeptanztests:
  - Tickets können aus einem Ticketsystem importiert werden
  - Die Zeit für die Bearbeitung der Tickets ist in der Datenbank eingetragen worden
  - Check ob der Mitarbeiter die Zeit nicht doppelt eingetragen hat(Ticket + manuell)

##### Task 1.11.1.1 *Import der Daten aus einem Ticketsystem*

- Aufwandsschätzung: 20 Stunden
- Tatsäschlicher Aufwand : 4 Stunden

##### Task 1.11.1.2 *Eintragung der Daten in die Datenbank*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 2 Stunden

##### Task 1.11.1.3 *Überprüfung ob der Aufwand nicht bereits eingetragen wurde*

- Aufwandsschätzung: 4 Stunden

### Feature 1.12 *Aufsetzen der Java Umgebung*

> Als *Entwickler* möchte ich *an der Webapp programmieren*, deswegen muss die Java Umgebung mit Spring Boot RESTful API implementiert sein.

- Aufwandsschätzung: [S]
- Akzeptanztests(intern):
  - Java Program muss auf dem Server ohne Probleme laufen
  - Man kann auf die Spring Boot API zugreifen

#### Implementable Story 1.12.1 *RESTful API entwickeln*

> Als *Entwickler* möchte ich *das Frontend entwickeln*, deswegen *muss ich bereits mit dem Backend kommunizieren können*

- Aufwandsschätzung: 20 Story Points
- Akzeptanztests:
  - Es werden für die 4 Requests GET POST DELETE PUT Schnittstellen angeboten
  - Die API kommuniziert dann mit der aufgesetzten Datenbank

##### Task 1.12.1.1 *Schnittstelle implementieren*

- Aufwandsschätzung: 10 Stunde
- Tatsäschlicher Aufwand : 15 Stunden

##### Task 1.12.1.2 *Methoden schreiben für den Zugriff auf die Datenbank*

- Aufwandsschätzung: 6 Stunden
- Tatsäschlicher Aufwand : 4 Stunden


### Feature 1.13 *Aufsetzen der Datenbank*

> Als *Entwickler* möchte ich *Daten in einer Datenbank speichern*, um später auf sie zugreifen zu können.

- Aufwandsschätzung: [S]
- Akzeptanztests(intern):
  - Es müssen für alle Entitäten und noch zusätzlich gebrauchten Attribute Tabelle zu Speicherung der Daten erstellt werden
  - Man muss von der Spring Boot API aus auf die Datenbank zugreifen können

#### Implementable Story 1.13.1 *Tabellen erstellen*

> Als *Entwickler* möchte ich *Daten für alle Entitäten und mehr in einer Datenbank speichern*, deswegen *müssen Tabellen für alle Entitäten und mehr existieren*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Es werden für Kunden, Mitarbeiter und Projekte erstellt
  - Zusätzliche Größen wie geleisteter Aufwand haben auch eine eigene Tabelle

##### Task 1.13.1.1 *Tabellen erstellen*

- Aufwandsschätzung: 10 Stunden
- Tatsäschlicher Aufwand : 9.5 Stunden






## Epic 2 *User Interface*

> Als *Benutzer* möchte ich *eine Liste der Mitarbeiter, Projekte, Charts etc. sehen*, um *mir einen besseren Überblick zu erschaffen*.

Ausführliche Beschreibung: Der Benutzer soll in der Lage sein, Daten zu Projekten, Kunden & Mitarbeiter einsehen zu können. Diese werden in einer Liste untereinander angezeigt, mit der Möglichkeit diese nach einem Attribut sortieren oder filtern zu können. Zu jedem Kunden, Projekt und Mitarbeiter sollte es ein Vorschaufenster geben, wo man alle Informationen auf einem Blick sehen kann. Zusätzlich gibt es Charts, die verschiedene Informationen visualisieren.

### Feature 2.1 *Einsicht aller Kunden*

> Als *Nutzer* möchte ich *alle Kunden einsehen*, um *mir einen besseren Überblick zu verschaffen*.

- Aufwandsschätzung: [S]
- Akzeptanztests:
  - Alle erfassten Kunden können auf einen Blick eingesehen werden.
  - Die Detailansicht zu einem Kunden kann geöffnet werden. Es sind alle Kundendaten und die zugewiesenen Projekte einsehbar.

#### Implementable Story 2.1.1 *Alle Kunden werden in einer Liste angezeigt*

> Als *Benutzer* möchte ich *alle Kunden in einer Liste untereinander sehen*, um einen *Überblick über alle Kunden zu haben*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Alle Kunden die in der Datenbank gespeichert sind werden angezeigt
  - Die Daten der Kunden werden richtig angezeigt

##### Task 2.1.1.1 *Liste dynamisch befüllen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 2 Stunden


##### Task 2.1.1.2 *Detaillierte Anzeige von einem Kunde erstellen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1 Stunde

### Feature 2.2 *Einsicht aller Projekte*

> Als *Nutzer* möchte ich *alle Projekte einsehen*, um *mir einen besseren Überblick zu verschaffen und um einschätzen zu können, ob Resourcen noch benötigt werden*.

- Aufwandsschätzung: [S]
- Akzeptanztests:
  - Alle erfassten Projekte können auf einen Blick eingesehen werden.
  - Der geplante Aufwand sowie der geleistete Aufwand werden pro Projekt angezeigt.
  - Der Status des Projekts wird angezeigt.
  - Der insgesamt geplante Aufwand über alle Projekte wird angezeigt.
  - Die Projektliste kann speziell für einen Kunden angezeigt werden.

#### Implementable Story 2.2.1 *Alle Projekte werden in einer Liste angezeigt*

> Als *Benutzer* möchte ich *alle Projekte in einer Liste untereinander sehen*, um einen *Überblick über alle Projekte zu haben*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Alle Projekte die in der Datenbank gespeichert sind werden angezeigt
  - Die Daten der Projekte werden richtig angezeigt

##### Task 2.2.1.1 *Liste dynamisch befüllen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 2 Stunden

##### Task 2.2.1.2 *Detaillierte Anzeige von einem Projekt erstellen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1 Stunde


### Feature 2.3 *Einsicht aller Mitarbeiter*

> Als *Nutzer* möchte ich *alle Mitarbeiter einsehen*, um *sie optimal einsetzen zu können*.

- Aufwandsschätzung: [S]
- Akzeptanztests:
  - Alle Mitarbeiter können auf einen Blick eingesehen werden.
  - Sowohl die verfügbare Arbeitszeit, als auch die auf Projekte geplante Arbeitszeit ist ersichtlich.
  - Die insgesamt verfügbare Arbeitszeit über alle Mitarbeiter wird angezeigt.

#### Implementable Story 2.3.1 *Alle Mitarbeiter werden in einer Liste angezeigt*

> Als *Benutzer* möchte ich *alle Mitarbeiter in einer Liste untereinander sehen*, um einen *Überblick über alle Mitarbeiter zu haben*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Alle Mitarbeiter die in der Datenbank gespeichert sind werden angezeigt
  - Die Daten der Mitarbeiter werden richtig angezeigt

##### Task 2.3.1.1 *Liste dynamisch befüllen*

- Aufwandsschätzung: 2 Stunden
- Tatsäschlicher Aufwand : 2 Stunden

##### Task 2.3.1.2 *Detaillierte Anzeige von einem Mitarbeiter erstellen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1 Stunde

### Additional Feature 2.4 *Visualisierung der Projektauslastung in Form von Charts*

> Als *Mitarbeiter* möchte ich *die Projektauslastungen visualisiert bekommen*, um *besser zu verstehen wo Resourcen noch gebraucht werden und wo nicht*.

- Aufwandsschätzung: [S]
- Akzeptanztests(intern):
  - Die dargestellten Informationen entsprechen genau den Daten aus der Datenbank.
  - Die Berechnungen für die verschiedenen Charts wurden richtig durchgeführt.

#### Implementable Story 2.4.1 *Für jedes Projekt gibt es eine Visualisierung für die Projektauslastung*

> Als *Benutzer* möchte ich *für jedes Projekt die Auslastung in Form von Charts sehen*, um ein *besseres Verständnis von der Auslastung zu bekommen*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Die visualisierten Daten stimmen mit den Daten aus der Datenbank überein
  - Die Visualisierung ist einfach zu verstehen

##### Task 2.4.1.1 *Charts erstellen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 3 Stunden


##### Task 2.4.1.2 *Charts mit Daten befüllen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 2 Stunden



### Feature 2.5 *Vollständige GUI mit Menü und Searchbar*

> Als *Nutzer* möchte ich *eine übersichtliche und intuitive GUI haben*, um *schneller meine Aufgaben zu erledigen*.

- Aufwandsschätzung: [M]
- Akzeptanztests(intern):
  - Die GUI ist übersichtlich und intuitiv
  - Die Webapp kann auch auf mobilen Endgeräten ohne Einschränkung genutzt werden

#### Implementable Story 2.5.1 *Menü auf der linken Seite erstellen*

> Als *Benutzer* möchte ich *ein Menü haben*, um *besser von einer Ansicht auf die andere zu wechseln*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Das Menü hat Knöpfe für alle Views
  - Das Menü ist responsive und verschwindet wenn das Display zu klein ist

##### Task 2.5.1.1 *Menü mit Knöpfe erstellen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 0.5 Stunde


##### Task 2.5.1.2 *Das Menü responsive machen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 1 Stunde

#### Implementable Story 2.5.2 *Searchbar oben erstellen*

> Als *Benutzer* möchte ich *nach verschiedenen Suchen*, um *schneller an Informationen zu kommen*

- Aufwandsschätzung: 10 Story Points
- Akzeptanztests:
  - Die Searchbar hat einen Searchfeld

##### Task 2.5.2.1 *Searchbar erstellen*

- Aufwandsschätzung: 1 Stunde
- Tatsäschlicher Aufwand : 2 Stunden
