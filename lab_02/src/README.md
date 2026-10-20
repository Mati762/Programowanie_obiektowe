# Laboratorium 2: Klasy, obiekty, referencje, konstruktory, kompozycja

## Cel zajęć
Celem laboratorium było praktyczne zapoznanie się z fundamentami programowania obiektowego w języku Java, ze szczególnym uwzględnieniem cyklu życia obiektów, zarządzania referencjami w pamięci oraz łączenia klas.

## Omawiane zagadnienia
* Tworzenie klas i instancjonowanie obiektów za pomocą operatora `new`.
* Różnice pomiędzy wartościami typów prostych a referencjami do obiektów.
* Budowa i działanie konstruktorów (w tym konstruktora domyślnego, sparametryzowanego oraz kopiującego).
* Rola słowa kluczowego `this` i rozwiązywanie problemu przesłaniania nazw (shadowing).
* Wywoływanie jednych konstruktorów wewnątrz innych (`this(...)`) w celu uniknięcia duplikacji kodu.
* Przekazywanie referencji obiektów jako parametrów metod.
* Obsługa pustych referencji (`null`) i zapobieganie wyjątkom `NullPointerException`.
* Kompozycja (agregacja) – budowa złożonych modeli obiektowych poprzez zawieranie jednych obiektów wewnątrz innych.

## Zrealizowane zadania
* **Zadanie 8 (Counter):** Implementacja metody przyjmującej w parametrze inny obiekt tej samej klasy w celu trwałej modyfikacji jego stanu (ukazanie zasady działania referencji przekazywanych do metod).
* **Zadanie 9 (Car - null):** Analiza błędu `NullPointerException` oraz implementacja instrukcji warunkowej zabezpieczającej program przed wywołaniem metody na pustej referencji.
* **Zadanie 10 (Box):** Analiza zachowania wskaźników w pamięci podczas przypisywania jednej referencji do drugiej w kontraście do tworzenia niezależnej kopii obiektu.
* **Zadanie 11 (Product):** Usuwanie błędów kompilacji poprzez poprawę sygnatury konstruktora (usunięcie słowa kluczowego `void`) oraz uzupełnienie brakujących wskaźników `this`.
* **Zadanie 12 (Model Kina):** Zbudowanie małego systemu rezerwacji składającego się z trzech współdziałających klas (`Film`, `Sala`, `Seans`). Zastosowanie kompozycji, w której `Seans` agreguje w swoich polach obiekty `Film` i `Sala`.
* **Zadanie dodatkowe (Rectangle):** Utworzenie klasy reprezentującej prostokąt, wykorzystującej łańcuchowanie konstruktorów do optymalizacji kodu oraz implementującej logikę kopiowania istniejącego obiektu do nowego obszaru pamięci.
