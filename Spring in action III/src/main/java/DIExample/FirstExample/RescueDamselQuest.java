package DIExample.FirstExample;

//Класс подвига - спасение дамы
public class RescueDamselQuest implements Quest{
    @Override
    public void embark() {
        System.out.println("Храбрый рыцарь спасает даму!");
    }
}
