import org.junit.Assert;
import org.junit.Test;


public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString()
    {
        String class_string = super.getClassString();
        Assert.assertTrue("Not contain the word Hello or hello", class_string.contains("Hello") || class_string.contains("hello"));
    }
}
