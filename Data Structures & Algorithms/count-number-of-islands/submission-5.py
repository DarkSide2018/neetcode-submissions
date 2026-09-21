class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if len(grid) == 0:
            return 0

        rows = len(grid)
        cols = len(grid[0])
        island_count = 0
        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == '1':
                    island_count += 1
                    self.dfs(grid,i,j)
        return island_count


    def dfs(self, grid: List[List[str]],i,j):
        rows = len(grid)
        cols = len(grid[0])

        if i<0 or i>=rows or j<0 or j>=cols or grid[i][j] == '0':
            return
        
        grid[i][j] = '0'
        
        self.dfs(grid,i-1,j)
        self.dfs(grid,i+1,j)
        self.dfs(grid,i,j-1)
        self.dfs(grid,i,j+1)


