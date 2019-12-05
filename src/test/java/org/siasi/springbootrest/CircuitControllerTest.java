package org.siasi.springbootrest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

class CircuitControllerTest {

    @Test
    void shouldReturnACircuit() {
	CircuitController controller = new CircuitController();
	List<Circuit> circuits = controller.getCircuits();
	assertFalse(circuits.isEmpty());

	assertEquals("aCircuit", circuits.get(0).getName());
	assertNotNull(circuits.get(0).getAEndPoint());
	assertNotNull(circuits.get(0).getZEndPoint());
    }

}
