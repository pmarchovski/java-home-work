import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Invest {

	
	public static ArrayList<InvestManagment> investCollection = new ArrayList<>();
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
			
			SetUpPlayers.myFrame.textInfoPlayerPosition.setText(" " + SetUpPlayers.playerIndex.getName() 
					                                   + " попаднахте на поле *** INVEST ***");
		
			displayInvestList();

			if (!Steal.isStealFree && SetUpPlayers.playerIndex.isStealProtected() == true && Steal.choosePlan == 1) {
			
			JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, SetUpPlayers.playerIndex.getName()
					                      + " Получавате награда от злият план");	
			Steal.secondPlan();
		}
			
			JOptionPane.showConfirmDialog(SetUpPlayers.myFrame.panel, SetUpPlayers.playerIndex.getName()
					+ " Имате възможност да инвестирате \n"
					+ "Искате ли да го направите?");
			
					
			int answer = 0;
				
			if (answer == JOptionPane.NO_OPTION) Game.next();;
			if (answer == JOptionPane.YES_OPTION) chooseInvest();
			if (answer == JOptionPane.CANCEL_OPTION) Game.next();;

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
		
		String temp[] = new String[investCollection.size()];
		for (int i = 0; i < investCollection.size(); i++) {
			temp[i] = investCollection.get(i).getInvestName();
		}
		
			String choose = (String)JOptionPane.showInputDialog(SetUpPlayers.myFrame.panel, 
					"Изберете инвестиция", "Инвестиции", 
					JOptionPane.CANCEL_OPTION, null, temp, investCollection.get(0).getInvestName());
			
		for (int i = 0; i < investCollection.size(); i++) {
			if (choose.equals(investCollection.get(i).getInvestName())) {
				
				investCollection.get(i).displayInvest();	
				JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, SetUpPlayers.playerIndex.getName() 
						                   + " избрахте да инвестирате в \n"
					                       + investCollection.get(i).getInvestName() + "\n" 
					                       + "Минималната сума е " + investCollection.get(i).getMinAmount());
				
							
				investCharge = Integer.parseInt(JOptionPane.showInputDialog("Посочете сума която искате да инвестирате"));
				 
				 
				if (SetUpPlayers.playerIndex.getMoney() < investCollection.get(i).getMinAmount()) {
					
					JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, "Нямате достатъчно пари за тази инвестиция", 
							                      "Внимание!!!", JOptionPane.ERROR_MESSAGE);
					
					Game.next();	
				}
				if (investCharge < investCollection.get(i).getMinAmount()) {
					
					JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, "Въвели сте по-малка сума от минималното изискване за тази инвестиция", 
							                     "Внимание!!!", JOptionPane.ERROR_MESSAGE);
					
					chooseInvest();
				} else {
					
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
		            	investProfit = (investProfit * 1) + investCharge;
		            }
		            SetUpPlayers.playerIndex.investProfit((int) investProfit);
		            
		            JOptionPane.showMessageDialog(SetUpPlayers.myFrame.panel, "Вашата печалба / загуба от инвестицията е: \n"
		                                                 + investProfit + " лв.", "Информация", JOptionPane.INFORMATION_MESSAGE);
	
		            
		            SetUpPlayers.myFrame.textInfoMoneyLeft.setText(" " + SetUpPlayers.playerIndex.getName() + " Вие разполaгате с: " 
							+ String.valueOf(SetUpPlayers.playerIndex.getMoney()) + " лв.");
		            
		            SetUpPlayers.myFrame.textInfoInvest.setText("");
				}	
			}	
		}
	}
	
	public static void displayInvestList() {
		String name[] = new String[6];
		for (int i = 0; i < name.length; i++) {	
		name[i] = (" Номер на инвестицията: " 
        + String.valueOf(investCollection.get(i).getInvestId()) + "\n"
        + " Име на инвестицията: " 
        + String.valueOf(investCollection.get(i).getInvestName()) + "\n"
        + " Минимална инвестиция: " 
         + investCollection.get(i).getMinAmount() + "\n"
        + " Коефициент на възвращаемост: "
        + investCollection.get(i).getMarginCoeficient() + "\n"
         + "\n");	
		}
		
		SetUpPlayers.myFrame.textInfoInvestGlobal.setText(name[0] + name[1] + name[2] + name[3] + name[4] + name[5]);
       
	}
     
}
