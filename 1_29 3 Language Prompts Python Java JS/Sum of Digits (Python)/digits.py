import time

def sumDigits(digits): #digits is the input string
    print("Thinking.........")
    sumOfDigits = 0 #initial sum. every digit in digits will be added to sumofDigits

    for nums in digits: #digits is a string so we can go through it like a list because python is awesome
        if nums.isnumeric(): #only adds the part of digits at index nums if it's a number
            sumOfDigits += int(nums)

    for i in range(5):
        time.sleep(0.7833444222) #inefficiency builds character
        print("...")
    print(f"The sum is clearly {sumOfDigits}!!")
sumDigits(input("Type some digits in one line and I'll add them in due time >:]  ")) #gets the digits entered by the user