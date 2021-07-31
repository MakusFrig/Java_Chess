import java.util.*;

import javax.swing.*;

import java.awt.*;

public class Piece{
	
	public ArrayList<Integer> Bishop_Offsets(String x, int u) {
		ArrayList<Integer> _Offsets = new ArrayList<Integer>();
		int t = u;
		if (x == "ul") {
			while (t > 8) {
				t -= 9;
				_Offsets.add(t);
			}
		} else if (x == "ur") {

			while (t > 7) {
				t-= 7;
				_Offsets.add(t);
			}

		} else if (x == "dr") {

			while (t < 56) {
				t += 9;
				_Offsets.add(t);
			}
		} else if (x == "dl") {
			while(t < 58) {
				t += 7;
				_Offsets.add(t);
			}
		}

		return _Offsets;

	}

	public ArrayList<Integer> Knight_Offsets(int u) { //u is the starting position

		ArrayList<Integer> _Offsets_Knight = new ArrayList<Integer>();

		if (u - 8 >= 1) {
			_Offsets_Knight.add(u-6);
			_Offsets_Knight.add(u-10);
		}
		if (u - 16 >= 1) {
			_Offsets_Knight.add(u-15);
			_Offsets_Knight.add(u-17);
		}
		if (u + 8 <= 64) {
			_Offsets_Knight.add(u + 6);
			_Offsets_Knight.add(u +10);
		}
		if (u + 16 <= 64) {
			_Offsets_Knight.add(u + 15);
			_Offsets_Knight.add(u + 17);
		}

		return _Offsets_Knight; 

	}

	Piece() {



	}
}
