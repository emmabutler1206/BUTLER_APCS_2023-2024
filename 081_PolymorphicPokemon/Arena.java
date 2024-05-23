public class Arena {

        public static void main(String[] args) {
            Pokemon vulpix = new vulpix();
            // Characteristics and information 
            System.out.println("Listed Below are the Characteroistics of your pokemon");
            System.out.println("The name of your pokemon is: " + vulpix.getPokemonName());
            System.out.println("The health points are: " + vulpix.getHealthPoints());
            System.out.println("The attack points are: " + vulpix.getAttackPower());
            System.out.println("The defense points are: " + vulpix.getDefensePower());
            System.out.println("The special attack points are: " + vulpix.getSpecialAttack());
            System.out.println("Special defense points are: " + vulpix.getSpecialDefense());
            System.out.println("The speed points are: " + vulpix.getSpeed());
    
            // accesing the vulpix class 
            Vulpix myVulpix = (Vulpix) vulpix;
            super("YOUR OPP IS", 100, 4, 0, 5, 5, 5);
        } 
    }
