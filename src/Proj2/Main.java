package Proj2;

public class Main {
    public static void main(String[] args) {
        Team maccabiHaifa = new Team("Maccbi Haifa");
        System.out.println(maccabiHaifa.getName());

        Team hapoelTelAviv = new Team("Hapoel Tel-Aviv");
        Team z = new Team("Beitar Yerushalaim");

        Table ligatHahal = new Table("Ligat HaHal", 3);
        Table ligaLeomit = new Table("Ligat Leomit", 3);

        ligatHahal.AddTeam(maccabiHaifa);
    }
}
