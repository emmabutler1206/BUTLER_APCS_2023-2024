class Vulpix extends Pokemon {
    private String[] attacks;

    // Defining characteristics set up by class Pokemonj
    public Vulpix() {
        super("Vulpix", 38, 41, 40, 50, 65, 65);
        this.attacks = new String[]{"FAIRY DUST", "PUNCH", "GUST", "SAND ATTACK"};
    }

    // Defining bounds for the attacks
    public void useAttack(int attackIndex, Pokemon opp) {
        if (attackIndex >= 0 && attackIndex < attacks.length) {
            super.attack(opp, attacks[attackIndex]);
        } else {
            System.out.println("YOUR POKEMON CANNOT ATTACK");
        }
    }
}
