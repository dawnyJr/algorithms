package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    println("Parentheses Balancing")
    println(balance("())(".toList))

    println("Counting Change")
    println("change for 4 with (1,2,3) is : "+countChange(4,List(1,2,3)))

  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0 || c == r) 1
      else
        pascal(c-1,r-1) + pascal(c,r-1)
    }
  
  /**
   * Exercise 2
   */
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
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money == 0)return 1
      if(money < 0)return 0
      if(coins.isEmpty && money > 0)return 0
      countChange(money - coins.head,coins) + countChange(money,coins.tail)
    }

  }
