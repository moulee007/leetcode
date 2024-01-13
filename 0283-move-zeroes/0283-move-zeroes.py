class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        n = len(nums)
        left = 0
        right = 0
        while(left < n and right < n):
            if nums[left] == 0 and nums[right]!= 0:
                nums[left],nums[right] = nums[right],nums[left]
                left +=1
                right +=1
            elif nums[left] != 0 and nums[right] ==0:
                left +=1
            else:
                right +=1
            
        """
        Do not return anything, modify nums in-place instead.
        """
        