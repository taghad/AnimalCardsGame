public class Lion extends Animal {


    public Lion() {
        super(1000, 900, 150);
        super.setAtack2(500);
        super.setName("Lion");
    }

    public int atack2() {
        if (getAtack2()>getEnergy() )
            return getAtack2();
        else
            return -1;
    }

}
