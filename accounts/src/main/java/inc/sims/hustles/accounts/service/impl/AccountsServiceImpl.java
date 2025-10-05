package inc.sims.hustles.accounts.service.impl;

import inc.sims.hustles.accounts.constants.AccountsConstants;
import inc.sims.hustles.accounts.dto.CustomerDto;
import inc.sims.hustles.accounts.mapper.CustomerMapper;
import inc.sims.hustles.accounts.model.Accounts;
import inc.sims.hustles.accounts.model.Customer;
import inc.sims.hustles.accounts.repository.AccountsRepository;
import inc.sims.hustles.accounts.repository.CustomerRepository;
import inc.sims.hustles.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(new Customer(), customerDto);
        Customer savedCustomer = customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    private Accounts createNewAccount(Customer customer){
        Accounts newAccount = new Accounts();
        long randomAccountNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setCustomerId(customer.getCustomerId());
        newAccount.setAccountNumber(randomAccountNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }
}
