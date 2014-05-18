import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void areaShouldBe4() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(rectangle.area(), 2.0);
    }

    @Test
    public void perimeterShouldBe6() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(rectangle.perimeter(), 6.0);
    }

}
