public class Hero implements HavingSuperAbility{
    private  int hp  ;
    private  int damage  ;
    private String superAbility;
    public Hero(int hp , int damage, String superAbility){
        this.hp = hp;
        this.damage = damage ;
        this.superAbility= superAbility;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    @Override
    public void applySuperAbility() {

    }

    @Override
    public void hp() {

    }

    @Override
    public void damage() {

    }
}
