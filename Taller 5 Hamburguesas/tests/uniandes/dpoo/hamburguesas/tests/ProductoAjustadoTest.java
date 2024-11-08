package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Ingrediente;
import uniandes.dpoo.hamburguesas.mundo.ProductoAjustado;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ProductoAjustadoTest {
	
	private ProductoAjustado productoAjustado1;
	private ProductoAjustado productoAjustado2;
	private ProductoMenu productoMenu1;
	private ProductoMenu productoMenu2;

    @BeforeEach
    void setUp( ) throws Exception
    {
    	 productoMenu1 = new ProductoMenu( "corral", 14000);
         productoMenu2 = new ProductoMenu( "corral queso", 16000);
         productoAjustado1 = new ProductoAjustado(productoMenu1);
         productoAjustado2 = new ProductoAjustado(productoMenu2);

    }

    @AfterEach
    void tearDown( ) throws Exception
    {
    }

    @Test
    void testGetNombre( )
    {
    	 assertEquals( "corral", productoAjustado1.getNombre( ), "El nombre del producto no es el esperado." );
         assertEquals( "corral queso", productoAjustado2.getNombre( ), "El nombre del producto no es el esperado." );
         
    }

    @Test
    void testGetPrecio( )
    {
        assertEquals(0, productoAjustado1.getPrecio( ), "El precio ajustado del producto no es el esperado." );
        assertEquals(0, productoAjustado2.getPrecio( ), "El precio ajustado del producto no es el esperado." );

    }
	

}
