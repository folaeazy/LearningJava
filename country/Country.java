package country;

public class Country {
    private String name;
    private int population;

    public static Country of( String name, int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

   public  static void main (String[] args) {
        Country c = Country.of("france", 100);
        System.out.println((c.getName() + c.getPopulation()));


    }


}
