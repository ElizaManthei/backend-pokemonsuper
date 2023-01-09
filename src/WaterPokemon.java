public class WaterPokemon extends Pokemon{
    private int speedOfWaterFlow;
    private int temperatureOfWater;

    public WaterPokemon(String name, int level, int hp, int xp, int speedOfWaterFlow, int temperatureOfWater){
        super(name, level, hp, xp);
        this.speedOfWaterFlow = speedOfWaterFlow;
        this.temperatureOfWater = temperatureOfWater;
    }


    public int getSpeedOfWaterFlow() {
        return speedOfWaterFlow;
    }

    public void setSpeedOfWaterFlow(int speedOfWaterFlow) {
        this.speedOfWaterFlow = speedOfWaterFlow;
    }

    public int getTemperatureOfWater() {
        return temperatureOfWater;
    }

    public void setTemperatureOfWater(int temperatureOfWater) {
        this.temperatureOfWater = temperatureOfWater;
    }

    public void newSpeed(int nSpeed) {
        if (speedOfWaterFlow >= nSpeed) {
            System.out.println("Buuuu.... :(");
        } else {
            System.out.println("Wow, I will destroy everyone!");
            super.eats();
        }
    speedOfWaterFlow = nSpeed;
}

public void temperatureCheck(){
        if (temperatureOfWater <= 0){
            System.out.println("I am ice");
        } else if (temperatureOfWater >= 100) {
            System.out.println("I am warm, too warm...");
        } else {
            System.out.println("Everything's all right");
        }

}
    @Override
    public void whoIAm() {
        System.out.println("\n" + ANSI_B_WATER + "I'm " + name + ", water pokemon." + ANSI_RESET);
        System.out.println("I am " + temperatureOfWater  + " degrees and I flow " + speedOfWaterFlow + "m/s.");
    }
}
