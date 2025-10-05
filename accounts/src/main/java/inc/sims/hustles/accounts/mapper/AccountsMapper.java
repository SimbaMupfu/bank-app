package inc.sims.hustles.accounts.mapper;

import inc.sims.hustles.accounts.dto.AccountsDto;
import inc.sims.hustles.accounts.model.Accounts;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto){
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }
}
