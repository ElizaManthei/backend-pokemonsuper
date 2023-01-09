public class  ElectricPokemon extends Pokemon{

    private int voltage;
    private String acOrDc;

    public ElectricPokemon(String name, int level, int hp, int xp, int voltage, String acOrDc){
        super(name, level, hp, xp);
        this.name=name;
        this.voltage = voltage;
        this.acOrDc = acOrDc;

    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getAcOrDc() {
        return acOrDc;
    }

    public void setAcOrDc(String acOrDc) {
        this.acOrDc = acOrDc;
    }

    public void voltageIncrease (int voltageInc){
        voltage = voltage + voltageInc;
        if (voltageInc > 0) {
            System.out.println(ANSI_RED + "Caution, voltage increase!" + ANSI_RESET);
        } else if (voltageInc < 0) {
            System.out.println("Voltage drop");
        } else{
            System.out.println("I do not understand...");
        }
    }
    public void acOrDcCheck() {
        System.out.println("I'm " + acOrDc);
    }
    @Override
    public void whoIAm() {

        System.out.println("\n" + ANSI_B_ELECTRIC + "My name is " + name + ", electric pokemon." + ANSI_RESET);
        System.out.println("My voltage is " + voltage + "V, " + acOrDc + ".");
    }
}
