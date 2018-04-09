public class Tiger extends Animal {


    public Tiger() {
        super(850, 850, 120);
        super.setAtack2(650);
        super.setName("Tiger");
    }

    public int atack2() {
        if (getAtack2()>getEnergy() )
            return getAtack2();
        else
            return -1;
    }

}
