public class TableEntry {
	
	String destination;
	String nextHopRouter;
	int numberOfHops;
	
	public TableEntry(String dest, String nextHop, int number)
	{
		destination = dest;
		nextHopRouter = nextHop;
		numberOfHops = number;
	}
	
	//Getters and Setters
	public String getDestination()
	{
		return destination;
	}
	
	public String getNextHop()
	{
		return nextHopRouter;
	}
	
	public int getNumberOfHops()
	{
		return numberOfHops;
	}
	
	public void setDestination(String dest)
	{
		destination = dest;
	}
	
	public void setNextHop(String dest)
	{
		nextHopRouter = dest;
	}
	
	public void setNumberOfHops(int hops)
	{
		numberOfHops = hops;
	}
}
