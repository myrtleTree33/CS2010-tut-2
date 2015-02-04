import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author A0108165J
 *
 */
public class TestPostOrderTraversal {

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  /**
   * Test method for {@link BinaryTree#postorderToString()}.
   * @throws IOException 
   */
  @Test
  public void testPostorderToString() throws IOException {
    BufferedReader bR = new BufferedReader(new FileReader("in1.txt"));
    BinaryTree<String> bt = BinaryTree.readBinaryTree(bR);
    System.out.println(bt.postorderToString());
  }

}
