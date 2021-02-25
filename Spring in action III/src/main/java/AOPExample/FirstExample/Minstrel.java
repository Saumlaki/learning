package AOPExample.FirstExample;

//Класс менестрель. Он поет о подвигах нашего рыцаря. До подвига и после. Демонстрирую тем самым работу аспекта
public class Minstrel {

    public void singBeforeQuest() {
        System.out.println("Ла ла ла! Рыцарь идет на подвиг!!!");
    }

    public void singAfterQuest() {
        System.out.println("Ла ла ла! Рыцарь совершил подвиг!!!");
    }
}
