package org.siasi.springbootrest;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitController {

    @RequestMapping("/circuits")
    public List<Circuit> getCircuits() {
	EndPoint aEndPoint = new EndPoint("1.1.1.1", "A");
	EndPoint zEndPoint = new EndPoint("1.1.1.2", "C");
	return Collections.singletonList(new Circuit("aCircuit", aEndPoint, zEndPoint));
    }
}
