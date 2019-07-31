package adapter.zad_2.provider2;

import adapter.zad_2.IPeopleData;

import java.time.LocalDate;

public class UserAdapter implements IPeopleData {
    private final User user;

    public UserAdapter(User user) {
        this.user = user;
    }

    @Override
    public int getId() {
        return this.user.getIdentifier();
    }

    @Override
    public String getName() {
        return this.user.getNameAndSurname();
    }

    @Override
    public String getIdentifier() {
        return this.user.getSocialIdentifier();
    }

    @Override
    public LocalDate birthDate() {
        return this.user.getBirthDate();
    }

    @Override
    public String toString() {
        return "id = " + getId() +
                ", name = '" + getName() + '\'' +
                ", pesel = " + getIdentifier()  +
                ", birthDate = " + birthDate() +
                '}';
    }
}
