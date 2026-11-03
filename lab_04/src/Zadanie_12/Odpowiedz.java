/*
Dlaczego wybrane relacje są relacjami IS-A?
Zaimplementowana hierarchia dziedziczenia reprezentuje relację IS-A ("jest"), ponieważ każda klasa pochodna stanowi
logiczne uszczegółowienie (specjalizację) klasy bazowej. StandardAccount JEST rodzajem Account (dziedziczy jego podstawowe
właściwości, rozszerzając je o nick), PremiumAccount JEST rodzajem StandardAccount, a AdministratorAccount JEST wysoce
wyspecjalizowanym rodzajem PremiumAccount. Z punktu widzenia paradygmatu obiektowego, każda instancja podklasy może być
bezpiecznie rzutowana w górę i traktowana jako instancja klasy Account, ponieważ w pełni
zachowuje i rozszerza jej kontrakt.


 */