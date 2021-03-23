import java.util.Random;

public class Chance {

	public static void chance() {
		Random random = new Random();
		
		if (Board.boardPosition[SetUpPlayers.playerIndex.getPosition()].getFieldsName().
				equals(Board.chance.getFieldsName())) {
			
			System.out.println("Вие попаднахте на поле *** ШАНС ***");
			
			if (!Steal.isStealFree && SetUpPlayers.playerIndex.isStealProtected() == true && Steal.choosePlan == 0) {
			System.out.println("Получавате награда от злият план");
			Steal.firstPlan();
		}
			
			int chanceIndex = random.nextInt(10);
		if (chanceIndex % 2 == 0) {
			System.out.println("и днес е радостен ден за вас :)");
			
			System.out.println("Получавате бонус " + goodChance() + " лв.");
		} else {
			System.out.println("и изтеглихте късата клечка :(");			
			System.out.println("Губите " + badChance() + " лв.");
		}
		
		}	
	}	
	
	public static int badChance() {
		int badChanceCharge1 = 50;
		int badChanceCharge2 = 100;
		int badChanceCharge3 = 150;
		int badChanceCharge4 = 200;
		int badChanceCharge5 = 250;
		
		Random random = new Random();
		
		int badChanceIndex = random.nextInt(99);
		if (badChanceIndex >= 0 && badChanceIndex <= 39)  {
			SetUpPlayers.playerIndex.chanceCharge(badChanceCharge1);
			return badChanceCharge1;
		}
		if (badChanceIndex >= 40 && badChanceIndex <= 64)  {
			SetUpPlayers.playerIndex.chanceCharge(badChanceCharge2);
			return badChanceCharge2;
		}
		if (badChanceIndex >= 65 && badChanceIndex <= 79)  {
			SetUpPlayers.playerIndex.chanceCharge(badChanceCharge3);
			return badChanceCharge3;
		}
		if (badChanceIndex >= 80 && badChanceIndex <= 94)  {
			SetUpPlayers.playerIndex.chanceCharge(badChanceCharge4);
			return badChanceCharge4;
		}
		if (badChanceIndex >= 95 && badChanceIndex <= 100) {
			SetUpPlayers.playerIndex.chanceCharge(badChanceCharge5);
			return badChanceCharge5;
		}
		
		return 0;
	}
	
	public static int goodChance() {
		int chanceBonus1 = 50;
		int chanceBonus2 = 100;
		int chanceBonus3 = 150;
		int chanceBonus4 = 200;
		int chanceBonus5 = 250;
		
		Random random = new Random();
		int chanceBonusIndex = random.nextInt(99);
		
		if(chanceBonusIndex >= 0 && chanceBonusIndex <= 39)  {
			SetUpPlayers.playerIndex.chanceBonus(chanceBonus1);
			return chanceBonus1;
		}
		if(chanceBonusIndex >= 40 && chanceBonusIndex <= 64)  {
			SetUpPlayers.playerIndex.chanceBonus(chanceBonus2);
			return chanceBonus2;
		}
		if(chanceBonusIndex >= 65 && chanceBonusIndex <= 79)  {
			SetUpPlayers.playerIndex.chanceBonus(chanceBonus3);
			return chanceBonus3;
		}
		if(chanceBonusIndex >= 80 && chanceBonusIndex <= 94)  {
			SetUpPlayers.playerIndex.chanceBonus(chanceBonus4);
			return chanceBonus4;
		}
		if(chanceBonusIndex >= 95 && chanceBonusIndex <= 100)  {
			SetUpPlayers.playerIndex.chanceBonus(chanceBonus5);
			return chanceBonus5;
		}
		
		return 0;
	}
}
