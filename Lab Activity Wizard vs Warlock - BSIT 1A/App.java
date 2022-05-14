public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begins!");
        System.out.println("1v1 Mid Only");
        System.out.println("Invoker Vs Warlocks");
        System.out.println("Both Dota 2 Heroes Have 3470 HP and 2470 Mana and Reached Max Level");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Wizard Invoker = new Wizard("Invoker");
        Warlock Warlock = new Warlock("Warlock");
        Invoker.Tornado(Warlock);
        Invoker.EMP(Warlock);
        Invoker.SunStrike(Warlock);
        Invoker.ChaosMeteor(Warlock);
        Invoker.IceWall(Warlock);
        Invoker.DefeningBlast(Warlock);
        Warlock.FatalBonds(Invoker);
        Warlock.UpHeaval(Invoker);
        Warlock.ChaoticOffering(Invoker);
        Warlock.FlamingFist(Invoker);
        Warlock.ShadowWord(Invoker);
    }
}