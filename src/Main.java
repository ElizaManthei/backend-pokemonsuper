public class Main {

    public static void main(String[] args) {



        FirePokemon firePokemon = new FirePokemon("Flame", 1, 100, 90, 55, "wood");
        WaterPokemon waterPokemon = new WaterPokemon("Torrent",2,30,10,500,60);
        GrassPokemon grassPokemon = new GrassPokemon("Pampas",3,50,40,135,"green");
        ElectricPokemon electricPokemon = new ElectricPokemon("Elec", 1,80,30,220,"DC");

        firePokemon.whoIAm();
        firePokemon.extraFood("wood");
        firePokemon.superFire(grassPokemon);

        waterPokemon.whoIAm();
        waterPokemon.newSpeed(600);
        waterPokemon.temperatureCheck();

        grassPokemon.whoIAm();
        grassPokemon.grassGrow();
        grassPokemon.colorChange();

        electricPokemon.whoIAm();
        electricPokemon.voltageIncrease(-20);
        electricPokemon.acOrDcCheck();


    }
}