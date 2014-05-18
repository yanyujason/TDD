import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SquareTest {

    @Test
    public void shouldReturnArea4() {
        Square square = new Square(2);
        assertEquals(square.area(), 4.0);
    }

    @Test
    public void shouldReturnPerimeter4() {
        Square square = new Square(1);
        assertEquals(square.perimeter(), 4.0);
        assertEquals(1.0, 4.0);
    }
}
