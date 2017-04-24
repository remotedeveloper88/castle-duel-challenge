package br.game.castleduel.unit;

import static br.game.castleduel.unit.UnitConsts.*;

public class UnitManager {
	private static Unit[] UNIT_ARRAY = new Unit[] {
		// 0 melee
		// 000x11 0000x111 00x2 000x4
		new Unit(SKELETON_TYPE, 3, 10, 3), 
		// 1 ranged
		// 11x00 111x000 111x4
		new Unit(1, 4, 7, 2, 220),
		// 2 tank
		// x0 x1 x4 x11 22x3 222x44
		new Unit(2, 5, 30, 3),

		// 3 melee
		// x0 x1 x2 x00 x11 x4 33x44
		new Unit(3, 10, 21, 10),
		// 4 ranged
		// x000000 x111111 44x222222 44x333333 4444x55
		new Unit(4, 17, 14, 3, 350, Unit.ATTACK_TYPE_HIT_ALL),
		// 5 tank
		// x3 x4 x44 55x44
		new Unit(5, 17, 100, 4),
	};
	
	public static Unit createUnit(int unitIndex, int playerIndex) {
		Unit unit = new Unit(UNIT_ARRAY[unitIndex]);
		unit.setPlayerIndex(playerIndex);
		return unit;
	}
	
	public static boolean canBuyUnit(int index, int gold) {
		return isValidIndex(index) && gold >= getCost(index);
	}
	
	public static int getCost(int index) {
		return UNIT_ARRAY[index].gold;
	}
	
	protected static boolean isValidIndex(int index) {
		return index >= 0 && index < UNIT_ARRAY.length;
	}
}
