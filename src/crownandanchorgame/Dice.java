public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() {
		value = DiceValue.getRandom();
                return value;
                // the previous value is changes when we store variable and then return 
	}		
	
	public String toString() {
		return value.toString();
	}
}
