import math
import sys

str = "31646541"
str2 = "1163114742311135167021343424004141432061264036716605455350700124251451433665154621070427104557201067171276700627170465777043334607301704736021762632546715076300657713354152655466766041402716542312670131505761476052650004524216161770521652245433114475436547416173670422136456436313334657533062163564254163664432653550166600433332675642447003252221104064117622317044717471253"
octnum=int(str2)

rev = 0
chk = 0

while octnum!=0:
    rem = octnum%10
    if rem>7:
        chk = 1
        break
    rev = rem + (rev*10)
    octnum = int(octnum/10)

if chk == 0:
    octnum = rev
    binnum = ""

    while octnum!=0:
        rem = octnum%10
        if rem==0:
            binnum = binnum + "000"
        elif rem==1:
            binnum = binnum + "001"
        elif rem==2:
            binnum = binnum + "010"
        elif rem==3:
            binnum = binnum + "011"
        elif rem==4:
            binnum = binnum + "100"
        elif rem==5:
            binnum = binnum + "101"
        elif rem==6:
            binnum = binnum + "110"
        elif rem==7:
            binnum = binnum + "111"
        octnum = int(octnum/10)

    print("\nEquivalent Binary Value = ", binnum)
    sum = 0
    ctr = 0
    ArrayOfList = []
    length = len(binnum)
    for i in range(len(binnum)-1, -1, -1):
        sum = sum + math.pow(2, ctr)*int(binnum[i])
        ctr = ctr+1
        if ctr%8==0:
            ArrayOfList.append(math.trunc(sum))
            sum = 0
            ctr = ctr-8
        elif i==0:
            ArrayOfList.append(math.trunc(sum))
    ArrayOfList.reverse()
    print(ArrayOfList)

else:
    print("\nInvalid Input!")
