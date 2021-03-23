
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
		System.out.println("(" + this.investId + ")" + "Име на инвестицията " + this.investName);
		System.out.println("Минимална сума за инвестицията " + this.minAmount);
		System.out.println("Коефициент на възвращаемост " + this.marginCoefficient);
		System.out.println("Рисков интервал - ще разбереш след малко :)");
		System.out.println("");
	}
	
}
