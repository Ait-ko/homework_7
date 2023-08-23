public class Medic extends Hero{

    public Medic(int hp, int damage, String superAbility) {
        super(hp, damage, superAbility);
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
}
