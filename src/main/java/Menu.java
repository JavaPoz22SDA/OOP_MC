public class Menu {

    public void mainMenu(){
        System.out.println("\nWitaj w systemie ERP!\n" +
                "1. Pokaż wszystkich pracowników - krótka wersja\n" +
                "2. Dodaj nowego pracownika\n" +
                "3. Export do pliku danych pracownika\n" +
                "4. Usuń pracownika\n" +
                "5. Edycja danych pracownika\n" +
                "6. Przejście do podmenu 1...\n" +
                "7. Export danych i przejście do podmenu 2...\n" +
                "8. Informacja o systemie\n" +
                "0. Wyjście z systemu"
        );
    }

    public void editEmployee(){
        System.out.println("\nWybierz pole, które chcesz edytować.\n" +
                "1. Nazwisko\n" +
                "2. Numer działu\n" +
                "3. Wysokość pensji\n" +
                "4. Wiek\n" +
                "5. Liczba dzieci\n" +
                "6. Stan cywilny\n" +
                "0. Wyjście z menu\n"
        );
    }
    public void extraFunction(){
        System.out.println("\nPodmenu 1:\n" +
                "1. Oblicz liczbę pracowników z pensją nie mniejszą niż podana.\n" +
                "2. Średnia wysokość pensji w wybranym dziale.\n" +
                "3. Sprawdź najwyższą pensję z podziałem na płeć.\n" +
                "4. Informacje na temat działów.\n" +
                "5. Stosunek średniej płacy kobiet do średniej płacy mężczyzn.\n" +
                "6. Zwiększenie pensji wszystkim pracownikom o podany procent.\n" +
                "0. Wyjście z podmenu 1\n"
        );
    }
}

