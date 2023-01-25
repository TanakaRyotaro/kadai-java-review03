package baseball;

public class Review03 {
    public static void main(String[] args) {
        BaseBallTeam bbt = new BaseBallTeam();
        bbt.setName("東京ヤクルトスワローズ");
        bbt.setWin(80);
        bbt.setLose(59);
        bbt.setDraw(4);
        bbt.report();

        BaseBallTeam bbt01 = new BaseBallTeam();
        bbt01.setName("横浜DeNAベイスターズ");
        bbt01.setWin(73);
        bbt01.setLose(68);
        bbt01.setDraw(2);
        bbt01.report();

        BaseBallTeam bbt02 = new BaseBallTeam();
        bbt02.setName("阪神タイガース");
        bbt02.setWin(68);
        bbt02.setLose(71);
        bbt02.setDraw(4);
        bbt02.report();

        BaseBallTeam bbt03 = new BaseBallTeam();
        bbt03.setName("読売ジャイアンツ");
        bbt03.setWin(68);
        bbt03.setLose(72);
        bbt03.setDraw(3);
        bbt03.report();

        BaseBallTeam bbt04 = new BaseBallTeam();
        bbt04.setName("広島東洋カープ");
        bbt04.setWin(66);
        bbt04.setLose(74);
        bbt04.setDraw(3);
        bbt04.report();

        BaseBallTeam bbt05 = new BaseBallTeam();
        bbt05.setName("中日ドラゴンズ");
        bbt05.setWin(66);
        bbt05.setLose(75);
        bbt05.setDraw(2);
        bbt05.report();
    }
}