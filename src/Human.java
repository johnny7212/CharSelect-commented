public class Human extends CharSelect{

    private String power;
    private String weapon;
    private final String build;
    private String style;

    /**
     *
     * @param power magic power
     * @param build type of character
     */
    Human(String power, String build) {
        super(100,175);
        this.power= power;
        this.build= build;

    }

    /**
     *
     * @param style style of weapon
     * @param build type of character
     * @param weapon weapon of choice
     */
    Human(String style, String build, String weapon) {
        super(100,175);
        this.style = style;
        this.build= build;
        this.weapon = weapon;

    }

    /**
     *
     * @return depending on whether the human character has a power or uses a weapon,
     *         it will print out a different string.
     */
    @Override
    public String toString() {
        setStatBoost(build);
        if (power != null) {
            return super.toString() + " , has a talent for " + power + " and has a " + build + " build. " + statBoost;
        }else {
            return super.toString() + " , has a talent for " + style + " " + weapon  +" and has a " + build + " build. " + statBoost;
        }
    }

    public static void main(String[] args) {
        CharSelect Maxis = new Human("One Sword style", "knight");
        System.out.println(Maxis.toString());
    }
}
