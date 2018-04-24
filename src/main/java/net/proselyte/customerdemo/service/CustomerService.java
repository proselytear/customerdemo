package net.proselyte.customerdemo.service;

import net.proselyte.customerdemo.model.Customer;

import java.util.List;

/**
 * Service interface for {@link Customer} class.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
