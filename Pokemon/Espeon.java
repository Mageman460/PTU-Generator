public class Espeon extends Pokemon{
	{
		name = "Espeon";
		bHP = 7;
		bAtk = 7;
		bDef = 6;
		bSpAtk = 13;
		bSpDef = 10;
		bSpd = 11;
		type1 = "Psychic";
		type2 = "";
		abilities = new String[]{"Synchronize", "Trace", "Telepathy", "Forewarn", "Magic Bounce"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Eevee();
		prevReq = 6;
		height = "2\'/11\"";
		weight = 58.4;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Omnivore";
		habitats = new String[]{"Forest", "Grassland", "Urban"};
		overland = 6;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		underdog = false;
		other = new String[]{"Telepath","Telekinetic","Tracker"};
		athl = 4;
		acro = 3;
		combat = 3;
		stealth = 3;
		percep = 4;
		focus = 5;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 2;
		focusBonus = 3;
		movesLevels = new int[]{5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45};
		moves = new String[]{"Sand Attack", "Confusion", "Quick Attack", "Swift", "Psybeam", "Future Sight", "Psych Up", "Morning Sun", "Psychic", "Last Resort", "Power Swap"};
		TMs = new String[]{"Cut", "Psyshock", "Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Return", "Dig", "Psychic", "Shadow Ball", "Double Team", "Reflect", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Retaliate", "Giga Impact", "Flash", "Psych Up", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Covet", "Heal Bell", "Helping Hand", "Hyper Voice", "Iron Tail", "Last Resort", "Magic Coat", "Magic Room", "Role Play", "Signal Beam", "Skill Swap", "Sleep Talk", "Snore", "Swift", "Telekinesis", "Trick", "Work Up", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Espeon(){

		super();
		}
}