Decorator
https://bitbucket.org/nordeagda2/designpatterndecoratorexample


Zadanie 2:
Aplikacja Pizzeria (hawajska dla każdego):

Chodzi o stworzenie abstrakcji dla pizzerii i jej pizz. Posługując się dekoratorem stworzymy różne rodzaje dodatków do pizzy.

Mamy dwie klasy pizzy:
SimplePizza - klasa pizzy podstawowej (pizza podstawowa zawiera ser i sos), która posiada listę składników oraz cenę pizzy,
CustomPizza - klasa pizzy udekorowanej z własnymi dodatkami, która posiada jako pole instancję dekorowanej pizzy, oraz listę dodatków nałożonych na tą pizzę.

Stwórz interfejs który powinien posiadać metody:
List<String> getIngredients(),
double getPrice() - w przypadku simple pizza zwraca wartość pola, w przypadku customPizza zwraca cenę pizzy podstawowej + ilość składników * 2.50

W klasie CustomPizza dodaj metodę:
void addIngredient(String ingredient);

--- po ukonczeniu powyższego:
Stwórz fabrykę abstrakcyjną, nazwij ją Pizzeria, a w niej stwórz metody stworzeniowe do pizzy:
pizza MargharritaPizza,
pizza PineapplePizza,
PepperoniPizza,
QuattroFormaggi
i cośtam jeszcze...


--- po ukonczeniu powyższego:
Stwórz w Pizzeria metodę która dodaje do pizzy dowolną ilość innych dodatków

--- po ukonczeniu powyższego:
Sprawdź czy Twoja pizza może być dekorowana kilkakrotnie.
Stwórz takiego maina, który pozwala na zamówienie pizzy z dowolną ilością udekorowań, a po zakończeniu procesu zamawiania wypisuje jaka pizza została zamówiona.

Zadanie 3:
Stworzymy aplikację do usprawniania robaka który ma się poruszać na oddzielnym wątku (podobne do wczorajszego zadania)!.
Stworzymy dekorator dla strategii jego poruszania (możesz wykorzystać wczorajsze zadanie/rozwiązanie) i udekorować styl poruszania się robaka.
Jako pierwsze udekorowanie polepsz szybkość (żeby przeskakiwał dwa razy dalej, niezależnie od strategii) poruszania się robaka (możesz udekorować styl lub samego robaka).



Zadanie 4:
Pociung ;)

Stwórz klasę Train która jest dekorowana klasą CustomTrain. Stwórz klasę Carriage która reprezentuje wagon. Każdy Train posiada: prędkość, przyspieszenie, listę wagonów oraz masę całkowitą.

Korzystając z dekoratora stwórz implementację pozwalającą tworzyć customowe wagony. Zaimplementuj metodę toString w CustomTrain tak, aby wypisywała ile pociąg waży, ile ma wagonów, jakie to wagony oraz z jaką prędkością i przyspieszeniem może się poruszać.



Zadanie 5*:
Dekorator choinki (trójkąta).
Stwórz klasę SimpleChristmasTree która posiada metodę printTree(). Pod wpływem wykonania tej metody klasa ma wypisać na ekran choinkę/trójkąt z gwiazdek.

Stwórz klasę dekorującą DecoratedChristmasTree która jako parametr konstruktora przyjmuje SimpleChristmasTree. Udekorowana klasa powinna na tą samą metodę printTree() wypisywać na ekran trójkąt/choinkę, ale w losowych miejscach tego trójkąta/choinki powinna wpisywać ‘O’ zamiast gwiazdki ‘*’.

Przykład:

https://bitbucket.org/javagda5/designpatterns/src/57bf2e0aa29b19915ed141381aab166dbdb894bd/src/main/java/com/sda/dp/decorator/christmasstree/?at=master




Zadanie 6**:
Zaprojektuj aplikację która służy do kreowania sobie samochodu z idealnym wyposażeniem.

Zaprojektuj aplikację w taki sposób aby była klasa samochodu bazowego, oraz klasa samochodu sportowego, oraz luksusowego, oraz bezpiecznego i custom.
Zaprojektuj klasy na dwa sposoby (proponuje dwie PODOBNE aplikacje w dwóch package'ach):
    - sposób 1: korzystając z dziedziczenia
    - sposób 2: korzystając z dekoratora


**
Dodaj do aplikacji strategię. Jako strategię stwórz mechanizm 'trąbienia'. Samochód ma modyfikowalny klakson. Może mieć klakson :
- honk ! honk!
- pibib!
- tutrurutututu!
- iiiii haaaaa!

Zadanie 7**:
Stwórz aplikację dla magazynierów/sklepu internetowego.
Stwórz klasę Warehouse. W klasie stwórz metodę :
    - złóż zamówienie które zwraca zamówione produkty dostępne w sklepie (w dowolnej postaci string/enum)
    - jeśli ktoś zamówi więcej niż 10 produktów do paczki załącz (udekoruj) prezent w postaci gift card.
    - każde zamówienie posiada metodę płatności: karta/payu/przelew .
        - We wszystkich trzech opcjach potrzebne są inne parametry:
                - na karcie potrzebny jest numer i cvv
                - do przelewu nie jest potrzebne nic, wystarczy ze wypiszesz komunikat z żądanym tytułem płatności.
                - do payu potrzebny jest email, oraz nazwa banku.


