import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FizzBuzzTest {
    @Test
    fun testFizzBuzz() {
        assertEquals("1", fizzBuzz(1))
        assertEquals("1\n 2", fizzBuzz(2))
    }
}