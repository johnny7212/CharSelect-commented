public class Angel extends CharSelect {
    private final String blessing;
    private final String build;

    /**
     *
     * @param blessing similar to a support skill
     * @param build the type of character
     */
    public Angel (String blessing, String build) {
        super(200,75);
        this.blessing = blessing;
        this.build = build;
    }

    /**
     *
     * @return supers the toString method and then adds on extra description of the character
     */
    @Override
    public String toString(){
        setStatBoost(build);
        return super.toString() + ", has a " + blessing + " blessing and has a " + build + " build. " + statBoost;

    }

    public static void main(String[] args) {
        Angel Alex = new Angel("ally buff", "mage");
        System.out.println(Alex.toString());
    }
}
