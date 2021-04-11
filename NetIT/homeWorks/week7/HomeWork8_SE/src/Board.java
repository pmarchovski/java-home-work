
public class Board {

	public static Fields board[][]       = new Fields[4][8];
	public static Fields boardPosition[] = new Fields[20];
	public static Fields trap            = new Fields(" TRAP");
	public static Fields invest          = new Fields(" INVEST");
	public static Fields chance          = new Fields(" CHANCE");
	public static Fields steal           = new Fields(" STEAL");
	public static Fields party           = new Fields(" PARTY");
	public static Fields empty           = new Fields("      ");
	public static Fields start           = new Fields(" START");
	public static Fields base            = new Fields(" .");
	public static int row;
	public static int col;
    
	public static void createBoard() {

		
		
		for (row = 0; row < board.length; row++) {
			for (col = 0; col < board.length + 4; col++) {
				board[row][col] = base;
			}
		}
		
		board[3][7] = start;

		board[3][6] = trap;
		board[3][5] = trap;
		board[3][4] = trap;
		board[3][1] = trap;
		board[1][0] = trap;
		board[0][2] = trap;
		board[0][5] = trap;

		board[3][3] = invest;
		board[0][1] = invest;
		board[1][7] = invest;

		board[3][2] = party;
		board[0][3] = party;
		board[0][6] = party;

		board[3][0] = chance;
		board[0][0] = chance;
		board[0][7] = chance;

		board[2][0] = steal;
		board[0][4] = steal;
		board[2][7] = steal;
		
		board[2][6] = empty;
		board[2][5] = empty;
		board[2][4] = empty;
		board[2][3] = empty;
		board[2][2] = empty;
		board[2][1] = empty;
		board[1][6] = empty;
		board[1][5] = empty;
		board[1][4] = empty;
		board[1][3] = empty;
		board[1][2] = empty;
		board[1][1] = empty;
		
		boardPosition[0] = board[3][7];
		boardPosition[1] = board[3][6];
		boardPosition[2] = board[3][5];
		boardPosition[3] = board[3][4];
		boardPosition[4] = board[3][3];
		boardPosition[5] = board[3][2];
		boardPosition[6] = board[3][1];
		boardPosition[7] = board[3][0];
		boardPosition[8] = board[2][0];
		boardPosition[9] = board[1][0];	
		boardPosition[10] = board[0][0];
		boardPosition[11] = board[0][1];
		boardPosition[12] = board[0][2];
		boardPosition[13] = board[0][3];
		boardPosition[14] = board[0][4];
		boardPosition[15] = board[0][5];
		boardPosition[16] = board[0][6];
		boardPosition[17] = board[0][7];
		boardPosition[18] = board[1][7];
		boardPosition[19] = board[2][7];			
		
		displayBoard();
	}
	
	public static void displayBoard() {
		for (row = 0; row < board.length; row++) {
			for (col = 0; col < board.length + 4; col++) {
				System.out.print(board[row][col].getFieldsName());
			}
			System.out.println("");
		}
	}

}
