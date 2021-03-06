# Arrays

## 1 Print Array
Write a method that returns a string of elements in an array, one element per line.

```
Example
1: String [] breakfast = {"Sausage", "Eggs", "Beans",
"Bacon", "Tomatoes", "Mushrooms"};
2:
3: loops.printArray(breakfast)
4: *** Output ***
5: Sausage
6: Eggs
7: Beans
8: Bacon
9: Tomatoes
10: Mushrooms
```

## 2 Last Element of Array
Write a method that returns the last element of a string in an given array

```
Example
1: String [] breakfast = {"Sausage", "Eggs", "Beans",
"Bacon", "Tomatoes", "Mushrooms"}
2:
3: loops.lastElement(breakfast);
4: *** Output ***
5: Mushrooms
```

## 3 Last But One Element of Array
Write a method that returns the last but one element of a string in a given array.

```
Example
1: String [] breakfast = {"Sausage", "Eggs", "Beans",
"Bacon", "Tomatoes", "Mushrooms"}
2:
3: loops.lastButOne(breakfast);
4: *** Output ***
5: Tomatoes

```

## 4 Reverse an Array

Write a method that reverses the elements of an array

```
Example
1: String [] breakfast = {"Sausage", "Eggs", "Beans",
"Bacon", "Tomatoes", "Mushrooms"};
2:
3: loops.reverse(breakfast);
4: *** Output ***
5: : Mushrooms
6: : Tomatoes
7: : Bacon
8: : Beans
9: : Eggs
10: : Sausage
11:
```

## 5 Palindromic Arrays

Write a method that tests to see if an array is palindromic, i.e. the elements are the same when reversed.

```
Example
1: String [] palindromic = {"Sausage", "Eggs", "Beans",
"Beans", "Eggs", "Sausage"};
2: String [] breakfast = {"Sausage", "Eggs", "Beans",
"Bacon", "Tomatoes", "Mushrooms"}
3:
4: loops.isPalindrome(palindromic);
5: loops.isPalindrome(breakfast);
6: *** Output ***
7: True
8: False

```

## 6 Consecutive Duplicates

Write a method to print out an int array with consecutive duplicates eliminated.

```
1: int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
2:
3: loops.compress(nums)
4: *** Output ***
5: : 1
6: : 3
7: : 2
8: : 1
9: : 4
10: 
```

## 7 Pack Duplicates

Pack consecutive duplicates of a char array into Strings.

```
1: char [] letters = {'a' 'a' 'a' 'a' 'b' 'c' 'c' 'a' 'a' 'd'
'e' 'e' 'e' 'e'};
2:
3: loops.pack(nums)
4: *** Output ***
5: : aaaa, b, cc, aa, d, eeee
6:
```

