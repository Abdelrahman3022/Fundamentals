package be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants;

public class Plant implements Comparable<Plant> {

    private String name;
    private double height;
    private Colour colour;
    private String sheet;
    private String oder;


    public Plant(String name) {
        this.name=name;
        this.height= this.height;
        this.colour=colour;
        this.sheet=sheet;
        this.oder=oder;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }


    public double getHeight() {return height;}
    public String getName() {return name;}
    public Colour getColour() {return colour;}
    public String getOder() {return oder;}
    public String getSheet() {return sheet;}

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", colour=" + colour +
                ", sheet='" + sheet + '\'' +
                ", oder='" + oder + '\'' +
                '}';
    }

    @Override
    public int compareTo(Plant o) {
        return 0;
    }
}
