/*
-- samochód --

A. System wypożyczalni samochodów
    - numerRejestracyjny
    - przebieg
    - marka
    - model
    - cenaZaWynajem
    - rocznik
    - okresWypozyczenia
    - mocSilnika
    - statusDostepnosci
B. Gra wyścigowa
    - marka
    - model
    - przyspieszenie
    - sterownosc
    - poziomUszkodzeń
C. System warsztatu samochodowego
   - numerRejestracyjny
   - numerVIN
   - marka
   - rocznik
   - przebieg
   - zgloszonaUsterka
   - historiaNapraw

Nie istnieje jedna "poprawna" klasa Samochód pasująca do każdego programu, ponieważ różne systemy realizują zupełnie inne cele. Zjawisko to nazywamy abstrakcją – z rzeczywistego bytu wyodrębniamy do programu tylko te cechy, które są kluczowe z punktu widzenia rozwiązywanego problemu, ignorując wszystkie pozostałe. Stworzenie jednej uniwersalnej klasy doprowadziłoby do powstania tzw. "boskiego obiektu" (God Object), przeładowanego zbędnymi danymi. Przykładowo: gra wyścigowa nie potrzebuje numeru VIN, a system warsztatu nie potrzebuje przeliczać parametrów sterowności i przyspieszenia.

*/
