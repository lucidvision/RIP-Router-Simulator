import java.util.ArrayList;

public class Router {

	//Class Variables
	String routerId;
	String network1;
	String network2;
	Table routingTable = new Table();
	Router prev;
	Router next;
	
	public Router(String id)
	{
		routerId = id;
		routingTable = new Table();	
	}
	
	//RIP Algorithm
	public void updateRoutingTable(Table neightbourTable, String type)
	{
		for(TableEntry t : neightbourTable.getRoutingTable())
		{
			Boolean flag = false;
			for(TableEntry r : routingTable.getRoutingTable())
			{
				if(t.getDestination() == r.getDestination())
				{
					flag = true;
					if (r.getDestination() != network1 && r.getDestination() != network2)
					{
						if(t.getNextHop() == r.getNextHop())
						{
							routingTable.updateEntry(t.getDestination(), t.getNextHop(), t.getNumberOfHops()+1);
						}
						else
						{
							if(t.getNumberOfHops()+1 < r.getNumberOfHops())
							{
								routingTable.updateEntry(t.getDestination(), t.getNextHop(), t.getNumberOfHops()+1);
							}
						}
					}
				}
			}
			
			if(flag == false)
			{
				if(type == "prev" && next != null )
				{
					routingTable.addEntry(t.getDestination(), next.getRouterId(), t.getNumberOfHops()+1);
				}
				else if (prev != null)
				{
					routingTable.addEntry(t.getDestination(), prev.getRouterId(), t.getNumberOfHops()+1);
				}
			}
			else
			{
				flag = false;
			}
		}
		
		if(type == "next")
		{
			sendUpdatedTable();
		}
	}
	
	//Sends table to neighbors
	public void sendUpdatedTable()
	{
		if(prev != null)
		{
			prev.updateRoutingTable(this.routingTable, "prev");
		}
		
		if(next != null)
		{
			next.updateRoutingTable(this.routingTable, "next");
		}
		else
		{
			return;
		}
	}
	
	//Getters and Setters
	public void setNetwork1(String net)
	{
		network1 = net;
	}
	
	public void setNetwork2(String net)
	{
		network2 = net;
	}
	
	public void setNextRouter(Router n)
	{
		next = n;
	}
	
	public void setPrevRouter(Router p)
	{
		prev = p;
	}
	
	public Table getRoutingTable()
	{
		return routingTable;
	}
	
	public String getRouterId()
	{
		return routerId;
	}
	
	//Add an entry to routing table
	public void addRoutingTableEntry(String destination, String nextHop, int numberOfHops)
	{
		routingTable.addEntry(destination, nextHop, numberOfHops);
	}
	
	//Prints routing table
	public void printRoutingTable()
	{
		ArrayList<TableEntry> table = routingTable.getRoutingTable();
		
		System.out.println("Destination | Next Hop Router | Number of Hops");
		
		for (TableEntry t : table)
		{
			System.out.println("-------------------------------------------");
			System.out.print(t.getDestination() + " | ");
			System.out.print(t.getNextHop() + " | ");
			System.out.print(t.getNumberOfHops());
			System.out.println("");
		}
		System.out.println("-------------------------------------------");
	}
}
