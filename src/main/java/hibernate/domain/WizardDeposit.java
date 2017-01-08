package hibernate.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "wizard_deposits")
public class WizardDeposit implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 60)
    private String lastName;

    @Column(name = "notes", columnDefinition = "TEXT", length = 1000)
    private String notes;

    @Column(name = "age")
    //TODO: unsigned int in setter
    private int age;

    @Column(name = "deposit_start_date")
    private Date depositStartDate;

    @Column(name = "deposit_amount")
    private BigDecimal depositAmount;

    public WizardDeposit() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalArgumentException("Negative or 0 age provided");
        }
        this.age = age;
    }

    public Date getDepositStartDate() {
        return depositStartDate;
    }

    public void setDepositStartDate(Date depositStartDate) {
        this.depositStartDate = depositStartDate;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }
}
