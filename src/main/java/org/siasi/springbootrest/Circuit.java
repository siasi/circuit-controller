package org.siasi.springbootrest;

public class Circuit {

    private String name;
    private EndPoint aEndPoint, zEndPoint;

    public Circuit(String name, EndPoint aEndPoint, EndPoint zEndPoint) {
	super();
	this.name = name;
	this.aEndPoint = aEndPoint;
	this.zEndPoint = zEndPoint;
    }

    public String getName() {
	return name;
    }

    public EndPoint getAEndPoint() {
	return aEndPoint;
    }

    public EndPoint getZEndPoint() {
	return zEndPoint;
    }

    @Override
    public String toString() {
	return "Circuit [name=" + name + ", aEndPoint=" + aEndPoint + ", zEndPoint=" + zEndPoint + "]";
    }

}
