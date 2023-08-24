public class Medic extends Hero{

    private int healPoints;

    public Medic(int hp, int damage, String superAbility, int healPoints) {
        super(hp, damage, superAbility);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Медик применил " + getSuperAbility());
    }

    @Override
    public void hp() {
        System.out.println("Медик Hp " + getHp() );
    }

    @Override
    public void damage() {
        System.out.println("Damage " + getDamage());
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints (int healPoints){
        this.healPoints = healPoints;
    }
    public void increaseExperience() {
        healPoints = (int) (healPoints * 1.1);
    }
}
