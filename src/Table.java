import java.util.ArrayList;

public class Table {

	ArrayList<TableEntry> routingTable;
	
	public Table()
	{
		routingTable = new ArrayList<TableEntry>(7);
	}
	
	//Add Entry to Table
	public void addEntry(String destination, String nextHop, int numberHops)
	{
		TableEntry row = new TableEntry(destination, nextHop, numberHops);
		routingTable.add(row);
	}
	
	//Updates Table Entries
	public void updateEntry(String destination, String nextHop, int numberHops)
	{
		for (TableEntry t : routingTable)
		{
			if(destination == t.getDestination())
			{
				t.nextHopRouter = nextHop;
				
				if(numberHops >= 16)
				{
					t.numberOfHops = 16;
				}
				else
				{
					t.numberOfHops = numberHops;
				}
			}
		}
	}
	
	//Get Table
	public ArrayList<TableEntry> getRoutingTable()
	{
		return routingTable;
	}
}
