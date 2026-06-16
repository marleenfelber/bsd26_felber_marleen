# Encryption

Encryption ist ein kleines Java-Programm, welches dazu dient, **Texte zu verschlüsseln** und **entschlüsseln**.

## Installation
Um das Programm auszuführen, müssen Sie die entsprechende Datei _Encryption.java_ in Ihre Entwicklungsumgebung einbinden \
(beispielsweise [IntelliJ](https://www.jetbrains.com/idea/)).

## Anleitung zur Verwendung
Bei Ausführung bzw. Start des Programms wird Ihnen das Menü mit folgenden Möglichkeiten aufgezeigt:

```java
--------------------------------------------------------------------------------
1 - Encrypt text
2 - Decrypt text
9 - Quit
--------------------------------------------------------------------------------
> 
```

Nach dem ">" tragen Sie die jeweilige Zahl der gewünschten Tätigkeit ein.

### 1 - Encrypt text
Bei Eingabe von "1" werden Sie nach der Rotation gefragt. Das heißt, Sie können die Anzahl der zu rotierenden Stellen selbst \
festlegen. Sobald Sie eine Zahl eingegeben haben, tragen Sie den gewünschten Text ein, der zu **verschlüsseln** ist. Danach wird \
Ihnen der verschlüsselte Text ausgegeben.

**Beispiel:**
```java
--------------------------------------------------------------------------------
1 - Encrypt text
2 - Decrypt text
9 - Quit
--------------------------------------------------------------------------------
> 1
  Enter rotation: 4
  Enter text to encrypt: Mein Name ist Lena.
  Encrypted text: Qimr Reqi mwx Pire.
--------------------------------------------------------------------------------
1 - Encrypt text
2 - Decrypt text
9 - Quit
--------------------------------------------------------------------------------
> 
```

### 2 - Decrypt text
Bei Eingabe von "2" werden Sie ebenfalls nach der Rotation gefragt. Sie können die Anzahl der zurückzurotierenden Stellen selbst \
festlegen. Sobald Sie eine Zahl eingegeben haben, tragen Sie den gewünschten Text ein, der zu **entschlüsseln** ist. Danach wird \
Ihnen der entschlüsselte Text ausgegeben.

**Beispiel:**
```java
--------------------------------------------------------------------------------
1 - Encrypt text
2 - Decrypt text
9 - Quit
--------------------------------------------------------------------------------
> 2
  Enter rotation: 4
  Enter text to decrypt: Qimr Reqi mwx Pire.
  Decrypted text: Mein Name ist Lena.
--------------------------------------------------------------------------------
1 - Encrypt text
2 - Decrypt text
9 - Quit
--------------------------------------------------------------------------------
> 
```

### 9 - Quit
Bei Eingabe von "9" wird das Programm beendet.

## Autorin
Das Programm wurde von Marleen Felber _im Rahmen des Studiums_ erstellt.

* [GitHub-Profil](https://github.com/marleenfelber)
* [FH CAMPUS 02](https://www.campus02.at/)

## Verlinkungen
* **[Exercise1 Part1](exercise1_part1.md):** In dieser Datei handelt es sich um die Programmiersprache Java.
* **[Exercise1 Part2](exercise1_part2.md):** In dieser Datei handelt es sich um die Grundlagen und Kommandos von Git.
* **[Exercise1 Part3](exercise1_part3.md):** In dieser Datei handelt es sich um das GitHub-Projekt "FlappySwift".