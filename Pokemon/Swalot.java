public class Swalot extends Pokemon{
	{
		name = "Swalot";
		bHP = 10;
		bAtk = 7;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 8;
		bSpd = 6;
		type1 = "Poison";
		type2 = "";
		abilities = new String[]{"Sticky Hold", "Liquid Ooze", "Gluttony", "Limber", "Big Swallow"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Gulpin();
		prevReq = 25;
		height = "5\'/7\"";
		weight = 176.4;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Omnivore";
		habitats = new String[]{"Grassland", "Marsh", "Urban"};
		overland = 5;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 3;
		underdog = false;
		other = new String[]{"Amorphous","Amorphous","Inflatable","Wallclimber"};
		athl = 3;
		acro = 1;
		combat = 2;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{1, 5, 8, 10, 12, 17, 20, 25, 26, 30, 30, 30, 37, 42, 49, 54, 61};
		moves = new String[]{"Pound", "Yawn", "Poison Gas", "Sludge", "Amnesia", "Acid Spray", "Encore", "Toxic", "Body Slam", "Stockpile", "Swallow", "Spit Up", "Sludge Bomb", "Gastro Acid", "Belch", "Wring Out", "Gunk Shot"};
		TMs = new String[]{"Strength", "Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Ice Beam", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Solar Beam", "Earthquake", "Return", "Shadow Ball", "Double Team", "Sludge", "Sludge Wave", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Explosion", "Giga Impact", "Bulldoze", "Infestation", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Confide"};
		tutorMoves = new String[]{"Block", "Body Slam", "Slam", "Bullet Seed", "Counter", "Defense Curl", "Dynamic Punch", "Fire Punch", "Gastro Acid", "Acid", "Giga Drain", "Gunk Shot", "Ice Punch", "Pain Split", "Rollout", "Seed Bomb", "Shock Wave", "Sleep Talk", "Snatch", "Snore", "Thunder Punch", "Water Pulse", "Wring Out"};
		naturalMoves = new String[]{"Gunk Shot", "Wring Out"};
	}
		Swalot(){

		super();
		}
}