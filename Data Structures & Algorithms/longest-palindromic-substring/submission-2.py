class Solution:
    def expand_around_center(self,left:int, right:int,n:int,s:str)-> int:
        while left >=0 and right < n and s[left] == s[right]:
            left -= 1
            right += 1
        return right - left -1

    def longestPalindrome(self, s: str) -> str:
        if not s:
            return ""

        n = len(s)
        start,max_len = 0,0

        for i in range(n):
            len1 = self.expand_around_center(i,i,n,s)
            len2 = self.expand_around_center(i,i+1,n,s)

            curr_max = max(len1,len2)
            if curr_max>max_len:
                max_len = curr_max
                start = i - (curr_max-1) // 2

        return s[start:start + max_len]

        