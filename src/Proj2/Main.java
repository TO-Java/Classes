package Proj2;

public class Main {

    public static void main(String[] args) {

        Team maccabiHaifa = new Team("Maccbi Haifa");
        Team hapoelTelAviv = new Team("Hapoel Tel-Aviv");
        Team beitarYerushalaim = new Team("Beitar Yerushalaim");

        Team[] teams = new Team[3];
        teams[0] = maccabiHaifa;
        teams[1] = hapoelTelAviv;
        teams[2] = beitarYerushalaim;

        Table firstLeague = new Table("First League", teams);

        Game g1 = new Game(maccabiHaifa, beitarYerushalaim, 2, 4);

        firstLeague.addGame(g1);

        Game g2 = new Game(beitarYerushalaim, maccabiHaifa, 4, 0);
    }
}
