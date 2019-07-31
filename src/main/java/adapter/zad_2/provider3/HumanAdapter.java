package adapter.zad_2.provider3;

import adapter.zad_2.IPeopleData;
import lombok.Data;

import java.time.LocalDate;

@Data
public class HumanAdapter implements IPeopleData {

    private final Human human;

    public HumanAdapter(Human human) {
        this.human = human;
    }

    @Override
    public int getId() {
        return this.human.getId();
    }

    @Override
    public String getName() {
        return this.human.getName() + " " + this.human.getSurname();
    }

    @Override
    public String getIdentifier() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public LocalDate birthDate() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "id = " + getId() +
                ", name = '" + getName() + '\'' +
                ", pesel = unsupported" +
                ", birthDate = unsupported";
    }

}
