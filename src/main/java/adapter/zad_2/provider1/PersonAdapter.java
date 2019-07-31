package adapter.zad_2.provider1;

import adapter.zad_2.IPeopleData;

import java.time.LocalDate;

public class PersonAdapter implements IPeopleData {
    private final Person person;

    public PersonAdapter(Person person) {
        this.person = person;
    }

    @Override
    public int getId() {
        return this.person.getId();
    }

    @Override
    public String getName() {
        return this.person.getName() + " " + this.person.getSurname();
    }

    @Override
    public String getIdentifier() {
        return this.person.getPesel();
    }

    @Override
    public LocalDate birthDate() {
        return this.person.getBirthDate();
    }

    @Override
    public String toString() {
        return "id = " + getId() +
                ", name = '" + getName() + '\'' +
                ", pesel = " + getIdentifier() +
                ", birthDate = " + birthDate() +
                '}';
    }
}
