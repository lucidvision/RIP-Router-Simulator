//Assignment 1 - Part 2 and Part 3
//This assignment was coded in the Eclipse IDE

public class Main {

	public static void main(String[] args) {
		
		//Create the six routers
		Router router1 = new Router("R1");
		Router router2 = new Router("R2");
		Router router3 = new Router("R3");
		Router router4 = new Router("R4");
		Router router5 = new Router("R5");
		Router router6 = new Router("R6");
		
		//Link routers to network
		router1.setNetwork1("N1");
		router1.setNetwork2("N2");
		
		router2.setNetwork1("N2");
		router2.setNetwork2("N3");
		
		router3.setNetwork1("N3");
		router3.setNetwork2("N4");
		
		router4.setNetwork1("N4");
		router4.setNetwork2("N5");
		
		router5.setNetwork1("N5");
		router5.setNetwork2("N6");
	
		router6.setNetwork1("N6");
		router6.setNetwork2("N7");
		
		
		//Link Routers together
		router1.prev = null;
		router1.next = router2;
		
		router2.prev = router1;
		router2.next = router3;
		
		router3.prev = router2;
		router3.next = router4;
		
		router4.prev = router3;
		router4.next = router5;
		
		router5.prev = router4;
		router5.next = router6;
		
		router6.prev = router5;
		router6.next = null;
		
		//Add starting entries to Router routing tables
		router1.addRoutingTableEntry("N1", "R1", 1);
		router1.addRoutingTableEntry("N2", "R1", 1);
		
		router2.addRoutingTableEntry("N2", "R2", 1);
		router2.addRoutingTableEntry("N3", "R2", 1);
		
		router3.addRoutingTableEntry("N3", "R3", 1);
		router3.addRoutingTableEntry("N4", "R3", 1);

		router4.addRoutingTableEntry("N4", "R4", 1);
		router4.addRoutingTableEntry("N5", "R4", 1);

		router5.addRoutingTableEntry("N5", "R5", 1);
		router5.addRoutingTableEntry("N6", "R5", 1);

		router6.addRoutingTableEntry("N6", "R6", 1);
		router6.addRoutingTableEntry("N7", "R6", 1);
		
		//Assignment 3 - Part 2
		System.out.println("********************************");
		System.out.println("Part 2 - RIP Algorithm");
		System.out.println("********************************\n");
		
		//ROUND 1: Begin the RIP algorithm starting from router 1
		System.out.println("Beginning RIP ROUND 1........\n");
		router1.sendUpdatedTable();
		
		//Print current routing table for each router
		System.out.println("********RESULTS OF RIP ROUND 1 ********\n");
		
		System.out.println("Router1 ===================\n");
		router1.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router2 ===================\n");
		router2.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router3 ===================\n");
		router3.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router4 ===================\n");
		router4.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router5 ===================\n");
		router5.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router6 ===================\n");
		router6.printRoutingTable();
		System.out.println("\n");
		
		//ROUND 2: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 2........\n");
		
		//Print current routing table for each router
		System.out.println("********RESULTS OF RIP ROUND 2 ********\n");
		
		System.out.println("Router1 ===================\n");
		router1.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router2 ===================\n");
		router2.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router3 ===================\n");
		router3.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router4 ===================\n");
		router4.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router5 ===================\n");
		router5.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router6 ===================\n");
		router6.printRoutingTable();
		System.out.println("\n");
		
		//ROUND 3: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 3........\n");
		
		//Print current routing table for each router
		System.out.println("********RESULTS OF RIP ROUND 3 ********\n");
		
		System.out.println("Router1 ===================\n");
		router1.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router2 ===================\n");
		router2.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router3 ===================\n");
		router3.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router4 ===================\n");
		router4.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router5 ===================\n");
		router5.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router6 ===================\n");
		router6.printRoutingTable();
		System.out.println("\n");
		
		//ROUND 4: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 4........\n");
		
		//Print current routing table for each router
		System.out.println("********RESULTS OF RIP ROUND 4 ********\n");
		
		System.out.println("Router1 ===================\n");
		router1.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router2 ===================\n");
		router2.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router3 ===================\n");
		router3.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router4 ===================\n");
		router4.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router5 ===================\n");
		router5.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router6 ===================\n");
		router6.printRoutingTable();
		System.out.println("\n");
		
		//ROUND 5: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 5........\n");
		
		//Print current routing table for each router
		System.out.println("********RESULT OF CONVERGENCE ********\n");
		
		System.out.println("Router1 ===================\n");
		router1.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router2 ===================\n");
		router2.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router3 ===================\n");
		router3.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router4 ===================\n");
		router4.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router5 ===================\n");
		router5.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router6 ===================\n");
		router6.printRoutingTable();
		System.out.println("\n");
		
		//Assignment 3 - Part 3
		System.out.println("********************************");
		System.out.println("Part 3 - RIP Instability");
		System.out.println("********************************\n");
		
		//Make N1 unreachable
		System.out.println("First, make N1 unreachable.....");
		router1.network1 = "*";
		router1.getRoutingTable().updateEntry("N1", "R1", 16);
		System.out.println("\n");
		
		//ROUND 1: Begin the RIP algorithm starting from router 2
		System.out.println("Beginning RIP ROUND 1 starting from router 2........");
		router2.sendUpdatedTable();
		
		System.out.println("\n");
		
		//ROUND 2: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 2........");
		
		System.out.println("\n");
		
		//ROUND 3: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 3........");
		
		System.out.println("\n");
		
		//ROUND 4: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 4........");
		
		System.out.println("\n");
		
		//ROUND 5: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 5........");
		
		System.out.println("\n");
		
		//ROUND 6: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 6........");

		System.out.println("\n");
		
		//ROUND 7: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 7........");

		System.out.println("\n");
		
		//ROUND 8: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 8........");
		
		System.out.println("\n");
		
		//ROUND 9: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 9........");
		
		System.out.println("\n");
		
		//ROUND 10: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 10........");
		
		System.out.println("\n");
		
		//ROUND 11: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 11........");
		
		System.out.println("\n");
		
		//ROUND 12: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 12........");
		
		System.out.println("\n");
		
		//ROUND 13: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 13........");
		
		System.out.println("\n");
		
		//ROUND 14: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 14........");
		
		System.out.println("\n");
		
		//ROUND 15: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 15........");
		
		System.out.println("\n");
		
		//ROUND 16: Begin the RIP algorithm starting from router 1
		router1.sendUpdatedTable();
		System.out.println("Beginning RIP ROUND 16........");
		
		System.out.println("\n");

		//Print current routing table for each router
		System.out.println("********RESULTS OF CONVERGENCE********\n");
		
		System.out.println("Router1 ===================\n");
		router1.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router2 ===================\n");
		router2.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router3 ===================\n");
		router3.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router4 ===================\n");
		router4.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router5 ===================\n");
		router5.printRoutingTable();
		System.out.println("\n");
		System.out.println("Router6 ===================\n");
		router6.printRoutingTable();
		System.out.println("\n");
		
		
	}
}
