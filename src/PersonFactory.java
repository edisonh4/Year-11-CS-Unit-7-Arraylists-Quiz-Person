import java.util.ArrayList;

public class PersonFactory {
    private ArrayList<Person> allPersons;
    public PersonFactory() {
        allPersons = new ArrayList<>();
    }
    public void addPerson(Person person) {
        if(allPersons.isEmpty() == true){
            allPersons.add(person);
        }
        int count = 0;
        for (Person person1 : allPersons) {
            if (person1.getLastName().compareTo(person.getLastName()) < 0) {
                allPersons.add(count, person);
                break;
            }
            count++;
        }
    }
    public ArrayList<Person> under18() {
        ArrayList<Person> under18 = new ArrayList<>();
        for(Person randomPerson: allPersons){
            if(randomPerson.getAge() < 18){
                under18.add(randomPerson);
            }
        }
        return under18;
    }
    public boolean checkLastName(String lastName) {
        boolean trueOrFalse = false;
        for(Person randomPerson: allPersons){
            if(randomPerson.getLastName().equals(lastName)){
                trueOrFalse = true;
            }
            else trueOrFalse = false;
        }
        return trueOrFalse;
    }
}
