package BattleshipGameApp;
public class Main {
    public static void main(String[] args) {
        BattleshipGame game = new BattleshipGame(5);
        game.placeShip(1, 1);
        game.placeShip(2, 2);
        game.placeShip(3, 3);

        System.out.println(game.attack(1, 1));  
        System.out.println(game.attack(0, 0));  
        System.out.println(game.attack(5, 5));  
    }
}
