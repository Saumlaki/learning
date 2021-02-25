package DIExample.FirstExample;

//Класс подвига - убийство дракона
public class SlayDragonQuest implements Quest {
    @Override
    public void embark() {
        System.out.printf("Дракон повержен!");
    }
}
