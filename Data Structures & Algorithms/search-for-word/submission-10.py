class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        row = len(board)
        col = len(board[0])

        for i in range(row):
            for j in range(col):
                if board[i][j] == word[0] and self.dfs(board,word,i,j,0):
                    return True

        return False
    
    def dfs(self, board, word, row,col, index) -> bool:
        if index == len(word):
            return True
        
        if row < 0 or col < 0 or row>=len(board) or col >= len(board[0]) or board[row][col] != word[index]:
            return False
        
        temp = board[row][col]

        board[row][col] = '#'
        
        found = self.dfs(board,word,row+1,col,index+1) or self.dfs(board,word,row-1,col,index+1) or self.dfs(board,word,row,col+1,index+1) or self.dfs(board,word,row,col-1,index+1)

        board[row][col] = temp

        return found

        
        