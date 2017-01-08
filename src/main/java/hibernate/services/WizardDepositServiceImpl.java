package hibernate.services;

import hibernate.domain.WizardDeposit;
import org.springframework.beans.factory.annotation.Autowired;
import hibernate.repositories.WizardDepositRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class WizardDepositServiceImpl implements WizardDepositService{

    private final WizardDepositRepository wizardDepositRepository;

    @Autowired
    public WizardDepositServiceImpl(WizardDepositRepository wizardDepositRepository) {
        this.wizardDepositRepository = wizardDepositRepository;
    }

    @Override
    public void persist(WizardDeposit wizardDeposit) {
        this.wizardDepositRepository.saveAndFlush(wizardDeposit);
    }

    public List<WizardDeposit> findAll() {
        return Collections.unmodifiableList(this.wizardDepositRepository.findAll());
    }


}
