time = 9999 #change this number to change how many it finds
for i in range(time): 
    prime = 0
    for j in range(i):
        if j != 0 and j != 1:
            if i % j != 0:
                prime += 1
            else: break #Massive performance boost by terminating the loop the moment it finds a factor
    if prime == i-2:
        print (i)