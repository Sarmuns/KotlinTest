import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class PortariaTest {

    @Test
    fun testMenorIdade() {
        val result = portaria(15, "comum", "xt123")
        assertEquals("Negado.", result)
    }

    @Test
    fun testConviteInvalido() {
        val result = portaria(25, "vip", "xt123")
        assertEquals("Negado.", result)
    }

    @Test
    fun testConviteInvalidoCasoVazio() {
        val result = portaria(30, "", "")
        assertEquals("Negado.", result)
    }

    @Test
    fun testConviteComumValido() {
        val result = portaria(20, "comum", "xt123")
        assertEquals("Welcome.", result)
    }

    @Test
    fun testConvitePremiumValido() {
        val result = portaria(22, "premium", "xl456")
        assertEquals("Welcome.", result)
    }

    @Test
    fun testConviteLuxoValido() {
        val result = portaria(25, "luxo", "xl789")
        assertEquals("Welcome.", result)
    }

    @Test
    fun testConviteInvalidoComCodigo() {
        val result = portaria(18, "comum", "yl123")
        assertEquals("Negado.", result)
    }

    @Test
    fun testConviteInvalidoCasoVazioCodigoValido() {
        val result = portaria(18, "premium", "")
        assertEquals("Negado.", result)
    }

    @Test
    fun testConviteInvalidoCasoVazioCodigoInvalido() {
        val result = portaria(18, "luxo", "")
        assertEquals("Negado.", result)
    }
}
