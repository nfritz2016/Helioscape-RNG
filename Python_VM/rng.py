import random

# function to generate random number along with checking randomness
# to be within acceptable limits
def raj():
    nums = []
    i = 0
    while i < 1000: # randomness for 1000 runs
        nums.append(random.randint(0, 1000000))
        i += 1
    count = 1000
    # back checking random numbers generated
    for i in range(0, 1000):
        for j in range(i, 1000):
            if nums[i] == nums[j] and i != j:
                count -= 1
    return [count, nums] # returning number check and list of numbers

# main function to be called
if __name__ == '__main__':
    value = raj() # function call
    print(value[0], "/1000 unique numbers!") # Output
    print("Random Number: ", value[1][0]) # Output
