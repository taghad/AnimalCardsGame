public class Cow extends Animal {


    public Cow() {
        super(400, 750, 90);
        super.setAtack2(100);
        super.setName("Cow");
    }

    public int atack2() {
        if (getAtack2()>getEnergy() )
            return getAtack2();
        else
            return -1;
    }

}