class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        flag = 1
        n = len(s)
        count = 0
        for i in range(n-1,-1,-1):
            if s[i] == " " and flag == 1:
                continue
            elif s[i] != " ":
                count +=1
                flag = 0
            else:
                break
        return count
