package adapter.zad_2;

import java.time.LocalDate;

public interface IPeopleData {
    public int getId();
    public String getName();
    public String getIdentifier() throws UnsupportedOperationException;
    public LocalDate birthDate() throws UnsupportedOperationException;
}
