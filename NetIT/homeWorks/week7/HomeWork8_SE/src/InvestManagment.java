
public class InvestManagment {

	private int investId;
	private int minAmount;
	private double marginCoefficient;
	private int riskReward;
	private String investName;
	
	public int getInvestId() {
		return investId;
	}
	public void setInvestId(int investId) {
		this.investId = investId;
	}
	public int getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(int minAmount) {
		this.minAmount = minAmount;
	}
	public double getMarginCoeficient() {
		return marginCoefficient;
	}
	public void setMarginCoeficient(double marginCoefficient) {
		this.marginCoefficient = marginCoefficient;
	}
	public int getRiskManagment() {
		return riskReward;
	}
	public void setRiskManagment(int riskReward) {
		this.riskReward = riskReward;
	}
	public String getInvestName() {
		return investName;
	}
	public void setInvestName(String investName) {
		this.investName = investName;
	}
	
	public void displayInvest() {
		
		SetUpPlayers.myFrame.textInfoInvest.setText(" Име на инвестицията: " + this.investName + "\n"
		                                            +  " Минимална сума за инвестицията: " + this.minAmount + " лв." + "\n"
		                                            +  " Коефициент на възвращаемост: " + this.marginCoefficient + "\n");
		                                       //   +  " Рисков интервал: " + this.riskReward);

	}
public void displayAllInvest() {
		
		                              String name = (" Име на инвестицията: " + this.investName + "\n"
		                                            +  " Минимална сума за инвестицията: " + this.minAmount + " лв." + "\n"
		                                            +  " Коефициент на възвращаемост: " + this.marginCoefficient + "\n");
		                                       //   +  " Рисков интервал: " + this.riskReward);
}
}
