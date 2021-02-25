package AOPExample.FirstExample;

//Класс реализующий поведение храброго рыцаря который может выполнять любые задания за счет интерфейса Quest
public class BraveKnight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {

        quest.embark();
    }
}
