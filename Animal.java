public abstract class Animal  {
    private int energy;
    private int health;
    private int atack1;
    private int atack2 = 0;
    private int live;
    private int maxEnergy;
    private String Name;


    public Animal(int energy, int health, int atack1) {
        this.energy = energy;
        maxEnergy = energy;
        this.health = health;
        this.atack1 = atack1;
        this.live = 1;
    }

    public void hit (int hit) {
        this.health -= hit;
    }

    public int atack1() {
         if (atack1>energy )
             return atack1;
         else
             return -1;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHealth() {
        return health;
    }

    public int getAtack1() {
        return atack1;
    }

    public void death() {
        live = 0;

    }

    public int getAtack2() {
        return atack2;
    }

    public void setAtack2(int atack2) {
        this.atack2 = atack2;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {

        Name = name;
    }
    public void decreaseEnergy(int i) {
        energy -= i;

    }
    public void recharge() {
        energy = maxEnergy;
    }



}
