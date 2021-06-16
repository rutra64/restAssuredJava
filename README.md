# restAssuredJava

1. Dla endpointu https://api.github.com/users/octocat zaprezentuj jak go przetestować automatycznie w Postmanie (test weryfikujący status i wartości w response) oraz pobierz parametr "name" z response i zapisz go do zmiennej środowiskowej. Wynik umożliwiający odczyt i poprawne działanie zapisz w plikach. 
2. Dla endpointu https://api.github.com/users/octocat w restAssured+Java rozpisz test wraz z drzewem klas (pattern) + asercje na dowolne pola/wartości

postMan directory contains solution for exercise 1.
src contains solution for exercise 2. I used Java/Rest Assured/TestNG as a tech stack. You can run tests with testng.xml file (src/test/resources)
