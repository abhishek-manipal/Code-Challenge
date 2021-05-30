import math
import sys

def encode_function(string):
    length = len(string)
    reversed_string = string[::-1]
    sum = convert_decimal(reversed_string)
    binary = convert_binary(sum)
    reversed_binary = binary.reverse()
    converted_list = convert_list(binary)

def convert_decimal(reversed_string):
    sum = 0
    power = 0
    for i in reversed_string:
        sum = sum + math.pow(8, power)*int(i)
        power = power+1
    return(math.trunc(sum))

def convert_binary(sum):
    binary = []
    while (sum!=0):
        rem = int(sum%2)
        binary.append(rem)
        sum = int(sum/2)
    return(binary)

def convert_list(reversed_binary):
    sum = 0
    ctr = 0
    ArrayOfList = []
    for i in range(len(reversed_binary)-1, -1, -1):
        sum = sum + math.pow(2, ctr)*int(reversed_binary[i])
        ctr = ctr+1
        if ctr%8==0:
            ArrayOfList.append(math.trunc(sum))
            sum = 0
            ctr = ctr-8
        elif i==0:
            ArrayOfList.append(math.trunc(sum))
    print(ArrayOfList)
    return ArrayOfList

str1 = "31646541"
str2 = "1163114742311135167021343424004141432061264036716605455350700124251451433665154621070427104557201067171276700627170465777043334607301704736021762632546715076300657713354152655466766041402716542312670131505761476052650004524216161770521652245433114475436547416173670422136456436313334657533062163564254163664432653550166600433332675642447003252221104064117622317044717471253"
encode_function(str1)
#encode_function(str2)



