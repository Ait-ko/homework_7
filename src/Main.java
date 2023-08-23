public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] hero = {new Magic(100,50,"Молнию"),
        new Magic(120,30,"Исциление"), new Warrior(100,70,"Критический урон")};
        for (HavingSuperAbility heroes : hero) {
            heroes.hp();
            heroes.damage();
            heroes.applySuperAbility();


        }

        }
    }
