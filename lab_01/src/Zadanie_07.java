/*
- Film
Najważniejsze dane: tytuł, czas trwania, kategoria wiekowa, gatunek
Podstawowe odpowiedzialności: przechowywanie informacji o produkcji, żeby było wiadomo co gramy

- Sala
Najważniejsze dane: numer sali, liczba miejsc, układ foteli
Podstawowe odpowiedzialności: sprawdzanie ile osób wejdzie, weryfikacja czy wybrane miejsce fizycznie istnieje

- Seans
Najważniejsze dane: data i godzina, przypisany Film, przypisana Sala
Podstawowe odpowiedzialności: spinanie filmu z salą i czasem, pilnowanie rezerwacji i dostępności wolnych miejsc

- Bilet
Najważniejsze dane: wybrane miejsce (rząd i numer), rodzaj (normalny/ulgowy), cena, status płatności
Podstawowe odpowiedzialności: potwierdzenie, że klient ma wejściówkę na konkretny seans

1. Które obiekty powinny wiedzieć o istnieniu innych obiektów?
Seans musi wiedzieć o Filmie (co wyświetlamy) i o Sali (gdzie i jak wyglądają miejsca). Z kolei Bilet musi wiedzieć o konkretnym Seansie, żeby było jasne, na co kogoś wpuszczamy.

2. Czy któraś odpowiedzialność została przypisana do niewłaściwego obiektu?
Łatwo tu o błąd i przypisanie płatności do Biletu lub Seansu. Bilet powinien tylko wiedzieć, czy jest "opłacony", a za samo procesowanie przelewów powinna odpowiadać osobna klasa, np. Kasa albo SystemPlatnosci.

3. Które informacje z rzeczywistego świata świadomie pomijasz w swoim modelu?
Pominąłem m.in. obsadę aktorską, markę sprzętu w sali (nagłośnienie/projektor), harmonogram reklam przed filmem i dane pracowników obsługi.

4. Dlaczego ich nie potrzebujesz?
Bo z punktu widzenia systemu do rezerwacji biletów te informacje są kompletnie zbędne. Apka ma po prostu sprzedać bilet na wolne miejsce na dany czas, reszta nie ma najmniejszego wpływu na ten proces.
*/