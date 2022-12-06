
# Project (text) Game!
Un text game ispirato ai vecchi giochi per piattaforme DOS scritto in Java.

- In fase di sviluppo.


## Scritto da:

- [@Francesco Pio Bandiera](https://github.com/FBandiera1804/)
- [@Andrea Esposito](https://github.com/Andreaesposito2004)
- [@Angelo Buonaugurio](https://github.com/AngeloBuonaugurio2005)
- [@Agostino Di Marzo](https://github.com/AgoDiMarzo)

Con l'aiuto e collaborazione del prof:
- [@Angelo Manganiello](https://github.com/amanganiello90)



## Guida all'avvio

**Windows**

Scaricare "Java Runtime Environment" v.17 o versione successiva.

Puoi scaricare quest'ultimo da questo link:

- [Adoptium OpenJDK](https://adoptium.net)

Scaricare anche Maven per generare il file eseguibile.

Link del download:

- [Apache Maven](https://maven.apache.org/download.cgi)

Per l'esecuzione (Build):

Scaricare il source code del gioco:


Il file `pom.xml` va installato tramite maven, quindi aprire powershell nella cartella ed eseguire:

```bash
mvn assembly:assembly -DdescriptorId=jar-with-dependencies
```

Dopo questo step, apri la cartella `target`.

Poi potrai scegliere di eseguirlo tramite tasto destro del file .jar e fare 

- "Apri con -> Java Runtime Environment".

Se invece sei interesseato ad eseguirlo direttamente tramite riga di comando:

- Apri Windows Powershell nella directory
- Esegui questo comando:
```bash
java -jar projectGame-0.0.1-SNAPSHOT-jar-with-dependencies.jar
``` 

#

**Linux:**

Scaricare "Java Runtime Environment" v.17 o versione successiva.

Scaricare "Apache Maven" per la vostra distro per generare gli eseguibili.

A seconda della tua distro esegui questi comandi.

Debian/Ubuntu

```bash
sudo apt update && sudo apt install openjdk-17-jdk maven -y
```

Arch Linux:

```bash
sudo pacman -S java17-openjfx maven
```

Fedora:

```bash
sudo dnf upgrade --refresh -y && sudo dnf install java-latest-openjdk.x86_64 maven -y
```

**Esecuzione (Build)**

- Scaricare il source code del gioco.
- Aprire un terminale nella directory del codice ed eseguire:

```bash
mvn assembly:assembly -DdescriptorId=jar-with-dependencies
```

Verranno poi generati due file `.jar` per essere eseguiti.

- Per eseguire il gioco:

```bash
java -jar projectGame-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```
