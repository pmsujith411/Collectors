package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsExercise 
{
	private List<Player> playerList = new ArrayList<>();

	public StreamCollectorsExercise(List<Player> playerList) {
		super();
		this.playerList = playerList;
	}
	
	public Map<String, List<Player>> getPlayersByCountry()
	{		
		return playerList.stream().collect(Collectors.groupingBy(player -> player.getCountry().getCountryName()));
	}
	
	public Map<String, List<Player>> getPlayerNamesByCountry()
	{		
		return playerList.stream().filter(player -> player.getMatchesPlayed()>100).collect(Collectors.groupingBy(player -> player.getCountry().getCountryName()));
	}
	
	public Map<Object, Long> getTotalPlayersByCountry()
	{
		return playerList.stream().collect(Collectors.groupingBy(player -> player.getCountry().getCountryName(), Collectors.counting()));
	}
	
	public Map<Object, Integer> getTotalRunsByCountry()
	{
		return playerList.stream().collect(Collectors.groupingBy(player -> player.getCountry().getCountryName(), Collectors.summingInt(Player::getRuns)));
	}
	
	public Map<Object, Integer> getMaxScoreByCountry()
	{
		return playerList.stream().collect(Collectors.toMap(player -> player.getCountry().getCountryName(), Player::getRuns, Integer::max));
	}
	
	public Map<Object, String> getPlayerNamesStringByCountry()
	{
		return playerList.stream().collect(Collectors.groupingBy(player -> player.getCountry().getCountryName(), Collectors.mapping(Player::getPlayerName, Collectors.joining(","))));
	}
}