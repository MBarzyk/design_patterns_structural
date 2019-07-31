package adapter.zad_2;

import adapter.zad_2.provider1.FileDataProvider;
import adapter.zad_2.provider1.Person;
import adapter.zad_2.provider1.PersonAdapter;
import adapter.zad_2.provider2.RandomDataProvider;
import adapter.zad_2.provider2.User;
import adapter.zad_2.provider2.UserAdapter;
import adapter.zad_2.provider3.Human;
import adapter.zad_2.provider3.HumanAdapter;
import adapter.zad_2.provider3.StaticDataProvider;

import java.util.ArrayList;
import java.util.List;

public class PeopleRegistry {

    public List<IPeopleData> getListOfAllPeople () {
        List<IPeopleData> peopleData = new ArrayList<>();

        StaticDataProvider staticDataProvider = new StaticDataProvider();
        for (Human human : staticDataProvider.getHumanList()) {
            peopleData.add(new HumanAdapter(human));
        }

        List<Person> personList = new FileDataProvider().getPeopleList();
        for (Person person : personList) {
            peopleData.add(new PersonAdapter(person));
        }

        List<User> userList = new RandomDataProvider().getSystemUsersList();
        for (User user : userList) {
            peopleData.add(new UserAdapter(user));
        }

        return peopleData;
    }
}
