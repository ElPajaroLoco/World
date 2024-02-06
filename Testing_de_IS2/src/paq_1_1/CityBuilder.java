package paq_1_1;

import java.util.Random;

public class CityBuilder {
	private int dimX;
	private int dimY;
	private int[][] buildings;
	
	public CityBuilder(int dimX, int dimY) {
		this.dimX = dimX;
		this.dimY = dimY;
		this.buildings = new int[dimX][dimY];
		generateBuildings();
	}
	
	public int[][] generateBuildings() {
		Random rand = new Random();
		for (int i = 0; i < dimX; ++i) {
			for (int j = 0; j < dimY; ++j) {
				buildings[i][j] = rand.nextInt(2); 	// Generates 0 or 1
			}
		}
		return buildings;
	}
	
	public int getDimX() {
		return this.dimX;
	}
	
	public int getDimY() {
		return this.dimY;
	}
}
