
public class CallingCard extends Card{

	private String cardNumber;
	private String pinNumber;

	public CallingCard(String n, String card, String pin) {
		super(n);
		cardNumber = card;
		pinNumber = pin;
	}
	public String format()
	{
		return super.format() + " Card Number: " + cardNumber + " Pin Number: " + pinNumber;
	}

	public String getPin() {
		return pinNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public boolean equals(Object otherObject)
	{
		CallingCard other = (CallingCard) otherObject;
		return super.equals(otherObject) && getClass() == otherObject.getClass() && cardNumber == other.getCardNumber() && pinNumber == other.getPin();
	}


}
