public class GrassPokemon extends Pokemon{


    private int height;
    private String color;

    public GrassPokemon(String name, int level, int hp, int xp, int height, String color){
        super(name, level, hp, xp);
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

public void grassGrow() {
        height = height + 20;
        System.out.println("I'm taller! Now I am " + height);
}

public void colorChange() {
    switch (color) {
        case "red" -> {
            color = "yellow";
            System.out.println(ANSI_YELLOW + "I'm calming down" + ANSI_RESET);
            break;
        }
        case "green" -> {
            color = "red";
            System.out.println(ANSI_RED + "I'm angry now!" +ANSI_RESET);
            break;
        }
        default -> {
            color = "green";
            System.out.println(ANSI_GREEN + "Peace and love:)" + ANSI_RESET);
        }
    }


}

    @Override
    public void whoIAm() {
        System.out.println("\n" + ANSI_B_GRASS + "My name is " + name + ". I'm grass pokemon." + ANSI_RESET);
        System.out.println("I am " + color + ". My height is " + height + ".");
    }
}

