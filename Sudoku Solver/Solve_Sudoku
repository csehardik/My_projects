package SUDOKU_SOLVER;

public class SolveSudoku {
	
	
//	https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbVlCX3BIdTRqYmFhMHpqcGZCTGlpZDI2WHpud3xBQ3Jtc0trOFRkNWZYQV9wVk4yYzJIMzRGTUFKR24yblRjV2l3dzFDR1N6TldMVkRQamRrS2kweU5ra0JSTWFzN0puU2JuYVJaNlNRekgwMDRlMGVBbjJfejZINDl1djdfRzBrdHJTd0hTcGI2QlZJRVgwdkpUQQ&q=https%3A%2F%2Fleetcode.com%2Fproblems%2Fsudoku-solver%2F&v=FWAIf_EVUKE

	public boolean isSafe(char[][] board , int row, int col , int number) {
//		row and column condition
		for(int i=0;i<board.length; i++) {
			if(board[i][col]==(char)(number + '0')) {
				return false;
			}
			if(board[row][i]==(char)(number + '0')) {
				return false;
			}
		}
		
//		grid condition
		
		int startingrow = (row/3) * 3;
		int startingcol = (col/3) * 3;
		
		for(int i=startingrow;i<startingrow+3;i++) {
			for(int j=startingcol;j<startingcol+3;j++) {
				if(board[i][j] == (char) (number + '0')) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean helper(char[][] board , int row , int col) {
		
		if(row == board.length) {
			return true;
		}
		int newrow=0;
		int newcol=0;
		if(col != board.length-1) {
			newrow=row;
			newcol=col+1;
		}
		else {
			newrow=row+1;
			newcol=0;
		}
		
		if(board[row][col] != '.') {
			
			if(helper(board,newrow,newcol)) {
				return true;
			}
		}
			else {
				for(int i=1; i<=9; i++) {
					if(isSafe(board,row,col,i)) {
						board[row][col]=(char)(i+'0');
						if(helper(board,newrow,newcol)) {
							return true;
						}
						else {
							board[row][col]='.';
						}
					}
				}
			}
		
		return false;
		
	}
	public void solveSudoku(char[][] board) {
		helper(board,0,0);
	}
}
