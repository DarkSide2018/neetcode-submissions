class Solution:
    def isValid(self, s: str) -> bool:
        chars = list(s)
        stack = []

        for char in chars:
            if char == '[' or char == '{' or char == '(':
                stack.append(char)
            else:
                
                if len(stack) == 0:
                    return False

                top = stack.pop()

                if char == ']' and top != '[':
                    return False
                if char == '}' and top != '{':
                    return False   
                if char == ')' and top != '(':
                    return False

        if len(stack) == 0:
            return True
            
        return False