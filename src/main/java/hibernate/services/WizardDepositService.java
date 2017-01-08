package hibernate.services;

import hibernate.domain.WizardDeposit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WizardDepositService {
    void persist(WizardDeposit wizardDeposit);

    List<WizardDeposit> findAll();
}
