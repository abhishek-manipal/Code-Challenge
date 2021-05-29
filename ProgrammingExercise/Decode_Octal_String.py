import math

def encode_function(string):
    reversed_string = reverse_slicing(string)
    sum = convert_decimal(reversed_string)
    binary = convert_binary(sum)
    reversed_binary = binary.reverse()
    converted_list = convert_list(binary)
    print("Last step convert to encoded string", converted_list)

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

def convert_list(reversed_binary):
    sum = 0
    ctr = 0
    newlist = []
    for i in range(len(reversed_binary)-1, -1, -1):
        sum = sum + math.pow(2, ctr)*int(reversed_binary[i])
        ctr = ctr+1
        if ctr%8==0:
            newlist.append(math.trunc(sum))
            sum = 0
            ctr = ctr-8
        elif i==0:
            newlist.append(math.trunc(sum))
    print(newlist)
    return newlist
encode_function("31646541")