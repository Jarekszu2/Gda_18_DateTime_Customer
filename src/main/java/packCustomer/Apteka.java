package packCustomer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Apteka {

    private List<Customer> customerList;

    public void dodajDoKolejki(Customer customer) {
        // LocalDateTime localDateTimeApteka = LocalDateTime.now();
        customer.setLocalDateTime(LocalDateTime.now());
        customerList.add(customer);
    }

    public void wylistujKolejke() {
        customerList.forEach(System.out::println);
        System.out.println();
        Collections.sort(customerList);
        customerList.forEach(System.out::println);
    }
}
