package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.AccountType;

public interface AccountTypeDao extends JpaRepository<AccountType, Integer> {

}
