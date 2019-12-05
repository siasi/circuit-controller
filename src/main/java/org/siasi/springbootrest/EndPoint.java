package org.siasi.springbootrest;

public class EndPoint {
    private String ipAddress;
    private String name;

    public EndPoint(String ipAddress, String name) {
	super();
	this.ipAddress = ipAddress;
	this.name = name;
    }

    public String getIpAddress() {
	return ipAddress;
    }

    public String getName() {
	return name;
    }

    @Override
    public String toString() {
	return "EndPoint [ipAddress=" + ipAddress + ", name=" + name + "]";
    }

}
