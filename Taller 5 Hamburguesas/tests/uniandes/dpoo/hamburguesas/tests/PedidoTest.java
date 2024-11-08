package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Ingrediente;
import uniandes.dpoo.hamburguesas.mundo.Pedido;

public class PedidoTest {
	
	private Pedido pedido1;

    @BeforeEach
    void setUp( ) throws Exception
    {
        pedido1 = new Pedido("Valentina", "Carrera 57#79-360");
    }

    @AfterEach
    void tearDown( ) throws Exception
    {
    }

    @Test
    void testGetNombreCliente( )
    {
        assertEquals( "Valentina", pedido1.getNombreCliente( ), "El nombre del cliente no es el esperado." );
    }

    @Test
    void testGuardarFactura( ) throws Exception
    {
    	try {
    	//Given
        File archivo = new File("data/pedidos.txt");

    	
    	//When
        
    	pedido1.guardarFactura(archivo);
    	
    	
    	//Then
    	assertTrue(archivo.exists(), "The file should be created.");
    	
    }
    	catch{new Exception(e Exception)
    		
    	}

}
