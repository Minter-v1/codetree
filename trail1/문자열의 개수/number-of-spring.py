import sys

lst = []

for string in sys.stdin:
    string = string.strip()

    if (string == '0'):
        print(len(lst))
        
        for string in lst[::2]:
            print(string)

        break

    lst.append(string)
