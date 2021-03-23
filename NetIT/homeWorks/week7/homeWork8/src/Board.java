
public class Board {

	public static Fields board[][]       = new Fields[4][8];
	public static Fields boardPosition[] = new Fields[20];
	public static Fields trap            = new Fields(" o");
	public static Fields invest          = new Fields(" i");
	public static Fields chance          = new Fields(" c");
	public static Fields steal           = new Fields(" s");
	public static Fields party           = new Fields(" p");
	private static int row;
	private static int col;

	public static void createBoard() {

		Fields base  = new Fields(" .");
		Fields empty = new Fields("  ");
		Fields start = new Fields(" Start");

		for (row = 0; row < board.length; row++) {
			for (col = 0; col < board.length + 4; col++) {
				board[row][col] = base;
			}
		}

		for (row = 1; row < board.length - 1; row++) {
			for (col = 1; col < board.length + 3; col++) {
				board[row][col] = empty;
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

		for (row = 0; row < board.length; row++) {
			for (col = 0; col < board.length + 4; col++) {
				System.out.print(board[row][col].getFieldsName());
			}
			System.out.println("");
		}
	}

}
