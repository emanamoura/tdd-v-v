import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NotaFiscalTest {

    @Test
    public void instanciarNotaFiscal() {
        NotaFiscal notaFiscal = new NotaFiscal("Cliente Teste", 1000.0, 250.0);
        assertEquals(notaFiscal.getClass().getSimpleName(), 'NotaFiscal');
    }

    @Test
    public void testGetNomeCliente() {
        NotaFiscal notaFiscal = new NotaFiscal("Cliente Teste", 1000.0, 250.0);
        assertEquals("Cliente Teste", notaFiscal.getNomeCliente());
    }

    @Test
    public void testGetValor() {
        NotaFiscal notaFiscal = new NotaFiscal("Cliente Teste", 1000.0, 250.0);
        assertEquals(1000.0, notaFiscal.getValor(), 0.01);
    }

    @Test
    public void testGetValorImposto() {
        NotaFiscal notaFiscal = new NotaFiscal("Cliente Teste", 1000.0, 250.0);
        assertEquals(250.0, notaFiscal.getValorImposto(), 0.01);
    }
}