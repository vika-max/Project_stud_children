import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тесты для ядра предметной области
 */
public class TicketTest {
    /**
     * Тестовый сценарий
     */
    @Test
    public void testScenario1() {
        Ticket ticket = new Ticket();
        ticket.price = 10;
        ticket.amount = 3;
        assertEquals(30, ticket.sum());
    }
}
