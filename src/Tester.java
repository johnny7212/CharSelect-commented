public class Tester {
    public static void main(String[] args) {

        CharSelect[] characterSlots = new CharSelect[6];

        Demon Luciel = new Demon("Hellblaze", "mage");
        CharSelect Lucifer = new Demon("Two Handed", "knight", "Sword");
        Angel Indra = new Angel("Heal Zone", "mage");
        Human Michael = new Human("Earth magic","juggernaut");
        CharSelect Ashi = new Human("Three Handed", "Juggernaut", "Axe");
        Angel Raziel = new Angel("Benevolent light","knight");

        characterSlots[0]= Luciel;
        characterSlots[1]= Lucifer;
        characterSlots[2]= Indra;
        characterSlots[3]= Michael;
        characterSlots[4]= Ashi;
        characterSlots[5]= Raziel;

        for (CharSelect i : characterSlots){
            System.out.println(i.toString() + "<-- " + i.getClass());
            System.out.println();
        }



    }
}
