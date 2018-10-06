package quizs.quiz18.questionnaire_2;

public class HolderA {
    static HolderB i;
    static HolderB j;

    public HolderA(int i, int j) {
        this.i = new HolderB(i);
        this.j = new HolderB(j);
    }
}
