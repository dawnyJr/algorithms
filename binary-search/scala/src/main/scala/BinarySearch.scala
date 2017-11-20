
  object BinarySearch {

    def binarySearch(n: Int, values: Array[Int]) ={
      def helper(acc: Array[Int], size: Int, start: Int): Int ={
        if (size == 0) -1
        else if(n == acc(size/2)) start + size/2
        else if(n > acc(size/2)) helper(acc drop (size/2+size%2),size - (size/2+size%2), start + (size/2+size%2))
        else helper(acc take (size/2+size%2),size - (size/2+size%2),start)
      }
      helper(values, values.length,0)
    }
  }