import java.util.*;

import javax.swing.*;

import java.awt.*;

public class Check {
	
	public ArrayList<Boolean> in_check (HashMap<String, JButton> hsh) {
		ArrayList<Boolean> _Check = new ArrayList<Boolean>();

		ArrayList<Integer> _Kings = new ArrayList<Integer>();

		Piece _Check_Util = new Piece();

		//This for loop is for finding the two kings
		for (int i = 1; i < hsh.size(); i ++) {
			if (hsh.get(Integer.toString(i)).getIcon().toString().contains("king")) {
				_Kings.add(i);
			}
		}



		_Check.add(false);

		for (int i = 1; i <hsh.size(); i ++) {
			if (hsh.get(Integer.toString(i)).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(i)).getIcon().toString();

				if (file_name.contains("pawn")) {
					ArrayList<Integer> _Possibles = new ArrayList<Integer>();

					_Possibles = _Check_Util.Pawn_Offsets(i, hsh);

					if (_Possibles.contains(_Kings.get(0))) {
						_Check.set(0, true);
					} else if (_Possibles.contains(_Kings.get(0))) {
						_Check.set(0, true);
					}
				} else if (file_name.contains("bishop")) {
					ArrayList<Integer> _Possibles = new ArrayList<Integer>();

					_Possibles = _Check_Util.Bishop_Offsets(i, hsh);

					if (_Possibles.contains(_Kings.get(0))) {
						_Check.set(0, true);
					} else if (_Possibles.contains(_Kings.get(0))) {
						_Check.set(0, true);
					}
				} else if (file_name.contains("knight")) {
					ArrayList<Integer> _Possibles = new ArrayList<Integer>();

					_Possibles = _Check_Util.Knight_Offsets(i, hsh);

					if (_Possibles.contains(_Kings.get(0))) {
						_Check.set(0, true);
					} else if (_Possibles.contains(_Kings.get(0))) {
						_Check.set(0, true);
					}
				} else if (file_name.contains("rook")) {
					ArrayList<Integer> _Possibles = new ArrayList<Integer>();

					_Possibles = _Check_Util.Rook_Offsets(i, hsh);

					if (_Possibles.contains(_Kings.get(0))) {
						_Check.set(0, true);
					} else if (_Possibles.contains(_Kings.get(0))) {
						_Check.set(0, true);
					}
				} else if (file_name.contains("queen")) {
					ArrayList<Integer> _Possibles = new ArrayList<Integer>();

					_Possibles = _Check_Util.Queen_Offsets(i, hsh);

					if (_Possibles.contains(_Kings.get(0))) {
						_Check.set(0, true);
					} else if (_Possibles.contains(_Kings.get(0))) {
						_Check.set(0, true);
					}
				}
			}
		}




		return _Check;
	}
	/*
	public boolean in_check_mate(HashMap<String, JButton> hsh) {
		Piece _Checkmate_Util = new Piece();

		HashMap<String, JButton> _Board_Copy = hsh;

		for (int i = 1; i < hsh.size(); i++) {
			if (hsh.get(Integer.toString(i)).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(i)).getIcon().toString();

				if (file_name.contains("pawn")) {
					ArrayList<Integer> _Possibles = new ArrayList<Integer>();

					_Possibles = _Checkmate_Util.Pawn_Offsets(i, hsh);

					for (int u = 0; u < _Possibles.size(); u ++){
						HashMap<String, JButton> _Board_Copy = hsh;

						
					}


				} else if (file_name.contains("bishop")) {
					ArrayList<Integer> _Possibles = new ArrayList<Integer>();

					_Possibles = _Checkmate_Util.Bishop_Offsets(i, hsh);

				} else if (file_name.contains("knight")) {
					ArrayList<Integer> _Possibles = new ArrayList<Integer>();

					_Possibles = _Checkmate_Util.Knight_Offsets(i, hsh);


				} else if (file_name.contains("rook")) {
					ArrayList<Integer> _Possibles = new ArrayList<Integer>();

					_Possibles = _Checkmate_Util.Rook_Offsets(i, hsh);

	
				} else if (file_name.contains("queen")) {
					ArrayList<Integer> _Possibles = new ArrayList<Integer>();

					_Possibles = _Checkmate_Util.Queen_Offsets(i, hsh);


				}
			}






		}


	}
	*/



	Check() {

	}
}
