This project contain a set of algorithms implemented with different programing languages, feel free to contribute even by updating this README

this project is based on the coursera course : Functional Programming Principles in Scala

### Implemented so far :

* Pascal’s Triangle :

The numbers at the edge of the triangle are all 1, and each number inside the triangle is the sum of the two numbers above it.

exemple pascal(0,2)=1 : 
```
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```

#### Scala :
```scala
   def pascal(c: Int, r: Int): Int = {
      if(c == 0 || c == r) 1
      else
        pascal(c-1,r-1) + pascal(c,r-1)
    }
```
#### Python:
```Python
def pascal(r, c):
    if r < 0 or c < 0:
        return 0
    elif r == c:
        return 1
    else:
        return pascal (r-1, c-1) + pascal(r-1, c)
```

* Parentheses Balancing :
Balanced parentheses means that each opening symbol has a corresponding closing symbol and the pairs of parentheses are properly nested. Consider the following correctly balanced strings of parentheses:
```
(()()()())

(((())))
```
Compare those with the following, which are not balanced:
```
((((((())

()))
```
#### Scala :
```scala
  def balance(chars: List[Char]): Boolean = {
      def nestedBalance(count:Int,subChars: List[Char]): Boolean ={
        if(count >= 0 && subChars.nonEmpty)
          if(subChars.head.equals('('))
            nestedBalance(count+1,subChars.tail)
          else if(subChars.head.equals(')'))
            nestedBalance(count-1,subChars.tail)
          else
            nestedBalance(count,subChars.tail)
        else if(count==0)
          true
        else
          false
      }
      nestedBalance(0,chars)
    }
```
* Coin Change problem :
Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins doesn’t matter.

For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4. For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.

#### Scala :
```scala
def countChange(money: Int, coins: List[Int]): Int = {
      if(money == 0) 1
      else if((coins.isEmpty && money > 0) || money < 0) 0
      else countChange(money - coins.head,coins) + countChange(money,coins.tail)
    }
```
