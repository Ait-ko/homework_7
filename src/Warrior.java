public class Warrior extends Hero{
    public Warrior(int hp, int damage, String superAbility) {
        super(hp, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Воин применил " + getSuperAbility());
    }
    @Override
    public void hp() {
        System.out.println("Воин Hp " + getHp() );
    }

    @Override
    public void damage() {
        System.out.println("Damage " + getDamage());
    }
}
