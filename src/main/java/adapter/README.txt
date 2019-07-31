Adapter
Adapter jest wzorcem projektowym strukturalnym. Pozwala on używać klas o niekompatybilnych typach. Przykładowo chcemy użyć pewnej klasy, ale nie możemy tego zrobić, ponieważ nie odpowiada nam jego interfejs. Móc skorzystać z adaptera tworzymy klasę “pośrednią” która może działać w jeden z dwóch sposobów:
może dziedziczyć interfejs docelowy i interfejs który adaptuje
może dziedziczyć interfejs docelowy i zawierać interfejs który adaptuje (jako pole)
https://bitbucket.org/javagda8/adapterexample


Zadanie 1a:
Przeanalizuj i dokończ wykorzystanie adaptera (metoda włączania) w aplikacji:
https://bitbucket.org/javagda8/designpatternadapterexercise

Zadanie 1b:
Dopisz metodę wyłączania do adaptera, podepnij wszystkie urządzenia.
Dopisz metodę turnOn(boolean onOff) która włącza lub wyłącza urządzenie w zależności od ustawienia flagi (parametru)


Zadanie 2:
Integrujemy duży system, którego zadaniem jest integrowanie różnego rodzaju systemów. Każdy z tych systemów dostarcza w inny sposób dane, oraz w inny sposób je przechowuje. Skorzystaj z repozytorium i (poniżej) i stwórz aplikację która dostarcza jednakowych danych ze wszystkich 3 systemów:

https://bitbucket.org/javagda8/designpatternadapterexercise2


Zadanie 3:
Zadanie ma charakter bliski zadaniom rekrutacyjnym. Zakładamy istnienie kilku systemów które dostarczają dane do naszej aplikacji. Każdy z nich jest inny.

Niech systemy dostarczają informacji dotyczących podróży lotniczych. Model lotu posiada następujące informacje:
- nr lotu
- czas wylotu (timestamp)
- czas przylotu (timestamp)
- numery miejsc pierwszej klasy
- numery miejsc drugiej klasy
- nazwiska osób które zarezerwowały loty, numery zarezerwowanych miejsc, numery rezerwacji
------------------------------------------------------------------------------------------------------------
Twórcy pierwszego systemu zapisali informacje o swoich lotach w postaci pliku tekstowego.  Zdefiniowali format pliku w którym wszystkie najważniejsze elementy rozdzielili średnikami. Jeśli dane w jednej sekcji składały się z większej grupy wartości, to zostały rozdzielone znakiem procentu ‚%’. Jeśli wartość w tej grupie była złożona, to jej poszczególne elementy podzielono znakiem hash ‚#’.


Początek linii wygląda następująco:

K345JN323K4JN;1514829600000;1514838000000;1%2%3%4%5%6;7%8%9%10%11%12%13%14%15%16%17%18%19%20;Nowak#1#AWA354%Kowalski#2#TJH347%Adamowicz#7#HTR823%Kunegunda#8#OPW512%Olechowicz#9#EDZ512%Gabrielowicz#10#AWG246%Marcelewicz#11#OGB259%Ambroży#12#QYF730%Lew#13#LAZ572%Ferdynand#15#MTY877%Greenlaw#17#CPW443%Babetski#20#AHE323%

------------------------------------------------------------------------------------------------------------
Twórcy drugiego systemu stwierdzili, że ich system będzie zawierał te same inforamcje w nowych liniach, a każda nowa krotka(nowy rekord lotu) będzie od siebie oddzielona linią złożoną wyłącznie z (90) myślników.

Przykład (ten sam lot co wyżej):
-----------------------------------------------------------------------------------------
K345JN323K4JN
1514829600000
1514838000000
1 2 3 4 5 6
7 8 9 10 11 12 13 14 15 16 17 18 19 20
Nowak,1,AWA354 Kowalski,2,TJH347 Adamowicz,7,HTR823 Kunegunda,8,OPW512 Olechowicz,9,EDZ512 Gabrielowicz,10,AWG246 Marcelewicz,11,OGB259 Ambroży,12,QYF730 Lew,13,LAZ572 Ferdynand,15,MTY877 Greenlaw,17,CPW443 Babetski,20,AHE323
------------------------------------------------------------------------------------------------------------

Twórcy trzeciego systemu opisali wszystkie loty w oddzielnych plikach. Jedyne co dostarczają, to folder pełen plików z danymi, a w plikach dane w formacie:

FLIGHT_ID=K345JN323K4JN
DEPARTURE_TIME=1514829600000
ARRIVAL_TIME=1514838000000
PREMIUM_SEATS=1 2 3 4 5 6
REGULAR_SEATS=7 8 9 10 11 12 13 14 15 16 17 18 19 20
RESERVATIONS=Nowak/1/AWA354 Kowalski/2/TJH347 Adamowicz/7/HTR823 Kunegunda/8/OPW512 Olechowicz/9/EDZ512 Gabrielowicz/10/AWG246 Marcelewicz/11/OGB259 Ambroży/12/QYF730 Lew/13/LAZ572 Ferdynand/15/MTY877 Greenlaw/17/CPW443 Babetski/20/AHE323


Stwórz aplikację pozwalającą załadować pliki różnych przewoźników, a następnie umożliwiającą przeglądanie lotów i sprawdzanie poprawności (czy loty u różnych przewoźników mają te same dane (np. numemry rezerwacji)).
niech aplikacja umożliwia znajdowanie błędów.




Zadanie 4**:
Your goal is to implement a flight aggregation service for an online travel agency. This component will be used for listing all available flights when preparing a broader holiday offer for the customer (eg. flights "from Amsterdam to Barcelona on 01 April 2015" could be presented as an addition to a hotel booking made in Barcelona on that date).
In this scenario we have two suppliers (lowcost & regular flight supplier), that provide flight definitions in slightly different format. Both are accessed using a Web Service, which is represented as a Java stub in an isolated package (LowcostFlightSupplierWS & RegularFlightSupplierWS). Your task is to implement a new service that will aggregate results from both services and expose them as a sequence of objects in a common format.


Rules:
Feel free to use any libraries from the Maven Central Repository. Basic Maven and Gradle configs are at your disposal..
Your commit log should reflect real life development process (i.e. make often commits, write some comments etc.).
You can alter or remove anything, apart from LowcostFlightSupplierWS and RegularFlightSupplierWS.

Guidelines:
This is an "open" assignment, which can be implemented in multiple ways and with different complexity in mind. What we're particularly interested in is how you approach a real life business problem from a development perspective. Please consider the following when working on this assignment:
Business usability (e.g. the contract of the service should be clear and extensible)
Design patterns
Performance considerations
Error handling, maintainability & general code quality

https://bitbucket.org/javagda8/recruitment-app

