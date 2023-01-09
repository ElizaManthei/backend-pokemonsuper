public abstract class Pokemon {
    String name;
    private int level;
    private int hp;
    private int xp;
    private int attack;
    private int def;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001b[33m";
    public static final String ANSI_B_FIRE = "\u001b[41m";
    public static final String ANSI_B_WATER = "\u001b[44m";
    public static final String ANSI_B_GRASS = "\u001b[42m";
    public static final String ANSI_B_ELECTRIC = "\u001b[46m";

    public Pokemon(String name, int level, int hp, int xp){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;

    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }





    public void eats(){
        hp = hp+1;
    }
    public void minHp() {
        if (hp == 0){
            System.out.println(name + ": Ik slaap nu.");
        } else {
            hp = hp - 10;
        }
    }
    private void levelUp() {
        level = level + 1;
        System.out.println("\nLevel up! " + level + "!!!\n");
    }
    public void addXp (){
        xp = xp + 10;
        System.out.println(name + " xp added! New xp is " + xp);
        if(xp % 100 == 0) {
            levelUp();
        }
    }
    public void info(){
        System.out.println(name + ": level " + level + ", " + hp + "hp, " + xp + "xp.");
    }
    public abstract void whoIAm();
}
