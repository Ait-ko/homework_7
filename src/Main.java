public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] hero = {new Magic(100,50,"Молнию"),
        new Medic(120,30,"Исциление",50), new Warrior(100,70,"Критический урон")};
        for (HavingSuperAbility heroes : hero) {
            heroes.hp();
            heroes.damage();
            heroes.applySuperAbility();


        }
        Medic[] medic = new Medic[5];


        medic[0] = new Medic(120,30,"Исцеление",40);
        medic[1] = new Medic(120,30,"Исцеление",50);
        medic[2] = new Medic(120,30,"Исцеление",60);
        medic[3] = new Medic(120,30,"Исцеление",70);
        medic[4] = new Medic(120,30,"Исцеление",80);
        for (int i = 0; i < medic.length; i++) {
            medic[i].increaseExperience();
        } for (int i = 0; i < medic.length; i++) {
            System.out.println("Медик " + i + ": " + medic[i].getHealPoints() + " единиц лечения");
        }
        }
    }
