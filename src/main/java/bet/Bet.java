package bet;

import betType.BetType;

import java.util.function.Predicate;

public record Bet(BetType betType, Predicate<Integer> claim, int amount) {


}
