package MagicalArenaAssesment;

public class Arena {
    private Player player1;
    private Player player2;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startMatch() {
        while (player1.isAlive() && player2.isAlive()) {
            takeTurn(player1, player2);
            if (player2.isAlive()) {
                takeTurn(player2, player1);
            }
        }
        announceWinner();
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackDamage = attacker.rollAttack();
        int defense = defender.rollDefense();
        int damage = Math.max(0, attackDamage - defense);

        System.out.printf("%s attacks %s: Attack Damage = %d, Defense = %d, Actual Damage = %d%n",
                attacker.getName(), defender.getName(), attackDamage, defense, damage);

        defender.takeDamage(damage);

        System.out.printf("%s's health: %d%n", defender.getName(), defender.getHealth());
    }

    private void announceWinner() {
        if (player1.isAlive()) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }
}

