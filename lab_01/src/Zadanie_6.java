/*
Klasa: Książka
Stan:
- tytuł
- autor
- ISBN
- rok wydania
Odpowiedzialności:
- udostępnianie informacji o swoich danych

Klasa: Czytelnik
Stan:
- imię
- nazwisko
- numer karty bibliotecznej
Odpowiedzialności:
- inicjowanie wypożyczenia książki

Klasa: Wypożyczenie
Stan:
- data wypożyczenia
- termin zwrotu
- przypisana książka
- przypisany czytelnik
Odpowiedzialności:
- przechowywanie informacji o czasie wypożyczenia
- weryfikacja czy termin zwrotu nie minął

Klasa: Biblioteka
Stan:
- lista książek
- lista czytelników
- lista aktywnych wypożyczeń
Odpowiedzialności:
- rejestrowanie czytelników
- obsługa procesu wypożyczania i zwrotu książek

Zależności pomiędzy obiektami:
- Biblioteka gromadzi wiele Książek i wielu Czytelników.
- Wypożyczenie łączy konkretną Książkę z konkretnym Czytelnikiem.
- Czytelnik może posiadać wiele aktywnych Wypożyczeń w systemie Biblioteki.
*/