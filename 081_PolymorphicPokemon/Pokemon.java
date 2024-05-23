public class Pokemon {
    private String pokemonName;
    private int healthPoints;
    private int attackPower;;
    private int defensePower;
    private int specialAttack;
    private int specialDefense;
    private int speed;
  
    //Constructor 
    public Pokemon(String pokemonName, int healthPoints, int attackPower, int defensePower, int specialAttack, int specialDefense, int speed) {
      this.pokemonName = pokemonName;
      this.healthPoints = healthPoints;
      this.attackPower = attackPower;
      this.defensePower = defensePower;
      this.specialAttack = specialAttack;
      this.specialDefense= specialDefense;
      this.speed = speed;
    }
    // attack method 
    public void attack(Pokemon opp, String attackName) {
      System.out.println("THE POKEMON" + pokemonName + " DECIDES TO ATTACK " + opp.getPokemonName() + " WITH "
          + attackName + "WHAT A SHOW");
    }
  
    // defense methof
    public void defend() {
      System.out.println(pokemonName + " DEFENDS AGAINST" + opp.getPokenmonName());
    }
  
    // Getters 
    public String getPokemonName() {
      return pokemonName;
    }
  
    public int getHealthPoints() {
      return healthPoints;
    }
  
    public int getAttackPower() {
      return attackPower;
    }
  
    public int getDefensePower() {
      return defensePower;
    }
  
    public int getSpecialAttack() {
      return specialAttack;
    }
  
    public int getSpecialDefense() {
      return specialDefense;
    }
  
    public int getSpeed() {
      return speed;
    }
  }
