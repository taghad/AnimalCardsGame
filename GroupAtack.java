import java.util.ArrayList;
import java.util.Iterator;

public class GroupAtack {
    private ArrayList<Animal> atackers;
    private Animal Defender;

    public GroupAtack(ArrayList<Animal> atackers, Animal defender, int type) {

        this.atackers = atackers;
        Defender = defender;
        atack(type);
    }

    public void atack(int type) {
        Iterator<Animal> it = atackers.listIterator();
        int damage = 0;
            while (it.hasNext())
                if(type == 1)
                    damage += it.next().getAtack1();
                else
                    damage += it.next().getAtack2();
            it = atackers.listIterator();
            while (it.hasNext())
                it.next().decreaseEnergy(damage/atackers.size());
            Defender.hit(damage);


    }
}

