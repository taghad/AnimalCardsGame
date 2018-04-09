public class Elephant extends Animal {


    public Elephant() {
        super(500, 1200, 70);
        super.setAtack2(50);
        super.setName("Elephant");
    }

    public int atack2() {
        if (getAtack2()>getEnergy() )
            return getAtack2();
        else
            return -1;
    }

}