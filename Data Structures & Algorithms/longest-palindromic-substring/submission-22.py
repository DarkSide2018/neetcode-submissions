class Solution:
    def expand_around_center(self,start:int,end:int,n:int,s:str):
        while start>=0 and end<n and s[start] == s[end]:
            start -=1
            end +=1
        return end-start-1


    def longestPalindrome(self, s: str) -> str:
        n = len(s)

        if n == 1:
            return s

        start,max_len = 0,0

        for i in range(n):
            len1 = self.expand_around_center(i,i,n,s)
            len2 = self.expand_around_center(i,i+1,n,s)
            
            curr_max = max(len1,len2)

            if curr_max>max_len:
                max_len = curr_max
                start = i - (curr_max-1) // 2
        return s[start:start+max_len]
        


        