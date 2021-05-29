import math

def encode_function(string):
    print("original string", string)
    reversed_string = reverse_slicing(string)
    sum = convert_decimal(reversed_string)
    binary = convert_binary(sum)
    reversed_binary = binary.reverse()
    print("Third step convert to original binary by reversing", binary)
    i = len(reversed_binary)
    while i>0:
        substr = reversed_binary[i, i-8]
        print(substr)
        i = i-8

def reverse_slicing(s):
    return s[::-1]

def convert_decimal(reversed_string):
    sum = 0
    power = 0
    for i in reversed_string:
        sum = sum + math.pow(8, power)*int(i)
        power = power+1
    print ("first step convert to decimal no is", math.trunc(sum))
    return(math.trunc(sum))

def convert_binary(sum):
    binary = []
    while (sum!=0):
        rem = int(sum%2)
        binary.append(rem)
        sum = int(sum/2)
    print("Second step convert to binary digit is", binary)
    return(binary)

encode_function("31646541")