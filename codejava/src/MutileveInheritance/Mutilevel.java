package MutileveInheritance;

public class Mutilevel {

	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.type();
		System.out.println(c);
		RollsRoyce r;
		r=new RollsRoyce();
		r.Brand();
		r.speed();
		System.out.println(r);
		GhostRollsRoyce g;
		g=new GhostRollsRoyce();
		g.speed();
		System.out.println(g);
		
		

	}

}
