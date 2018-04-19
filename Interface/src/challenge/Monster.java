package challenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private int hitPoint;
    private String name;
    private int strength;

    public Monster(int hitPoint, String name, int strength) {
        this.hitPoint = hitPoint;
        this.name = name;
        this.strength = strength;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "hitPoint=" + hitPoint +
                ", name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> value = new ArrayList<String>();
        value.add(""+this.hitPoint);
        value.add(this.name);
        value.add(""+this.strength);
        return value;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.hitPoint = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }

    }
}
