package hibernate;

import hibernate.domain.WizardDeposit;
import hibernate.services.WizardDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Component
public class BashSoft implements CommandLineRunner{

    private final WizardDepositService wizardDepositService;

    @Autowired
    public BashSoft(WizardDepositService wizardDepositService) {
        this.wizardDepositService = wizardDepositService;
    }

    @Override
    public void run(String... strings) throws Exception {

        WizardDeposit wd = new WizardDeposit();
        wd.setFirstName("Dobrin");
        wd.setLastName("Marinov");
        wd.setAge(32);
        wd.setDepositAmount(new BigDecimal(4000));
        wd.setDepositStartDate(new Date(20170101));
        wd.setNotes("some notes");

        WizardDeposit pesho = new WizardDeposit();
        pesho.setFirstName("Pesho");
        pesho.setLastName("Peshev");
        pesho.setAge(28);
        pesho.setDepositAmount(new BigDecimal(3000));
        pesho.setDepositStartDate(new Date(20170105));
        pesho.setNotes("some notes 2");

        this.wizardDepositService.persist(wd);
        this.wizardDepositService.persist(pesho);

        List<WizardDeposit> result = this.wizardDepositService.findAll();
        for (WizardDeposit wizardDeposit : result) {
            System.out.println(wizardDeposit.getFirstName());
        }
    }
}
