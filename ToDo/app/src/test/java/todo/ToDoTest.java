/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package todo;
import java.util.*;


import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito.*;

public class ToDoTest {
    @Test public void testInitializesEmpty() {
        ToDo toDo = new ToDo();
        assertEquals("initiliazes empty", new ArrayList<String>(), toDo.getTasks());
    }

    @Test public void testAddsTask() {
        ToDo toDo1 = new ToDo();
        toDo1.addTask("feed dog");
        ArrayList<String> result = new ArrayList<>();
        result.add("feed dog");
        assertEquals("arrayL should now include feed dog", result, toDo1.getTasks());
    }

}
