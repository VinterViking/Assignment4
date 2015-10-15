import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestBug1 {

	@Test
	public void testOneMatch() {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();

		Player player = new Player("Fred", 100);
		Game game = new Game(d1, d2, d3);
		List<DiceValue> cdv = new ArrayList<DiceValue>();

		cdv.add(DiceValue.ANCHOR);
		cdv.add(DiceValue.CLUB);
		cdv.add(DiceValue.SPADE);

		String name = "Fred";
		int balance = 100;
		int limit = 0;
		player = new Player(name, balance);
		player.setLimit(limit);
		int bet = 5;

		assertEquals(player.getBalance(), 100);
		
		System.out.println(String.format("Start Game %d: ", 1));
		System.out.println(String.format("%s starts with balance %d, limit %d", player.getName(), player.getBalance(),
				player.getLimit()));

		int turn = 0;

		turn++;
		DiceValue pick = DiceValue.ANCHOR;

		System.out.printf("Turn %d: %s bet %d on %s\n", turn, player.getName(), bet, pick);

		int winnings = game.playRoundTestingOne(player, pick, bet);

		System.out.printf("Rolled %s, %s, %s\n", cdv.get(0), cdv.get(1), cdv.get(2));

		if (winnings > 0) {
			System.out.printf("%s won %d, balance now %d\n\n", player.getName(), winnings, player.getBalance());

		} else {
			System.out.printf("%s lost, balance now %d\n\n", player.getName(), player.getBalance());

		}
		
		System.out.println(String.format("%s now has balance %d\n", player.getName(), player.getBalance()));
		
		assertEquals(player.getBalance(), 100);
		
	}
	
	@Test
	public void testTwoMatch() {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();

		Player player = new Player("Fred", 100);
		Game game = new Game(d1, d2, d3);
		List<DiceValue> cdv = new ArrayList<DiceValue>();

		cdv.add(DiceValue.ANCHOR);
		cdv.add(DiceValue.ANCHOR);
		cdv.add(DiceValue.SPADE);

		String name = "Fred";
		int balance = 100;
		int limit = 0;
		player = new Player(name, balance);
		player.setLimit(limit);
		int bet = 5;

		assertEquals(player.getBalance(), 100);
		
		System.out.println(String.format("Start Game %d: ", 2));
		System.out.println(String.format("%s starts with balance %d, limit %d", player.getName(), player.getBalance(),
				player.getLimit()));

		int turn = 0;

		turn++;
		DiceValue pick = DiceValue.ANCHOR;

		System.out.printf("Turn %d: %s bet %d on %s\n", turn, player.getName(), bet, pick);

		int winnings = game.playRoundTestingTwo(player, pick, bet);

		System.out.printf("Rolled %s, %s, %s\n", cdv.get(0), cdv.get(1), cdv.get(2));

		if (winnings > 0) {
			System.out.printf("%s won %d, balance now %d\n\n", player.getName(), winnings, player.getBalance());

		} else {
			System.out.printf("%s lost, balance now %d\n\n", player.getName(), player.getBalance());

		}
		
		System.out.println(String.format("%s now has balance %d\n", player.getName(), player.getBalance()));
		
		assertEquals(player.getBalance(), 105);
		
	}
	
	@Test
	public void testThreeMatch() {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();

		Player player = new Player("Fred", 100);
		Game game = new Game(d1, d2, d3);
		List<DiceValue> cdv = new ArrayList<DiceValue>();

		cdv.add(DiceValue.ANCHOR);
		cdv.add(DiceValue.ANCHOR);
		cdv.add(DiceValue.ANCHOR);

		String name = "Fred";
		int balance = 100;
		int limit = 0;
		player = new Player(name, balance);
		player.setLimit(limit);
		int bet = 5;

		assertEquals(player.getBalance(), 100);
		
		System.out.println(String.format("Start Game %d: ", 3));
		System.out.println(String.format("%s starts with balance %d, limit %d", player.getName(), player.getBalance(),
				player.getLimit()));

		int turn = 0;

		turn++;
		DiceValue pick = DiceValue.ANCHOR;

		System.out.printf("Turn %d: %s bet %d on %s\n", turn, player.getName(), bet, pick);

		int winnings = game.playRoundTestingThree(player, pick, bet);

		System.out.printf("Rolled %s, %s, %s\n", cdv.get(0), cdv.get(1), cdv.get(2));

		if (winnings > 0) {
			System.out.printf("%s won %d, balance now %d\n\n", player.getName(), winnings, player.getBalance());

		} else {
			System.out.printf("%s lost, balance now %d\n\n", player.getName(), player.getBalance());

		}
		
		System.out.println(String.format("%s now has balance %d\n", player.getName(), player.getBalance()));
		
		assertEquals(player.getBalance(), 110);
		
	}
	
}
