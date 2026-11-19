n = int(input())
nums = list(map(int, input().split()))

# Please write your code here.
# 오름 차순 정렬
nums.sort()

max_val = float('-inf')
size = len(nums)

# 원소의 합이 최소가 되려면?... 젤 큰것과 젤 작은걸 더해야하나?
for i in range(0,len(nums)//2):
    tmp = nums[i] + nums[size-1-i]

    if tmp > max_val:
        max_val = tmp


print(max_val)
