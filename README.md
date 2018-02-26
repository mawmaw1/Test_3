
Equivalence classes

1.

Returns true if number is even, otherwise false
isEven(int n)

| EC         | TC(isEven)         |
|------------|--------------------|
| n % 2 == 0 | even number: 10    |
| n % 2 == 1 | not even number: 7 |

Ligegyldig hvad dit int input er, vil du enten få et lige eller ulige tal, uanset om det er positivt eller negativt, og derfor er der 2 equivalence classes.

2.

Returns true if input variable is between $1000 and $75000

| EC                     | TC                     |
|------------------------|------------------------|
| input < 1000           | not valid input: 750   |
| 1000 <= input <= 75000 | valid input: 65000     |
| input > 75000          | not valid input: 80000 |

3.

public static int getNumDaysinMonth(int month, int year)

| EC               | TC                  |
|------------------|---------------------|
| month < 1        | not valid input -3  |
| 1 <= month <= 12 | valid input: 7      |
| month > 12       | not valid input: 60 |


Boundary value
1.	Der er som sådan ikke boundaries i dette tilfælde, men der kan være en begrænsning i forhold til hvor stort et input en int kan tage.
2.
| Test cases (legal input)             |                    |
|--------------------------------------|--------------------|
| 999 (adjacent partition)             |                    |
| 1000 (min value - close to boundary) |                    |
| 37000 (normal input)                 |                    |
| 75000 (max value                     | close to boundary) |
| 75001 (adjacent partition)           |                    |

3.

| Test cases (legal input)          |                    |
|-----------------------------------|--------------------|
| 0 (adjacent partition)            |                    |
| 1 (min value - close to boundary) |                    |
| 6 (normal input)                  |                    |
| 12 (max value                     | close to boundary) |
| 13 (adjacent partition)           |                    |

Decision tables
1.
| Conditions                      |   |   |   |
|---------------------------------|---|---|---|
| deductible has been made        | T | T | F |
| patient has visited doctor      | T | F | T |
| patient has visited hospital    | F | T | T |
| Actions                         |   |   |   |
| Reimbursement of doctors visit  | T | F | F |
| Reimbursement of hospital visit | F | T | F |

2.

| Conditions                      |   |   |   |   |   |
|---------------------------------|---|---|---|---|---|
| Year is evenly divisible by 4   | T | T | T | T | F |
| Year is evenly disible by 400   | T | F | T | F | F |
| Year is evenly divisible by 100 | T | F | F | T | F |
| Actions                         |   |   |   |   |   |
| Year is a leap year             | T | T | T | F | F |

1.
State diagram:
![alt text](https://github.com/mawmaw1/Test_3/blob/master/img/IMG_2008.JPG)
2.
Test cases:

| Test case ID | Test case description                     | Test data            | expected result                         | actual result                           | status  |
|--------------|-------------------------------------------|----------------------|-----------------------------------------|-----------------------------------------|---------|
| TC1          | Testing add method at index 0             | index: 0, new object | object is placed at index 0             | object is placed at index 0             | success |
| TC2          | Testing remove method                     | add new object       | object that was added, is removed again | object that was added, is removed again | success |
| TC3          | Testing get size method                   | add 4 objects        | size is 4                               | size is 4                               | success |
| TC4          | Testing get method on index out of bounds | index: 4218          | IndexOutOfBoundsException               | IndexOutOfBoundsException               | success |

3. Unit tests: (https://github.com/mawmaw1/Test_3/blob/master/src/MyArrayListWithBugsTest.java)

5 	
In this case, I think a State Table would be more useful. The program does not really contain complex and different states, so I believe a simple table would be more useful for a quick overview in this case.
If the program had more states that were interlinked, I think a state diagram would be of more use.
