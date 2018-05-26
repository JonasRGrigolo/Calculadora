import com.company.ConversorUnidades;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversaoTeste {
    @Test
    public void testConverteTemperatura(){
        int valor1 = 20;
        int resultado = ConversorUnidades.converteCelsiusKelvin(valor1);
        assertEquals(293, resultado,0.01);
    }
    @Test
    public void testConverteKmhParaMetros(){
        double valor1 = 72;
        double resultado = ConversorUnidades.converteKmhparaMetros(valor1);
        assertEquals(20, resultado,0.01);
    }
    @Test
    public void testConverteMetroKm(){
        int valor1 = 70000;
        int resultado = ConversorUnidades.converteMetroparaKm(valor1);
        assertEquals(70, resultado,0.01);
    }
    @Test
    public void testConverteHorasParaMinutos(){
        int valor1 = 65;
        int resultado = ConversorUnidades.converteHorasparaMinutos(valor1);
        assertEquals(3900, resultado,0.01);
    }

}
