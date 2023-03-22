public class Demon extends CharSelect{


    private String style;
    private String power;
    private final String build;
    private String weapon;

    /**
     *
     * @param power a special magic power
     * @param build type of character
     */
    Demon(String power, String build) {
        super(100,175);
        this.power= power;
        this.build= build;

    }

    /**
     *
     * @return a getter for build
     */
    public String getBuild() {
        return build;
    }

    /**
     *
     * @param style style of weapon
     * @param build type of player
     * @param weapon weapon of choice
     */
     Demon(String style, String build, String weapon) {
        super(100,175);
        this.style = style;
        this.build= build;
        this.weapon = weapon;

    }

    /**
     *
     * @return depending on whether the demon character has a power or uses a weapon,
     *         it will print out a different string.
     */
    @Override
    public String toString(){
        setStatBoost(getBuild());
        if (power != null) {
            return super.toString() + " , has a talent for " + power + " and has a " + build + " build. " + statBoost;
        }else {
            return super.toString() + " , has a talent for " + style + " " + weapon  +" and has a " + build + " build. " + statBoost;
        }
    }}




