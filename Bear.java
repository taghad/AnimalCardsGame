public class Bear extends Animal{


    public Bear() {
        super(900, 850, 130);
        super.setAtack2(600);
        super.setName("Bear");
    }

    public int atack2() {
        if (super.getAtack2()>getEnergy() )
            return getAtack2();
        else
            return -1;
    }

}
