# Smart Search

Smart Search är en webbaserad applikation där användare kan ladda upp en bild och få hjälp att hitta platsen där bilden togs.

Systemet använder bildens EXIF-metadata för att läsa GPS-information och hämta bildens geografiska koordinater. Om GPS-information finns visas platsen automatiskt på Google Maps. Om bilden saknar GPS-information får användaren ett meddelande och kan själv välja en plats på kartan.

Användaren kan även se information om bilden och den hittade platsen. Bilderna lagras i Amazon S3 och information om bilder och koordinater sparas i databasen.

## Funktioner

* Ladda upp bilder.
* Smart Search – försöka hitta var en bild togs.
* Läsa EXIF-metadata från bilder.
* Hämta GPS-koordinater automatiskt om de finns.
* Visa bildens plats på Google Maps.
* Visa information om uppladdade bilder.
* Spara och hantera bilder och deras platsinformation.

## Tekniker och verktyg

* **Java** – programmeringsspråk.
* **Spring Boot** – backend och API.
* **Thymeleaf** – webbgränssnitt.
* **MySQL** – databas för bilder och GPS-koordinater.
* **Amazon S3** – lagring av uppladdade bilder.
* **Metadata API** – läsa bildmetadata och GPS-koordinater.
* **Google Maps API** – visa kartor och geografiska positioner.
* **Docker och Docker Compose** – köra applikationen och dess tjänster i containrar.
* **GitHub Actions** – automatiserad testning och byggprocess (CI/CD).
* **Git och GitHub** – versionshantering och samarbete.
