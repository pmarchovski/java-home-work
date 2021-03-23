import java.util.ArrayList;
import java.util.Scanner;

public class Invest {

	private static ArrayList<InvestManagment> investCollection = new ArrayList<>();
	private static int investId;
	private static int riskRewardEvelCo;
	private static int riskRewardBombsAway;
	private static int riskRewardCWO;
	private static int riskRewardMaroders;
	private static int riskRewardFatcat;
	private static int riskRewardMacrosoft;
	private static int investCharge = 0;
	private static InvestManagment newInvest; 
	
	public static void createInvestCollection() {

		addIntoCollection(createInvestId(), "Evel Co", 500, 0.2);
		addIntoCollection(createInvestId(), "Bombs Away", 400, 0.5);
		addIntoCollection(createInvestId(), "Clock Work Orange", 300, 1.5);
		addIntoCollection(createInvestId(), "Maroders unated", 200, 2);
		addIntoCollection(createInvestId(), "Fatcat incorporated", 100, 2.5);
		addIntoCollection(createInvestId(), "Macrosoft", 50, 5);			
	}

	public static void invest() {
		
		if (Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].getFieldsName().
				equals(Board.invest.getFieldsName())) {
			
			System.out.println("Вие попаднахте на поле *** INVEST ***");
			
			if (!Steal.isStealFree && SetUpPlayers.playerIndex.isStealProtected() == true && Steal.choosePlan == 1) {
			System.out.println("Получавате награда от злият план");
			Steal.secondPlan();
		}
			System.out.println("");
			System.out.println("Имате възможност да инвесторате");
			System.out.println("Искате ли да го направите? y/n");
			Scanner scan = new Scanner(System.in);
			String answer = scan.nextLine();
			if (answer.equals("n")) Game.game();
			if (answer.equals("y")) {

				for (InvestManagment i : investCollection) {
					i.displayInvest();
					System.out.println("");				
				}
				chooseInvest();
			}
		}
	}
	
	private static int createInvestId() {
		investId++;
		return  investId;
	}
	
	private static void addIntoCollection(int id, String investName, int minAmount, 
			                             double marginCoefficient) {
		
		newInvest = new InvestManagment();
		newInvest.setInvestId(investId);
		newInvest.setInvestName(investName);
		newInvest.setMinAmount(minAmount);
		newInvest.setMarginCoeficient(marginCoefficient);

		investCollection.add(newInvest);
	}

	private static void chooseInvest() {
		double investProfit = 0;
		System.out.println("Изберете компания");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		
		
		
		for (int i = 0; i < investCollection.size(); i++) {
			if (choose == investCollection.get(i).getInvestId()) {
				System.out.println("Вие избрахте да инвестирате в \n" 
			    + investCollection.get(i).getInvestName());
				
				System.out.println("Минималната инвестиция е: " 
			    + investCollection.get(i).getMinAmount());
				System.out.println("Посочете сума която искате да инвестирате");
				investCharge = scan.nextInt();
				
				if (SetUpPlayers.playerIndex.getMoney() < investCollection.get(i).getMinAmount()) {
					System.out.println("Нямате достатъчно пари за тази инвестиция");
					SetUpPlayers.playerMovement();
				}
				if (investCharge < investCollection.get(i).getMinAmount()) {
					System.out.println("Въвели сте по-малка сума от минималното изискване за тази инвестиция");
					chooseInvest();
				} else {
					
					System.out.println("Вие инвестирахте: " + investCharge + " лв.");
		            SetUpPlayers.playerIndex.investCharge(investCharge);
		            
		            riskRewardEvelCo     = (int) (-5 + Math.random() * 105);
		        	riskRewardBombsAway  = (int) (-10 + Math.random() * 60);
		        	riskRewardCWO        = (int) (-15 + Math.random() * 50);
		        	riskRewardMaroders   = (int) (-18 + Math.random() * 68);
		        	riskRewardFatcat     = (int) (-25 + Math.random() * 125);
		        	riskRewardMacrosoft  = (int) (-20 + Math.random() * 30);
		       
		            investProfit = (investCollection.get(i).getMarginCoeficient() * investCharge);
		            
		            if (investCollection.get(i).getInvestId() == 1) investCollection.get(i).setRiskManagment(riskRewardEvelCo);
		            if (investCollection.get(i).getInvestId() == 2) investCollection.get(i).setRiskManagment(riskRewardBombsAway);
		            if (investCollection.get(i).getInvestId() == 3) investCollection.get(i).setRiskManagment(riskRewardCWO);
		            if (investCollection.get(i).getInvestId() == 4) investCollection.get(i).setRiskManagment(riskRewardMaroders);
		            if (investCollection.get(i).getInvestId() == 5) investCollection.get(i).setRiskManagment(riskRewardFatcat);
		            if (investCollection.get(i).getInvestId() == 6) investCollection.get(i).setRiskManagment(riskRewardMacrosoft);
		            
		            if (investCollection.get(i).getRiskManagment() < 0) {
		        	       investProfit = investProfit * -1;
		            } else {
		            	investProfit = investProfit * 1;
		            }
		            SetUpPlayers.playerIndex.investProfit((int) investProfit);
		            System.out.println("Вашата печалба / загуба е :" + investProfit);			
				}	
			}	
		}
	}
}
