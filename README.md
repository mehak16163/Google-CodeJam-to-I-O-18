# Google-CodeJam-to-I-O-18
This repository has my solutions to the CodeJam contest held on 17th February 2018.

## Q1. 
In Question 1. I used the approach to fill in the positions by putting the values given to me in decreasing order in the highest numbered positions to minimise the answer.

## Q2.
In Question 2. I used an O(n) approach, wherein I reduced the total number of people the new ceo will manage by subtracting (experience * no. of people of that level ) from the total. Then I added the number of people of that level to the total. 
This continued for all the levels. 
And in the end the max of (total+1 , exp_of_last_level_) was returned.  
## Q3. 
In Question 3. I again took a linear approach, wherein I used multiple if-else conditions, since we just needed to go till the first point of difference between the three words, and then if required, just the next character only. 
