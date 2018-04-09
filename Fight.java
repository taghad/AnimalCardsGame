public class Fight {
    private Animal atacker;
    private Animal defender;

    public Fight(Animal atacker, Animal defender, int damage) {
        this.atacker = atacker;
        this.defender = defender;
        defender.hit(damage);
        atacker.decreaseEnergy(damage);
    }
}
