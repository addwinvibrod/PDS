
object ArrayExample {

  // Function to calculate the sum of an integer array
  def sumArray(arr: Array[Int]): Int = {
    arr.sum
  }

  // Function to concatenate fruit names with commas
  def concatenateFruits(fruits: Array[String]): String = {
    fruits.mkString(", ")
  }

  def main(args: Array[String]): Unit = {

    // Create an integer array
    val numbers = Array(2, 5, 9, 14, 20)

    // Calculate and display the sum
    println("Sum of array elements: " + sumArray(numbers))

    // Create an array of fruit names
    val fruits = Array("Apple", "Banana", "Mango", "Orange", "Grapes")

    // Concatenate and display fruit names
    println("Fruits: " + concatenateFruits(fruits))

    // Iterate through the integer array
    println("Integer array elements:")
    for (num <- numbers) {
      println(num)
    }
  }
}
