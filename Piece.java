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
			_Offsets_Knight.add(u - 6);
			_Offsets_Knight.add(u - 10);
		}
		if (u - 16 >= 1) {
			_Offsets_Knight.add(u - 15);
			_Offsets_Knight.add(u - 17);
		}
		if (u + 8 <= 64) {
			_Offsets_Knight.add(u + 6);
			_Offsets_Knight.add(u + 10);
		} 
		if (u + 16 <= 64) {
			_Offsets_Knight.add(u + 15);
			_Offsets_Knight.add(u + 17);
		}

		return _Offsets_Knight; 

	}

	public ArrayList<Integer> Rook_Offsets(int u) {
		ArrayList<Integer> _Offsets_Rook = new ArrayList<Integer>();

		int t = u;
		while (t > 8) {
			t -= 8;
			_Offsets_Rook.add(t);
		}
		t = u;
		while (t < 56) {
			t += 8;
			_Offsets_Rook.add(t);
		}
		t = u;
		while (t > 8) {
			t -= 8;
		}
		int r = 8 - t;
		int l = t - 1;
		t = u;
		while (r > 0) {
			_Offsets_Rook.add(t + r);
			r -= 1;
		} 
		while (l > 0) {
			_Offsets_Rook.add(t - l);
			l -=  1;
		}


		return _Offsets_Rook;
	}
	public ArrayList<Integer> Queen_Offsets(int u) {

		ArrayList<Integer> _Offsets_Queen = new ArrayList<Integer>();

		int t = u;
		while (t > 8) {
			t -= 8;
			_Offsets_Queen.add(t);
		}
		t = u;
		while (t < 56) {
			t += 8;
			_Offsets_Queen.add(t);
		}
		t = u;
		while (t > 8) {
			t -= 8;
		}
		int r = 8 - t;
		int l = t - 1;
		t = u;
		while (r > 0) {
			_Offsets_Queen.add(t + r);
			r -= 1;
		} 
		while (l > 0) {
			_Offsets_Queen.add(t - l);
			l -=  1;
		}
		t = u;
		while (t > 8) {
			t -= 9;
			_Offsets_Queen.add(t);
		}
		t = u;


		while (t > 7) {
			t-= 7;
			_Offsets_Queen.add(t);
		}
		t = u;


		while (t < 56) {
			t += 9;
			_Offsets_Queen.add(t);
		}
		t = u;
		while(t < 58) {
			t += 7;
			_Offsets_Queen.add(t);
		}
		t = u;


		return _Offsets_Queen;
	}

	public ArrayList<Integer> King_Offsets (int u) {
		ArrayList<Integer> Offsets_King = new ArrayList<Integer>();

		Offsets_King.add(u - 1);
		Offsets_King.add(u + 1);
		Offsets_King.add(u + 8);
		Offsets_King.add(u - 8);

		Offsets_King.add(u - 9);
		Offsets_King.add(u + 7);
		Offsets_King.add(u + 9);
		Offsets_King.add(u - 7);

		return Offsets_King;




	}

	Piece() {



	}
}
