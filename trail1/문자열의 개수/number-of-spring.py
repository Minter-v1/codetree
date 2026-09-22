import sys

lst = [0]

for string in sys.stdin:
    string = string.strip()

    if (string == '0'):
        print(len(lst)-1)
        
        for i in range(len(lst)):
            if (i % 2 == 0):
                continue
            print(lst[i])
    else:
        lst.append(string)
