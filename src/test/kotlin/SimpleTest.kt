import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.lang.Thread.sleep

class SimpleTest {

    @Test
    fun `should pass quickly`() {
    }

    @Test
    fun `should pass slowly`() {
        sleep(10000)
    }

    @Test
    fun `should fail gracefully`() {
        fail<Unit>("Oh noes!")
    }

    @Test
    fun `should fail in unexpected ways`() {
        throw RuntimeException("Don't try this at home!")
    }

    @Test
    @Disabled
    fun `should not be run`() {
        fail<Unit>("Brain the size of a planet, and they ask me to do nothing.")
    }
}
