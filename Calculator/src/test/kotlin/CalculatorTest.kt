import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun testMultiply2By2() {
        val calc = Calculator()
        val result = calc.parse("2 * 2")
        assertEquals(4, result)
    }

    @Test
    fun testDivide2By2() {
        val calc = Calculator()
        val result = calc.parse("2 / 2")
        assertEquals(1, result)
    }

    @Test
    fun testAdd2And2() {
        val calc = Calculator()
        val result = calc.parse("2 + 2")
        assertEquals(4, result)
    }

    @Test
    fun testMinus2From6() {
        val calc = Calculator()
        val result = calc.parse("6 - 2")
        assertEquals(4, result)
    }
}