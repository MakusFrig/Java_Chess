import java.util.*;

import javax.swing.*;

import java.awt.*;

public class Piece{

	public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        // Arraylist for storing reversed elements
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
 
            // Append the elements in reverse order
            revArrayList.add(alist.get(i));
        }
 
        // Return the reversed arraylist
        return revArrayList;
    }
	
	public ArrayList<Integer> Bishop_Offsets(int u, HashMap<String, JButton> hsh) {
		ArrayList<Integer> _Offsets = new ArrayList<Integer>();

		ArrayList<Integer> _Offsets_TL = new ArrayList<Integer>();

		ArrayList<Integer> _Offsets_TR = new ArrayList<Integer>();

		ArrayList<Integer> _Offsets_BL = new ArrayList<Integer>();

		ArrayList<Integer> _Offsets_BR = new ArrayList<Integer>();

		int t = u;

		while (t > 8) {
			t -= 9;
			_Offsets_TL.add(t);
		}
		ArrayList<Integer> _Temporary = new ArrayList<Integer>();

		System.out.print(_Offsets_TL);
		if (_Offsets_TL.size() != 0) {
			for (int tick = 0; tick < _Offsets_TL.size(); tick ++) {
				if (hsh.get(Integer.toString(_Offsets_TL.get(tick))).getIcon().toString() != "a/blank.png") {


					String file_name = hsh.get(Integer.toString(u)).getIcon().toString();
					System.out.println(file_name.contains("1"));
					System.out.println(!hsh.get(Integer.toString(_Offsets_TL.get(tick))).getIcon().toString().contains("1"));

					/*
					The reason for the next if statements is because we want the pieces to able to take one another, but
					not the ones behind them

					This way if the piece that is in front of them is in another colour they will be able to take it, hence
					it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
					*/


					if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Offsets_TL.get(tick))).getIcon().toString().contains("1"))) {
						_Temporary.add(_Offsets_TL.get(tick));
					} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Offsets_TL.get(tick))).getIcon().toString().contains("1"))) {
						_Temporary.add(_Offsets_TL.get(tick));
					}



					break;
				} else {
					_Temporary.add(_Offsets_TL.get(tick));
				}
			}
		}
		_Offsets_TL = _Temporary;		


		t = u;


		while (t > 7) {
			t-= 7;
			_Offsets_TR.add(t);
		}
		_Temporary = new ArrayList<Integer>();
		if (_Offsets_TR.size() != 0) {
			for (int tick = 0; tick < _Offsets_TR.size(); tick ++) {
				if (hsh.get(Integer.toString(_Offsets_TR.get(tick))).getIcon().toString() != "a/blank.png") {


					String file_name = hsh.get(Integer.toString(u)).getIcon().toString();
					System.out.println(file_name.contains("1"));
					System.out.println(!hsh.get(Integer.toString(_Offsets_TR.get(tick))).getIcon().toString().contains("1"));

					/*
					The reason for the next if statements is because we want the pieces to able to take one another, but
					not the ones behind them

					This way if the piece that is in front of them is in another colour they will be able to take it, hence
					it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
					*/


					if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Offsets_TR.get(tick))).getIcon().toString().contains("1"))) {
						_Temporary.add(_Offsets_TR.get(tick));
					} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Offsets_TR.get(tick))).getIcon().toString().contains("1"))) {
						_Temporary.add(_Offsets_TR.get(tick));
					}



					break;
				} else {
					_Temporary.add(_Offsets_TR.get(tick));
				}
			}
		}
		_Offsets_TR = _Temporary;	

		t = u;


		while (t < 56) {
			t += 9;
			_Offsets_BL.add(t);
		}
		_Temporary = new ArrayList<Integer>();
		if (_Offsets_BL.size() != 0) {
			for (int tick = 0; tick < _Offsets_BL.size(); tick ++) {
				if (hsh.get(Integer.toString(_Offsets_BL.get(tick))).getIcon().toString() != "a/blank.png") {


					String file_name = hsh.get(Integer.toString(u)).getIcon().toString();
					System.out.println(file_name.contains("1"));
					System.out.println(!hsh.get(Integer.toString(_Offsets_BL.get(tick))).getIcon().toString().contains("1"));

					/*
					The reason for the next if statements is because we want the pieces to able to take one another, but
					not the ones behind them

					This way if the piece that is in front of them is in another colour they will be able to take it, hence
					it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
					*/


					if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Offsets_BL.get(tick))).getIcon().toString().contains("1"))) {
						_Temporary.add(_Offsets_BL.get(tick));
					} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Offsets_BL.get(tick))).getIcon().toString().contains("1"))) {
						_Temporary.add(_Offsets_BL.get(tick));
					}



					break;
				} else {
					_Temporary.add(_Offsets_BL.get(tick));
				}
			}
		}
		_Offsets_BL = _Temporary;
		t = u;
		while(t < 58) {
			t += 7;
			_Offsets_BR.add(t);
		}
		_Temporary = new ArrayList<Integer>();
		if (_Offsets_BR.size() != 0) {
			for (int tick = 0; tick < _Offsets_BR.size(); tick ++) {
				if (hsh.get(Integer.toString(_Offsets_BR.get(tick))).getIcon().toString() != "a/blank.png") {


					String file_name = hsh.get(Integer.toString(u)).getIcon().toString();
					System.out.println(file_name.contains("1"));
					System.out.println(!hsh.get(Integer.toString(_Offsets_BR.get(tick))).getIcon().toString().contains("1"));

					/*
					The reason for the next if statements is because we want the pieces to able to take one another, but
					not the ones behind them

					This way if the piece that is in front of them is in another colour they will be able to take it, hence
					it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
					*/


					if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Offsets_BR.get(tick))).getIcon().toString().contains("1"))) {
						_Temporary.add(_Offsets_BR.get(tick));
					} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Offsets_BR.get(tick))).getIcon().toString().contains("1"))) {
						_Temporary.add(_Offsets_BR.get(tick));
					}



					break;
				} else {
					_Temporary.add(_Offsets_BR.get(tick));
				}
			}
		}
		_Offsets_BR = _Temporary;



		for (int i = 0; i < _Offsets_TL.size(); i ++) {
			_Offsets.add(_Offsets_TL.get(i));
		}
		for (int i = 0; i < _Offsets_TR.size(); i ++) {
			_Offsets.add(_Offsets_TR.get(i));
		}
		for (int i = 0; i < _Offsets_BL.size(); i ++) {
			_Offsets.add(_Offsets_BL.get(i));
		}
		for (int i = 0; i < _Offsets_BR.size(); i++) {
			_Offsets.add(_Offsets_BR.get(i));
		}


		return _Offsets;

	}

	public ArrayList<Integer> Knight_Offsets(int u, HashMap<String, JButton> hsh) { //u is the starting position

		ArrayList<Integer> _Offsets_Knight = new ArrayList<Integer>();

		String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

		if (u - 8 >= 1) {
			if (hsh.get(Integer.toString(u-6)).getIcon().toString() == "a/blank.png") {
				_Offsets_Knight.add(u-6);
			} else {
				if ((file_name.contains("1"))&& (!hsh.get(Integer.toString(u-6)).getIcon().toString().contains("1")) ) {
					_Offsets_Knight.add(u - 6);
				} else if (!(file_name.contains("1"))&& (hsh.get(Integer.toString(u-6)).getIcon().toString().contains("1"))) {
					_Offsets_Knight.add(u - 6);
				}
			}
			if (hsh.get(Integer.toString(u-10)).getIcon().toString() == "a/blank.png") {
				_Offsets_Knight.add(u-10);
			} else {
				if ((file_name.contains("1"))&& (!hsh.get(Integer.toString(u-10)).getIcon().toString().contains("1")) ) {
					_Offsets_Knight.add(u - 10);
				} else if (!(file_name.contains("1"))&& (hsh.get(Integer.toString(u-10)).getIcon().toString().contains("1"))) {
					_Offsets_Knight.add(u - 10);
				}
			}
			
		}
		if (u - 16 >= 1) {
			if (hsh.get(Integer.toString(u-15)).getIcon().toString() == "a/blank.png") {
				_Offsets_Knight.add(u-15);
			} else {
				if ((file_name.contains("1"))&& (!hsh.get(Integer.toString(u-15)).getIcon().toString().contains("1")) ) {
					_Offsets_Knight.add(u - 15);
				} else if (!(file_name.contains("1"))&& (hsh.get(Integer.toString(u-15)).getIcon().toString().contains("1"))) {
					_Offsets_Knight.add(u - 15);
				}
			}
			if (hsh.get(Integer.toString(u-17)).getIcon().toString() == "a/blank.png") {
				_Offsets_Knight.add(u-17);
			} else {
				if ((file_name.contains("1"))&& (!hsh.get(Integer.toString(u-17)).getIcon().toString().contains("1")) ) {
					_Offsets_Knight.add(u - 17);
				} else if (!(file_name.contains("1"))&& (hsh.get(Integer.toString(u-17)).getIcon().toString().contains("1"))) {
					_Offsets_Knight.add(u - 17);
				}
			}
		}
		if (u + 8 <= 64) {
			if (hsh.get(Integer.toString(u+6)).getIcon().toString() == "a/blank.png") {
				_Offsets_Knight.add(u+6);
			} else {
				if ((file_name.contains("1"))&& (!hsh.get(Integer.toString(u+6)).getIcon().toString().contains("1")) ) {
					_Offsets_Knight.add(u + 6);
				} else if (!(file_name.contains("1"))&& (hsh.get(Integer.toString(u+6)).getIcon().toString().contains("1"))) {
					_Offsets_Knight.add(u + 6);
				}
			}
			if (hsh.get(Integer.toString(u+10)).getIcon().toString() == "a/blank.png") {
				_Offsets_Knight.add(u+10);
			} else {
				if ((file_name.contains("1"))&& (!hsh.get(Integer.toString(u+ 10)).getIcon().toString().contains("1")) ) {
					_Offsets_Knight.add(u + 10);
				} else if (!(file_name.contains("1"))&& (hsh.get(Integer.toString(u+ 10)).getIcon().toString().contains("1"))) {
					_Offsets_Knight.add(u + 10);
				}
			}
		} 
		if (u + 16 <= 64) {
			if (hsh.get(Integer.toString(u+15)).getIcon().toString() == "a/blank.png") {
				_Offsets_Knight.add(u+15);
			} else {
				if ((file_name.contains("1"))&& (!hsh.get(Integer.toString(u + 15)).getIcon().toString().contains("1")) ) {
					_Offsets_Knight.add(u + 15);
				} else if (!(file_name.contains("1"))&& (hsh.get(Integer.toString(u + 15)).getIcon().toString().contains("1"))) {
					_Offsets_Knight.add(u + 15);
				}
			}
			if (hsh.get(Integer.toString(u+17)).getIcon().toString() == "a/blank.png") {
				_Offsets_Knight.add(u+17);
			} else {
				if ((file_name.contains("1"))&& (!hsh.get(Integer.toString(u + 17)).getIcon().toString().contains("1")) ) {
					_Offsets_Knight.add(u + 17);
				} else if (!(file_name.contains("1"))&& (hsh.get(Integer.toString(u + 17)).getIcon().toString().contains("1"))) {
					_Offsets_Knight.add(u + 17);
				}
			}
		}

		return _Offsets_Knight; 

	}

	public ArrayList<Integer> Rook_Offsets(int u, HashMap<String, JButton> hsh) {
		ArrayList<Integer> _Offsets_Rook = new ArrayList<Integer>();

		ArrayList<Integer> _Up_Offsets = new ArrayList<Integer>();

		ArrayList<Integer> _Down_Offsets = new ArrayList<Integer>();

		ArrayList<Integer> _Left_Offsets = new ArrayList<Integer>();

		ArrayList<Integer> _Right_Offsets = new ArrayList<Integer>();

		int t = u;

		while (t > 8) {
			t -= 8;
			_Down_Offsets.add(t);
		}
		ArrayList<Integer> _Temporary = new ArrayList<Integer>();

		
		for (int tick = 0; tick < _Down_Offsets.size(); tick ++) {
			if (hsh.get(Integer.toString(_Down_Offsets.get(tick))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Down_Offsets.get(tick))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Down_Offsets.get(tick));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Down_Offsets.get(tick))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Down_Offsets.get(tick));
				}

				break;
			} else {
				_Temporary.add(_Down_Offsets.get(tick));
			}
		}
		_Down_Offsets = _Temporary;



		t = u;
		while (t < 56) {
			t += 8;
			_Up_Offsets.add(t);
		}
		_Temporary = new ArrayList<Integer>();

		for (int tick = 0; tick < _Up_Offsets.size(); tick ++) {
			if (hsh.get(Integer.toString(_Up_Offsets.get(tick))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Up_Offsets.get(tick))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Up_Offsets.get(tick));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Up_Offsets.get(tick))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Up_Offsets.get(tick));
				}
				break;
			} else {
				_Temporary.add(_Up_Offsets.get(tick));
			}
		}
		_Up_Offsets = _Temporary;
		
		
		

		t = u;
		while (t > 8) {
			t -= 8;
		}
		int r = 8 - t;
		int l = t - 1;
		t = u;


		_Temporary = new ArrayList<Integer>();

		while (r > 0) {
			_Right_Offsets.add(t + r);
			r -= 1;
		} 
		_Right_Offsets = reverseArrayList(_Right_Offsets);
		for (int i = 0; i < _Right_Offsets.size(); i++) {
			if (hsh.get(Integer.toString(_Right_Offsets.get(i))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Right_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Right_Offsets.get(i));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Right_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Right_Offsets.get(i));
				}
				break;
			} else {
				_Temporary.add(_Right_Offsets.get(i));
			}
		}
		_Right_Offsets = _Temporary;



		_Temporary = new ArrayList<Integer>();
		while (l > 0) {
			_Left_Offsets.add(t - l);
			l -=  1;
		}
		_Left_Offsets = reverseArrayList(_Left_Offsets);


		for (int i = 0; i < _Left_Offsets.size(); i++) {
			if (hsh.get(Integer.toString(_Left_Offsets.get(i))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Left_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Left_Offsets.get(i));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Left_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Left_Offsets.get(i));
				}
				break;
			} else {
				_Temporary.add(_Left_Offsets.get(i));
			}
		}
		_Left_Offsets = _Temporary;



		for (int i = 0; i < _Up_Offsets.size(); i ++) {
			_Offsets_Rook.add(_Up_Offsets.get(i));
		}
		for (int i = 0; i < _Down_Offsets.size(); i ++) {
			_Offsets_Rook.add(_Down_Offsets.get(i));
		}
		for (int i = 0; i < _Right_Offsets.size(); i ++) {
			_Offsets_Rook.add(_Right_Offsets.get(i));
		}
		for (int i = 0; i < _Left_Offsets.size(); i ++) {
			_Offsets_Rook.add(_Left_Offsets.get(i));
		}


		return _Offsets_Rook;

	}
	public ArrayList<Integer> Queen_Offsets(int u, HashMap<String, JButton> hsh) {

		ArrayList<Integer> _Offsets_Queen = new ArrayList<Integer>();

		ArrayList<Integer> _Up_Offsets = new ArrayList<Integer>();

		ArrayList<Integer> _Down_Offsets = new ArrayList<Integer>();

		ArrayList<Integer> _Left_Offsets = new ArrayList<Integer>();

		ArrayList<Integer> _Right_Offsets = new ArrayList<Integer>();

		ArrayList<Integer> _Offsets_TL = new ArrayList<Integer>();

		ArrayList<Integer> _Offsets_TR = new ArrayList<Integer>();

		ArrayList<Integer> _Offsets_BL = new ArrayList<Integer>();

		ArrayList<Integer> _Offsets_BR = new ArrayList<Integer>();

		

		int t = u;
		while (t > 8) {
			t -= 8;
			_Up_Offsets.add(t);
		}
		ArrayList<Integer> _Temporary = new ArrayList<Integer>();
		for (int i = 0; i < _Up_Offsets.size(); i++) {
			if (hsh.get(Integer.toString(_Up_Offsets.get(i))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Up_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Up_Offsets.get(i));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Up_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Up_Offsets.get(i));
				}
				break;
			} else {
				_Temporary.add(_Up_Offsets.get(i));
			}
		}
		_Up_Offsets = _Temporary;
		t = u;
		while (t < 56) {
			t += 8;
			_Down_Offsets.add(t);
		}
		_Temporary = new ArrayList<Integer>();
		for (int i = 0; i < _Down_Offsets.size(); i++) {
			if (hsh.get(Integer.toString(_Down_Offsets.get(i))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Down_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Down_Offsets.get(i));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Down_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Down_Offsets.get(i));
				}
				break;
			} else {
				_Temporary.add(_Down_Offsets.get(i));
			}
		}
		_Down_Offsets = _Temporary;

		//The following is something I cant remember 
		//This is side to side
		t = u;
		while (t > 8) {
			t -= 8;
		}
		int r = 8 - t;
		int l = t - 1;
		t = u;


		while (r > 0) {
			_Right_Offsets.add(t + r);
			r -= 1;
		} 
		for (int i = 0; i < _Right_Offsets.size(); i++) {
			if (hsh.get(Integer.toString(_Right_Offsets.get(i))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Right_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Right_Offsets.get(i));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Right_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Right_Offsets.get(i));
				}
				break;
			} else {
				_Temporary.add(_Right_Offsets.get(i));
			}
		}
		_Right_Offsets = _Temporary;
		while (l > 0) {
			_Left_Offsets.add(t - l);
			l -=  1;
		}
		for (int i = 0; i < _Left_Offsets.size(); i++) {
			if (hsh.get(Integer.toString(_Left_Offsets.get(i))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Left_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Left_Offsets.get(i));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Left_Offsets.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Left_Offsets.get(i));
				}
				break;
			} else {
				_Temporary.add(_Left_Offsets.get(i));
			}
		}
		_Left_Offsets = _Temporary;




		t = u;
		while (t > 8) {
			t -= 9;
			_Offsets_TL.add(t);
		}
		_Temporary = new ArrayList<Integer>();
		for (int i = 0; i < _Offsets_TL.size(); i++) {
			if (hsh.get(Integer.toString(_Offsets_TL.get(i))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Offsets_TL.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Offsets_TL.get(i));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Offsets_TL.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Offsets_TL.get(i));
				}
				break;
			} else {
				_Temporary.add(_Offsets_TL.get(i));
			}
		}
		_Offsets_TL = _Temporary;
		t = u;


		while (t > 7) {
			t-= 7;
			_Offsets_TR.add(t);
		}
		_Temporary = new ArrayList<Integer>();
		for (int i = 0; i < _Offsets_TR.size(); i++) {
			if (hsh.get(Integer.toString(_Offsets_TR.get(i))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Offsets_TR.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Offsets_TR.get(i));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Offsets_TR.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Offsets_TR.get(i));
				}
				break;
			} else {
				_Temporary.add(_Offsets_TR.get(i));
			}
		}
		_Offsets_TR = _Temporary;
		t = u;


		while (t < 56) {
			t += 9;
			_Offsets_BR.add(t);
		}
		_Temporary = new ArrayList<Integer>();
		for (int i = 0; i < _Offsets_BR.size(); i++) {
			if (hsh.get(Integer.toString(_Offsets_BR.get(i))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Offsets_BR.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Offsets_BR.get(i));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Offsets_BR.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Offsets_BR.get(i));
				}
				break;
			} else {
				_Temporary.add(_Offsets_BR.get(i));
			}
		}
		_Offsets_BR = _Temporary;
		t = u;
		while(t < 58) {
			t += 7;
			_Offsets_BL.add(t);
		}
		for (int i = 0; i < _Offsets_BL.size(); i++) {
			if (hsh.get(Integer.toString(_Offsets_BL.get(i))).getIcon().toString() != "a/blank.png") {
				String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

				/*
				The reason for the next if statements is because we want the pieces to able to take one another, but
				not the ones behind them

				This way if the piece that is in front of them is in another colour they will be able to take it, hence
				it will be added to the list of possible squares. If not then it will be deemed unfit to move to for the piece
				*/


				if ((file_name.contains("1")) && (!hsh.get(Integer.toString(_Offsets_BL.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Offsets_BL.get(i));
				} else if ((!file_name.contains("1")) && (hsh.get(Integer.toString(_Offsets_BL.get(i))).getIcon().toString().contains("1"))) {
					_Temporary.add(_Offsets_BL.get(i));
				}
				break;
			} else {
				_Temporary.add(_Offsets_BL.get(i));
			}
		}
		_Offsets_BL = _Temporary;
		t = u;


		for (int i = 0; i < _Up_Offsets.size(); i ++) {
			_Offsets_Queen.add(_Up_Offsets.get(i));
		}
		for (int i = 0; i < _Down_Offsets.size(); i ++) {
			_Offsets_Queen.add(_Down_Offsets.get(i));
		}
		for (int i = 0; i < _Left_Offsets.size(); i ++) {
			_Offsets_Queen.add(_Left_Offsets.get(i));
		}
		for (int i = 0; i < _Right_Offsets.size(); i ++) {
			_Offsets_Queen.add(_Right_Offsets.get(i));
		}
		for (int i = 0; i < _Offsets_TL.size(); i ++) {
			_Offsets_Queen.add(_Offsets_TL.get(i));
		}
		for (int i = 0; i < _Offsets_BL.size(); i ++) {
			_Offsets_Queen.add(_Offsets_BL.get(i));
		}
		for (int i = 0; i < _Offsets_TR.size(); i ++) {
			_Offsets_Queen.add(_Offsets_TR.get(i));
		}
		for (int i = 0; i < _Offsets_BR.size(); i ++) {
			_Offsets_Queen.add(_Offsets_BR.get(i));
		}
		return _Offsets_Queen;
	}

	public ArrayList<Integer> King_Offsets (int u, HashMap<String, JButton> hsh) {
		ArrayList<Integer> _Offsets_King = new ArrayList<Integer>();

		_Offsets_King.add(u - 1);
		_Offsets_King.add(u + 1);
		_Offsets_King.add(u + 8);
		_Offsets_King.add(u - 8);

		_Offsets_King.add(u - 9);
		_Offsets_King.add(u + 7);
		_Offsets_King.add(u + 9);
		_Offsets_King.add(u - 7);

		String file_name = hsh.get(Integer.toString(u)).getIcon().toString();

		for (int i = 0; i < _Offsets_King.size(); i ++) {
			if (i < _Offsets_King.size()) {
				if (_Offsets_King.get(i)> 64 || _Offsets_King.get(i) < 1) {
					_Offsets_King.remove(i);
					i --;
				}
			}
		}

		for (int i = 0; i < _Offsets_King.size(); i++) {



			if (i < _Offsets_King.size()) {
				if (hsh.get(Integer.toString(_Offsets_King.get(i))).getIcon().toString() != "a/blank.png") {
					if ((file_name.contains("1")) && (hsh.get(Integer.toString(_Offsets_King.get(i))).getIcon().toString().contains("1"))) {
						_Offsets_King.remove(i);
						i --; // This is because it is not dependant on how many items there are
					} else if ((!file_name.contains("1")) && (!hsh.get(Integer.toString(_Offsets_King.get(i))).getIcon().toString().contains("1"))) {
						_Offsets_King.remove(i);
						i --;
					}
				}

			}
		}

		return _Offsets_King;




	}

	Piece() {



	}
}