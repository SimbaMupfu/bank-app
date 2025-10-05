package inc.sims.hustles.accounts.service.impl;

import inc.sims.hustles.accounts.dto.CustomerDto;
import inc.sims.hustles.accounts.repository.AccountsRepository;
import inc.sims.hustles.accounts.repository.CustomerRepository;
import inc.sims.hustles.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
