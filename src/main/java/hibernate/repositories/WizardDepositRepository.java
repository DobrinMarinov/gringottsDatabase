package hibernate.repositories;

import hibernate.domain.WizardDeposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface WizardDepositRepository extends JpaRepository<WizardDeposit, Long>{

    @Override
    @Query("SELECT wizardDeposit FROM WizardDeposit AS wizardDeposit WHERE wizardDeposit.age = 32")
    List<WizardDeposit> findAll();
}
