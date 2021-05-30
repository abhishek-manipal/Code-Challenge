import math

def ConvertOctalToBinary(str):
    octal = int(str)
    rev = 0
    chk = 0
    while octal!=0:
        rem = octal%10
        if rem>7:
            chk = 1
            break
        rev = rem + (rev*10)
        octal = int(octal/10)

    if chk == 0:
        octal = rev
        binary = ""
        while octal!=0:
            rem = octal%10
            if rem==0:
                binary = binary + "000"
            elif rem==1:
                binary = binary + "001"
            elif rem==2:
                binary = binary + "010"
            elif rem==3:
                binary = binary + "011"
            elif rem==4:
                binary = binary + "100"
            elif rem==5:
                binary = binary + "101"
            elif rem==6:
                binary = binary + "110"
            elif rem==7:
                binary = binary + "111"
            octal = int(octal/10)
        ArrayOfList = ConvertToList(binary)
        ArrayOfList.reverse()
        print("List value :", ArrayOfList)
    else:
        print("Invalid Input!")

def ConvertToList(binary):
    sum = 0
    ctr = 0
    ArrayOfList = []
    for i in range(len(binary)-1, -1, -1):
        sum = sum + math.pow(2, ctr)*int(binary[i])
        ctr = ctr+1
        if ctr%8==0:
            ArrayOfList.append(math.trunc(sum))
            sum = 0
            ctr = ctr-8
        elif i==0:
            ArrayOfList.append(math.trunc(sum))
    return ArrayOfList


str = "31646541"
str2 = "1163114742311135167021343424004141432061264036716605455350700124251451433665154621070427104557201067171276700627170465777043334607301704736021762632546715076300657713354152655466766041402716542312670131505761476052650004524216161770521652245433114475436547416173670422136456436313334657533062163564254163664432653550166600433332675642447003252221104064117622317044717471253"

ConvertOctalToBinary(str)
ConvertOctalToBinary(str2)