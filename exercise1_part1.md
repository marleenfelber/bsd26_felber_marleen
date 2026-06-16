# Java

![Java Logo](https://upload.wikimedia.org/wikipedia/de/thumb/e/e1/Java-Logo.svg/500px-Java-Logo.svg.png?_=20061221200047)

## Basisdaten
* **Paradigmen**: Objektorientierte Programmiersprache
* **Erscheinungsjahr**: 1995
* **Designer**: James Gosling, Sun Microsystems
* **Entwickler**: Sun Microsystems, Oracle, James Gosling
* **Betriebssystem**: plattformunabhängig


## Grundkonzepte/Ziele
Der Entwurf der Programmiersprache Java hat hauptsächlich 5 Ziele:

1. soll eine **einfache**, **objektorientierte**, **verteilte** & **vertraute** Programmiersprache sein
2. soll **robust** & **sicher** sein
3. soll **architekturneutral** & **portabel** sein
4. soll **sehr leistungsfähig** sein
5. soll **interpretierbar**, **parallelisierbar** & **dynamisch** sein


## Anwendungsarten
Mit [Java](https://www.java.com/en/) können verschiedenste Arten von Anwendungen erstellt werden.

### Java-Webanwendungen
Java-Webanwendungen sind Java-Programme, die auf einem _Webserver_ geladen und gestartet werden und beim Benutzer \
in einem _Webbrowser_ ablaufen bzw. dargestellt werden. Üblicherweise läuft ein Teil der Webanwendung auf dem Server \
und ein anderer Teil am Webbrowser. Der Serverteil wird üblicherweise vollständig in Java geschrieben, der Browserteil \
üblicherweise in HTML und JavaScript.

Bekannte Beispiel für Java-Webanwendungen sind **Twitter**, **Jira**, **Jenkins** oder **Gmail**.

### Java-Desktop-Anwendungen
Unter Desktop-Anwendungen oder Applikationen werden _normale Desktop-Programme_ zusammengefasst. Sowohl Internet- \
Kommunikationsprogramme als auch Spiele oder Office-Anwendungen, die auf einem normalen PC laufen, werden so genannt.

Bekannte Beispiele für Java-Desktop-Anwendungen sind die integrierte Entwicklungsumgebung **Eclipse**, das Filesharing- \
Programm **Vuze** oder das Computerspiel **Minecraft**.

### Java-Applets
Java-Applets sind Java-Anwendungen, die normalerweise _in einem Webbrowser ausgeführt_ werden. Sie sind üblicherweise auf \
einen durch ein spezielles HTML-Tag definierten Bereich einer Webseite beschränkt. Voraussetzung für die Ausführung von \
Java-Applets ist ein Java-fähiger Browser. Diese Anwendungsform wird **seit Java 11 nicht mehr unterstützt**, nachdem sie \
bereits in Java 9 als "veraltet" gekennzeichnet wurde.

## Beispiel
```java
public class Tier {
	/**
	 * Diese Methode lässt das Tier kommunizieren. Die Unterklassen dieser
	 * Klasse können diese Methode überschreiben und eine passende
	 * Implementierung für das jeweilige Tier anbieten.
	 */
	public void kommuniziere() {
	    // Wird von allen Unterklassen verwendet, die diese Methode nicht überschreiben.
	    System.out.println("Tier sagt nichts.");
	}
}
```

Quelle: [Wikipedia](https://de.wikipedia.org/wiki/Java_(Programmiersprache))