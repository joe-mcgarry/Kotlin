import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FizzBuzzTest {
    @Test
    fun testFizzBuzz() {
        assertEquals("1", fizzBuzz(1))
        assertEquals("Fizz", fizzBuzz(3))
        assertEquals("Buzz", fizzBuzz(5))
    }
}