public class CharSelect {

    private int health;
    private int atk;
    String statBoost;

    /**
     *
     * @param health the amount of health a character has
     * @param atk the amount of attack power
     */
    CharSelect(int health, int atk) {
        this.health = health;
        this.atk = atk;

    }

    /**
     *
     * @param build takes the type of build of the character and adds on special buffs
     *              specific to that build
     */
     public void setStatBoost(String build){
        if (build.equalsIgnoreCase("mage")){
            atk+= 10;
            health+= 10;
            statBoost= "(10% mana recovery boost, +10 atk, +10hp)";
        } else if (build.equalsIgnoreCase("knight") ) {
            atk+= 40;
            health+= 40;
            statBoost= "(20% slower mana regen, 20% faster combat mastery exp gain, +40 atk, +40 health)";
        } else if (build.equalsIgnoreCase("juggernaut") ) {
            health+= 100;
            statBoost = "(50% more mana, 50% more health, 10% speed lost)";
        }
     }

    /**
     *
     * @return a basic return statement of a characters stats.
     */
    @Override
    public String toString(){
        return "Your character has " + atk + " attack and " + health + " HP";
    }

}
