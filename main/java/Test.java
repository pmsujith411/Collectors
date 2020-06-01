package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test 
{
	static List<Player> playerList = new ArrayList<>();

	public static void main(String[] args) 
	{
		Country country1 = new Country("100", "india");
		Country country2 = new Country("101", "england");
		Country country3 = new Country("102", "srilanka");
		
		Player player1 = new Player("sachin", 400, 20000, 200, country1);
		Player player2 = new Player("kohli", 250, 10000, 83, country1);
		Player player3 = new Player("butler", 50, 6000, 100, country2);
		Player player4 = new Player("jayawardene", 300, 12000, 150, country3);
		Player player5 = new Player("aktar", 20, 4000, 20, country2);
		Player player6 = new Player("lara", 390, 16000, 160, country3);
		
		playerList.add(player1);
		playerList.add(player2);
		playerList.add(player3);
		playerList.add(player4);
		playerList.add(player5);
		playerList.add(player6);
		
		StreamCollectorsExercise streamCollectorsExercise = new StreamCollectorsExercise(playerList);
		
		System.out.println("Display player by country");
		streamCollectorsExercise.getPlayersByCountry().forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println();
		
		System.out.println("Display player by country who have played more than 100");
		streamCollectorsExercise.getPlayerNamesByCountry().forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println();
		
		System.out.println("Display total players by country");
		streamCollectorsExercise.getTotalPlayersByCountry().forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println();
		
		System.out.println("Display total runs by country");
		streamCollectorsExercise.getTotalRunsByCountry().forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println();
		
		System.out.println("Display maximum runs by country");
		streamCollectorsExercise.getMaxScoreByCountry().forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println();
		
		System.out.println("Display all player names by country");
		streamCollectorsExercise.getPlayerNamesStringByCountry().forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println();
		
		System.out.println("Display squares of three");
		SpecialStreamExercise.getSquaresOfThree().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Display multiples of five");
		System.out.println(Arrays.toString(SpecialStreamExercise.getMultiplesOfFive()));
		System.out.println();
	}

}
