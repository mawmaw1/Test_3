| Test case ID | Test case description                     | Test data            | expected result                         | actual result                           | status  |
|--------------|-------------------------------------------|----------------------|-----------------------------------------|-----------------------------------------|---------|
| TC1          | Testing add method at index 0             | index: 0, new object | object is placed at index 0             | object is placed at index 0             | success |
| TC2          | Testing remove method                     | add new object       | object that was added, is removed again | object that was added, is removed again | success |
| TC3          | Testing get size method                   | add 4 objects        | size is 4                               | size is 4                               | success |
| TC4          | Testing get method on index out of bounds | index: 4218          | IndexOutOfBoundsException               | IndexOutOfBoundsException               | success |
