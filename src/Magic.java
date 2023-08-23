public class Magic extends Hero implements HavingSuperAbility{


    public Magic(int hp, int damage, String superAbility) {
        super(hp, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Маг применил " + getSuperAbility());
    }

    @Override
    public void hp() {
        System.out.println("Маг Hp " + getHp() );
    }

    @Override
    public void damage() {
        System.out.println("Damage " + getDamage());
    }
}
