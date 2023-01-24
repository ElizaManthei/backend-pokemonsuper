

public class FirePokemon extends Pokemon{

    private  int maxTemperature;
    private String food;



    public FirePokemon(String name, int level, int hp, int xp, int maxTemperature, String food){
        super(name, level, hp, xp);
        this.maxTemperature = maxTemperature;
        this.food = food;
    }


    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void extraFood(String food){

        if(food.equals("wood")) {
            setHp(getHp() + 10);
        } else {
            super.eats();
        }
        System.out.println("I ate " + food + ". My hp is now " + this.getHp() + "!");
    }

    public void superFire(Pokemon pokemon){
        super.minHp();
        pokemon.minHp();

        if (pokemon instanceof WaterPokemon ){
            super.setHp(0);
            pokemon.addXp();
            System.out.println("I lost with " + pokemon.name + " :(");

        } else if (pokemon instanceof GrassPokemon){
            super.addXp();
            pokemon.setHp(0);
            System.out.println("I won with " + pokemon.name + ":");
        } else {
            System.out.println("My super power doesn't work with " + pokemon.name);
        }
        System.out.println("---");
        pokemon.info();
        this.info();
        System.out.println("---");

    }

    @Override
    public void whoIAm() {
        System.out.println("\n" + ANSI_B_FIRE + "I'm " + name + ". My element is fire." + ANSI_RESET);
        System.out.println("I reach " + maxTemperature + " degrees and I eat " + food + "." );
    }
}
