import javax.swing.JOptionPane;

public class Players {

	private String  name;
	private Fields  avatar;
	private int     id;
	private int     money            = 1000;
	private int     position;
	private boolean isProtected      = false;
	private boolean isStealProtected = false;
	private static int fieldsNumber  = 19;
	private static int loopMoney     = 1000;

	public Players(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;

	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int dice, int currentPosition, int currentMoney) {

		if (currentPosition + dice > fieldsNumber) {
			this.position = dice - (fieldsNumber - currentPosition);
			
			JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, "Получавате " + loopMoney + " лв. за преминато поле СТАРТ", 
					                      "Честито", JOptionPane.INFORMATION_MESSAGE);
	
			this.money = currentMoney + loopMoney;
			Steal.isStealFree = true;
		} else {
			this.position = currentPosition + dice;
		}
	}

	public int trapInvestments(int investments) {

		this.money = this.money - investments;
		return this.money;
	}

	public int trapCharge(int charge) {
		this.money = this.money - charge;
		return this.money;
	}
	
	public int chanceCharge(int charge) {
		this.money = this.money - charge;
		return this.money;
	}
	
	public int chanceBonus(int chanceBonus) {
		this.money = this.money + chanceBonus;
		return this.money;
	}
	
	public int partyCharge(int charge) {
		this.money = this.money - charge;
		return this.money;
	}
	
	public int stealBonus(int stealBonus) {
		this.money = this.money + stealBonus;
		return this.money;
	}
	
	public int investCharge(int investCharge) {
		this.money = this.money - investCharge;
		return this.money;
	}
	
	public double investProfit(int investProfit) {
		this.money = this.money + investProfit;
		return this.money;
	}

	public boolean isProtected() {
		return isProtected;
	}

	public void setProtected(boolean isProtected) {
		this.isProtected = isProtected;
	}

	public void displayPosition() {
		
		
		
	//	System.out.println("Позицията на играч " + this.name + " е: " + this.position);
		System.out.println("Вашите пари са: " + this.money);
		
		SetUpPlayers.myFrame.textInfoMoneyLeft.setText("");
		SetUpPlayers.myFrame.textInfoMoneyLeft.setText(" Вие разполaгате с: " 
		+ String.valueOf(this.money) + " лв.");
		
	}
	
	public void displayRsults() {
	
		System.out.println("Останали пари: " + this.money);
		System.out.println("Име на играча: " + this.name);
		
	}

	public boolean isStealProtected() {
		return isStealProtected;
	}

	public void setStealProtected(boolean isStealProtected) {
		this.isStealProtected = isStealProtected;
	}

	public Fields getAvatar() {
		return avatar;
	}

	public void setAvatar(Fields avatar) {
		this.avatar = avatar;
	}


}
