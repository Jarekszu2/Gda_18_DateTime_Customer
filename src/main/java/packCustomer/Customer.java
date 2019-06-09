package packCustomer;

/*
Stwórz aplikację a w niej klasę Customer. Każdy Customer ma pola:
 - wiek (int)
 - w ciąży (boolean)
 - nazwa/imie
 - data i godzina dołączenia do kolejki (w konstruktorze ustawiamy datę i godzinę na null)

Stwórz klasę apteka a w niej listę klientów. Apteka powinna mieć metodę:
- dodaj osobę do kolejki -> addToQueue(Customer):void - która umieszcza klienta w kolejce i NADAJE KLIENTOWI CZAS DOŁĄCZENIA DO KOLEJKI JAKO LocalDateTime.now.
- wylistuj kolejkę -> listCustomers():void - która wypisuje stan kolejki (linia pod linią klientów)

- osoby starsze powinny pójść możliwie na przód kolejki jeśli mają powyżej 60 lat, jeśli nie ustawiają się normalnie na koniec
- osoby w ciąży mają priorytet nad wszystkimi
- zadanie rozwiąż przez Comperarable
- ostatecznym kryterium porównania jest godzina dotarcia do kolejki. Jeśli dołączyliśmy do kolejki później, to jesteśmy na liście niżej.

Zadanie ma być wykonane w formie parsera. Wykonujemy komendy:
- nowyklient gosia 13 false
- nowyklient marian 13 true
(powyższe komendy prezentują dodawanie klientów)
(gosia nie jest w ciazy, marian jest)

- dodajdokolejki gosia
(powyższa komenda prezentuje dodanie klienta do kolejki)
- listuj
 */

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

// @Data
// @AllArgsConstructor

public class Customer implements Comparable<Customer>{

    private int wiek;
    private boolean wCiazy;
    private String imie;
    private LocalDateTime localDateTime = null;

    public Customer(int wiek, boolean wCiazy, String imie) {
        this.wiek = wiek;
        this.wCiazy = wCiazy;
        this.imie = imie;
        this.localDateTime = null;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean iswCiazy() {
        return wCiazy;
    }

    public void setwCiazy(boolean wCiazy) {
        this.wCiazy = wCiazy;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "wiek=" + wiek +
                ", wCiazy=" + wCiazy +
                ", imie='" + imie + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        if (this.wCiazy && !o.wCiazy) {
            return -1;
        } else if (!this.wCiazy && o.wCiazy) {
            return 1;
        }

        if (this.wiek >= 65) {
            if (this.wiek > o.wiek) {
                return -1;
            } else if (this.wiek < o.wiek) {
                return 1;
            }
        }
        return 0;
    }
}
