n = int(input())
nums = list(map(int, input().split()))

# Please write your code here.
# 오름차순
asecnding = sorted(nums)

# 내림차순
desecding = sorted(nums, reverse = True)

print(' '.join(map(str,asecnding)))
print(' '.join(map(str,desecding)))