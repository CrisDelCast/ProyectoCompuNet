package co.edu.icesi.viajes.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.domain.Usuario;

@SpringBootTest
class TestUsuario {
	
	@Autowired
    private UsuarioService usuario;

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
    void testCrearUsuario(){
		Date fechaInicio = new Date("2021/10/15");
	    Date fechaFin = new Date("2021/10/20");
	    Usuario usuarioCreado = usuario.crearUsuario(1234, "log", "log", "cris", "1234", fechaInicio, fechaFin, "cris", "cris", "A");
	    assertNotNull(usuarioCreado);
	    assertEquals(1234, usuarioCreado.getIdUsua());
	    assertEquals("cris", usuarioCreado.getNombre());
 	}
	
	@Test
	void testModificarUsuario() throws Exception {
		Date fechaModificacion = new Date("2021/10/20");
        Usuario usuarioModificado = usuario.modificarUsuario(1234, "logo", "567", "david", "234", fechaModificacion, "I");
        assertNotNull(usuarioModificado);
        assertEquals("logo", usuarioModificado.getLogin());
        assertEquals("david", usuarioModificado.getNombre());
	}
	
	@Test
	void testEliminarUsuario() throws Exception {
		 usuario.deleteById(1234);
	        assertNull(usuario.consultarUsuarioPorId(1234));
		
		
	}
	
	
	

}
