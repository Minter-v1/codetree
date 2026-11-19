word1 = input()
word2 = input()

# Please write your code here.
word1 = list(word1)
word2 = list(word2)

word1.sort()
word2.sort()

ans = "Yes" if word1 == word2 else "No"

print(ans)