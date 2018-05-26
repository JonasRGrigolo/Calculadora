import com.company.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculadoraTeste {
    @Test
    public void testSoma(){
        int valor1 = 1;
        int valor2 = 2;
        int resultado = Calculadora.soma(valor1,valor2);
        assertEquals(3, resultado,0.01);
    }
    @Test
    public void testSubtracao(){
        int valor1 = 2;
        int valor2 = 1;
        int resultado = Calculadora.subtracao(valor1,valor2);
        assertEquals(1, resultado,0.01);
    }
    @Test
    public void testMultiplicacao(){
        int valor1 = 2;
        int valor2 = 2;
        int resultado = Calculadora.multiplicacao(valor1,valor2);
        assertEquals(4, resultado,0.01);
    }
    @Test
    public void testDivisao(){
        int valor1 = 2;
        int valor2 = 2;
        int resultado = Calculadora.divisao(valor1,valor2);
        assertEquals(1, resultado,0.01);
    }
}
