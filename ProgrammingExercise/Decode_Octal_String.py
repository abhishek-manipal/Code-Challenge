import math

def function(string):
    print("original string", string)
    length = len (string)
    print("length of string is", length)
    reversed_string = reverse_slicing(string)
    sum = 0
    power = 0
    for i in reversed_string:
        sum = sum + math.pow(8, power)*int(i)
        power = power+1
    print ("first step convert to decimal no is", math.trunc(sum))
    binary = []
    while (sum!=0):
        rem = int(sum%2)
        binary.append(rem)
        sum = int(sum/2)
    print("Second step convert to binary digit is", binary)
    reversed_binary = binary.reverse()
    print("Third step convert to original binary by reversing", binary)
    for i in range(len(binary)):
        print(binary[i])

def reverse_slicing(s):
    return s[::-1]

function("31646541")