package nl.intratuin.service.implementation;

import nl.intratuin.dao.contract.CustomerDao;
import nl.intratuin.entity.Customer;
import nl.intratuin.service.contract.CustomerService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class CustomerServiceImpl implements CustomerService {
    @Inject
    private CustomerDao customerDao;

    public Customer findById(int id) {
        return customerDao.findById(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Transactional
    public void save(Customer customer) {
        customerDao.save(customer);
    }

    public Integer findByEmail(String email) {
        return customerDao.findByEmail(email);
    }
}
