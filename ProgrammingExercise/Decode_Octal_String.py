import math

def encode_function(string):
    reversed_string = reverse_slicing(string)
    sum = convert_decimal(reversed_string)
    binary = convert_binary(sum)
    reversed_binary = binary.reverse()
    converted_list = convert_list(binary)
    print("Last step convert to encoded string", converted_list)

def reverse_slicing(string):
    return string[::-1]

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
"""
encode_function("1163114742311135167021343424004141432061264036716605455"+
                 "35070012425145143366515462107042710455720106717127670062"+
                 "71704657770433346073017047360217626325467150763006577133"+
                 "54152655466766041402716542312670131505761476052650004524"+
                 "21616177052165224543311447543654741617367042213645643631"+
                 "33346575330621635642541636644326535501666004333326756424"+
                 "47003252221104064117622317044717471253")

"""