import sys

for string in sys.stdin:
    string = string.strip()

    if string == "END":
        break
    
    print(string[::-1])
