package nl.intratuin.dao.contract;

import nl.intratuin.entity.Customer;

import java.util.List;

public interface CustomerDao {
    Customer findById(int id);

    List<Customer> findAll();

    void save(Customer customer);

    Integer findByEmail(String email);
}
