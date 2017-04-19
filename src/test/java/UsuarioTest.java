/**
 * Created by ivanm on 19/04/2017.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    Controlador testControl = new Controlador();

    //test añadir usuario al sistema y verificar el numero de usuarios

    @Test
    public void testAddUserOK(){
        Usuario us = new Usuario();
        us.setName("ivan");
        us.setPassword("password");
        testControl.addUser(us);
        assertTrue(testControl.usuarioHashMap.size() == 1);
    }


    //test añadir objeto asociado a un usuario y
    //verificar numero objetos asociados a ese usuario

    @Test
    public void testAddObjectToUserOK(){
        Usuario us = new Usuario();
        us.setName("ivan");
        us.setPassword("password");
        testControl.addUser(us);

        Objeto ob = new Objeto();
        ob.setNombre("objeto");
        ob.setDescripcion("descripcion");

        testControl.addObject(ob);
        testControl.addObjectToUser(ob,us);
        //testControl.addObject(ob);
       // testControl.addObjectToUser(ob,us);
        assertTrue(us.objectList.size() == 1);
        //assertFalse(testControl.usuarioHashMap.get(us.getName()).getObjectList().size() > 1);
    }
}
