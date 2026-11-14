
public class PhraseMatic {
    public static void main (String args[]) {
        String[] worldListone = {"Alpha" , "Beta" , "Gama" , "Omicron" , "Delta" , "Omega" , "Zeta" , "Epsilon"};
        String[] worldListtwo = {"Invation" , "Operation" , "Campaign" , "Distination" , "Quonceror" , "Distrection" , "Battle"};
        String[] worldListthree= {"Star" , "Light" , "Planet" , "Black Hole" , "White Hole" , "Moons" , "Rings" , "Sky" , "Star Dust" , "Comet"};

        int oneLength = worldListone.length;
        int twoLength = worldListtwo.length;
        int threeLength = worldListthree.length;

        java.util.Random RandomGeneretor = new java.util.Random();

        int randOne = RandomGeneretor.nextInt(oneLength);
        int randTwo = RandomGeneretor.nextInt(twoLength);
        int randThree = RandomGeneretor.nextInt(threeLength);

        String phrase  = worldListone[randOne] + " | " + worldListtwo[randTwo] + " | " + worldListthree[randThree];

        System.out.println("Random words is : " + phrase);

        System.out.println(randOne);
        System.out.println(randTwo);
        System.out.println(randThree);
        
    }
}