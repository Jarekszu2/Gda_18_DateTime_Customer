package packCustomer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCystomer {
    public static void main(String[] args) {
        System.out.println();

        Customer customer1 = new Customer(31, true, "Monika");
        Customer customer2 = new Customer(27, true, "Gosia");
        Customer customer3 = new Customer(40, true, "Ewa");
        Customer customer4 = new Customer(45, false, "Marcin");
        Customer customer5 = new Customer(27, false, "Adam");
        Customer customer6 = new Customer(55, false, "Ania");
        Customer customer7 = new Customer(65, false, "Maria");
        Customer customer8 = new Customer(67, false, "Franek");



        // LocalDateTime ldtApteka = LocalDateTime.now();
        // customer1.setLocalDateTime(ldtApteka);
        // System.out.println(customer1);
        // customer1.getLocalDateTime().toLocalTime();

        List<Customer> customerList = new ArrayList<>();
        // customerList.add(customer3);
        // customerList.add(customer4);
        // customerList.add(customer5);
        // customerList.add(customer6);
        // customerList.add(customer1);
        // customerList.add(customer2);
//
        // customerList.forEach(System.out::println);
//
        // System.out.println();
        // Collections.sort(customerList);
        // customerList.forEach(System.out::println);

        Apteka apteka = new Apteka(customerList);
        apteka.dodajDoKolejki(customer3);
        apteka.dodajDoKolejki(customer4);
        apteka.dodajDoKolejki(customer5);
        apteka.dodajDoKolejki(customer6);
        apteka.dodajDoKolejki(customer1);
        apteka.dodajDoKolejki(customer2);
        apteka.dodajDoKolejki(customer7);
        apteka.dodajDoKolejki(customer8);

        System.out.println();
        System.out.println("Lista klientów w aptece:");
        apteka.wylistujKolejke();
    }
}
