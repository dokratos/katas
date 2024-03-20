class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False

        check = x

        i = check % 10
        check = (check - i) / 10
        result = i

        while check > 0:
            j = check % 10
            check = (check - j) / 10
            result = (result * 10) + j

        if int(result) == x:
            return True
        else:
            return False
