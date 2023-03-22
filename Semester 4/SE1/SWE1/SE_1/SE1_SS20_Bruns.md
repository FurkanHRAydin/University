Software engineriring Bruns

## Fragen

* was sind funktionale und nicht funktionale (nicht funtkional + 3 beispiele)
* warum müssen icht funktionale quatifizierbar sein
* wie oft wird analayse schritt durchgeführt
* was sind Boundary, Controll und entityklassen, und wie werden diese im Sequenzdiagramm mit einem Akteur benutz

## Singelton Pattern Ankreuzaufgabe zu Java (wie wird die klasse richtig geschrieben, ankreuzen)

```
public class Singelton {
	private static Singelton instance = null;

	private Singelton() {}

	public static Singelton getInstance() {
		if (this.instance == null) {
			this.instance = new Singelton();
		}

		return this.instance;
	}
}
```

## UML für Stategie Pattern mit MWST berechnen

* Entwerfen Sie ein UML Diagramm für Folgende Strategie: Es soll eine Auftragsmanager geben, in diesem kann man für jedes land einen Strategie implementieren (setMWST()) die die MWST für ein land berechen, diese soll zur laufzeit wechselbar sein. berechneMWST(int) : int
* Schreiben Sie die klassen des Patterns im Javacode

## Aktivitätsdiagramm Studentin ($S) buch bibiotheka ($B)

* 2 Akteure, $S hat sich für ein buch entschieden und geht damit zum $B, $B nimmt das buch entgegen und prüft das buch ob es ausgeliehen werden kann. Wenn ja fragt $B nach der Karte von $S und gibt dann die Buchnummer, und die Kundennummer im system ein(das soll parallel stattfinden könne). Wenn fertig gibt $B das buch $S, $S geht nach hause Wenn nein behäölt $b das buch und $S geht nach hause.
* zeichenen sie ein Aktivitätsdiagramm welches ermöglich tdas Aktion 1 ODER aktion 2 ausgeführt wird und direkt danach aber Aktion 3.

## Zustandsdiagramm Ticketautomat mit giveTicket(), anfodereQuitung(), geldeinwerfen

* wenn betrag bezahl dann kann der kunde qzitung einfoder oder nach 10 sekunden geht der automat wiede rin warten

befindet sich im zustand warten, wenn ein ticket eingesteckt wird, wird geprüft ob es valide ist, wenn ja dann geht es in die bezahlung sonst wiede rin den wartezustand. im bezahle zustand kann der kunde (geldeinwerfen()) geld bezahlen, wenn der betrag erreicht wird kann der kunde vom system eine Quitung ausdrucken, hierfür muss er einen Button drücke, druckt die Quitung und geht in den Startzustand. Wenn 10 SEkunden lang aber nicht der Button gedrückt wird geht das System automatisch in den Startzustand.

## kontrollgraf für,

### minimale testfälle für c0 und c1 nennen

```
getDsicdound(int bonus, int points, int discound) {
if (bouns > 500 && pints > 50)
	discound  = discound * 5

discound += 1

if(bouns > 1000 && points > 100)
	discound = discound  * 2

return discound;
}
```

* grenzwertanalyse
* was sind grenzwerte?