#it's morphin time
import random
numList = []
for i in range(random.randint(1,15)):
    numList.append(len(numList) + 1)
numList.pop(random.randint(0,len(numList)-1))
print(numList)

def findMissingNo(brokenList):
    missingNo = 0
    if brokenList == []:
        missingNo = 1
        brokenList = [1]
    elif brokenList[0] != 1:
        # print("A") debug msg
        missingNo = 1
        brokenList.insert(0,missingNo)
    elif len(brokenList) + 1 not in brokenList:
        # print("B") debug msg
        missingNo = len(brokenList) + 1
        brokenList.append(missingNo)
    else:
        # print("C") debug msg
        for nums in range(len(brokenList)):
            if nums != 0:
                if brokenList[nums] != brokenList[nums - 1] + 1:
                    missingNo = brokenList[nums] - 1
                    brokenList.insert(nums,missingNo)
                    break
    print(f"The missing number was {missingNo}.")
    return brokenList

numList = findMissingNo(numList)
print(numList)