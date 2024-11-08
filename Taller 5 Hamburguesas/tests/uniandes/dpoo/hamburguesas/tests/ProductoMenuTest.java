package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;



public class ProductoMenuTest {

	private ProductoMenu productoMenu1;
	private ProductoMenu productoMenu2;
	private ProductoMenu productoMenu3;
	private ProductoMenu productoMenu4;
	

    @BeforeEach
    void setUp( ) throws Exception
    {
        productoMenu1 = new ProductoMenu( "corral", 14000);
        productoMenu2 = new ProductoMenu( "corral queso", 16000);
        productoMenu3 = new ProductoMenu( "corral pollo", 15000);
        productoMenu4 = new ProductoMenu( "corralita", 13000);

    }

    @AfterEach
    void tearDown( ) throws Exception
    {
    }

    @Test
    void testGetNombre( )
    {
        assertEquals( "corral", productoMenu1.getNombre( ), "El nombre del producto no es el esperado." );
        assertEquals( "corral queso", productoMenu2.getNombre( ), "El nombre del producto no es el esperado." );
        assertEquals( "corral pollo", productoMenu3.getNombre( ), "El nombre del producto no es el esperado." );
        assertEquals( "corralita", productoMenu4.getNombre( ), "El nombre del producto no es el esperado." );

    }

    @Test
    void testGetPrecio( )
    {
        assertEquals(14000, productoMenu1.getPrecio( ), "El precio del producto no es el esperado." );
        assertEquals(16000, productoMenu2.getPrecio( ), "El precio del producto no es el esperado." );
        assertEquals(15000, productoMenu3.getPrecio( ), "El precio del producto no es el esperado." );
        assertEquals(13000, productoMenu4.getPrecio( ), "El precio del producto no es el esperado." );

    }
    
    @Test
    
    void testGenerarTextoFactura()
    {
    	String texto = productoMenu1.generarTextoFactura();
    	String precio = String.valueOf(productoMenu1.getPrecio());
    	
    	assertTrue(texto.contains(precio) && texto.contains(productoMenu1.getNombre()), "La factura generada no contiene los datos esperados.");

     	
    	
    	
    }
  

}
