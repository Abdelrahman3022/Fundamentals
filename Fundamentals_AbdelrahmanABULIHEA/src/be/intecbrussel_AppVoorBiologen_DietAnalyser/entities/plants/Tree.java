package be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants;

public class Tree extends Plant{

    private LeafType leafType;


    public Tree(String name)
    {super(name);}

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leafType=" + leafType +
                "} " + super.toString();
    }
}
