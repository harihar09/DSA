package Java8.Optional;

import Java8.CustomerAppMapVsFlatMap.Customer;
import Java8.CustomerAppMapVsFlatMap.CustomerDAO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("merry", "test@gmail.com", Arrays.asList(1234, 5674));

        Optional<Object> objectOptional = Optional.empty();
        System.out.println(objectOptional);

        // Optional<String> customerCity = Optional.of(customer.getCity());
        //System.out.println(customerCity.get());

        Optional<String> customerCity1 = Optional.ofNullable(customer.getCity());
        //    System.out.println(customerCity1);
        if (customerCity1.isPresent()) {
            // System.out.println(customerCity1.get());
        }
       /* System.out.println(customerCity1.orElse("defalut"));
        System.out.println(customerCity1.orElseThrow(()->new NullPointerException("email not present")));
        System.out.println(customerCity1.map(String::toUpperCase).orElseGet(()->"default Gmail ID"));*/
        System.out.println(getCustomerList("pune"));
    }

    /*public static List<Customer> getCustomerList(String city){
        return (List<Customer>) new CustomerDAO().customerList().stream().filter(customer -> customer.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
    }*/
    public static Customer getCustomerList(String city) throws Exception {
        return (Customer) new CustomerDAO().customerList()
                .stream().filter(customer -> customer.getCity().equalsIgnoreCase(city))
                .findAny().orElseThrow(()->new Exception("cutomer not found"));


    }
}
