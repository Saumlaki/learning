package AOPExample.FirstExample;

//Класс подвига - убийство дракона
public class SlayDragonQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Дракон повержен!");
    }
}
