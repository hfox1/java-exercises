/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package todo;
import java.util.*;


import org.junit.Test;
import static org.junit.Assert.*;

public class ToDoTest {
    @Test public void testInitializesEmpty() {
        ToDo todo = new ToDo();
        assertEquals("app should have a greeting", new ArrayList<String>(), todo.getTasks());
    }


}