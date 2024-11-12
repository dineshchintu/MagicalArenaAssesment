package MagicalArenaAssesment;

class Player{
    private String name;
    private int health;
    private int attack;
    private int strength;

    public Player(String name, int health, int attack, int strength) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.strength = strength;
    }
    public boolean isAlive() {
        return this.health > 0;
    }
    public int rollAttack() {
        return attack * rollDie();
    }
    public int rollDefense() {
        return strength * rollDie();
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }
    private int rollDie() {
        return (int) (Math.random() * 6) + 1;  // Generates a random value from 1 to 6
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }   
}
