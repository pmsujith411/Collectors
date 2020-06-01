package main.java;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecialStreamExercise 
{
	public static LinkedList<Integer> getSquaresOfThree()
	{
		return IntStream.rangeClosed(20, 50).filter(i -> (i%3 == 0) && (i%2 != 0)).map(i -> i*i).boxed().collect(Collectors.toCollection(LinkedList::new));
	}
	
	public static int[] getMultiplesOfFive()
	{
		return IntStream.iterate(0, i -> i+5).limit(20).toArray();
	}
}
