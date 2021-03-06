import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Board implements ActionListener{

	public boolean even(int i){
		if (i % 2 == 0) {
			return true;
		}
		return false;
	}



	JFrame _Chess_Board = new JFrame();

	HashMap<String, JButton> _Places = new HashMap<String, JButton>();

	JButton _Selected_Piece = null;

	Piece _Piece_Util = new Piece();

	Check _Check_Util = new Check();

	Font _Global_Font = new Font(null, Font.BOLD, 48);

	JLabel _Err = new JLabel();

	JLabel _Check = new JLabel();



	Board() {
		boolean _Place_Color = false;

		_Err.setBounds(350, 20, 400, 60);

		_Err.setFont(new Font(null, Font.ITALIC, 36));

		_Err.setForeground(Color.red);

		_Check.setBounds(350, 920, 400, 60);

		_Check.setFont(new Font(null, Font.ITALIC, 36));

		_Check.setForeground(Color.green);

		for (int i = 1; i < 65; i++) {
			JButton ref = new JButton();

			_Places.put(Integer.toString(i), ref);

			_Places.get(Integer.toString(i)).addActionListener(this);

			_Places.get(Integer.toString(i)).setFont(_Global_Font);

			_Places.get(Integer.toString(i)).setForeground(Color.red); 

		}

		//This is for getting the pieces
		




		//This is for coloring the board
		for (int i = 1; i < 65; i++) {

			int counter = 1;

			int t = i;

			//The reason for the following while loop is to determine what row 
			//We are on so that I can colour the squares accordingly
			while (t > 8) {

				t -= 8;

				counter += 1;
			}

			//The Following is just to paint the squares
			if (even(counter)) { 

				if (even(t)) {
					_Places.get(Integer.toString(i)).setBackground(Color.white);


				} else {
					_Places.get(Integer.toString(i)).setBackground(Color.lightGray);

				}

			} else {

				if (even(t)) {
					_Places.get(Integer.toString(i)).setBackground(Color.lightGray);


				} else {

					_Places.get(Integer.toString(i)).setBackground(Color.white);

				}

			}

			_Places.get(Integer.toString(i)).setBounds(100*t, 100*counter, 100, 100);

			_Places.get(Integer.toString(i)).setFocusPainted(false);

			_Chess_Board.add(_Places.get(Integer.toString(i)));

		}
		//The next two for loops are just long ways of creating the game pieces
		for (int i = 1; i < 17; i ++) {
			if (i == 1 || i == 8) {

			ImageIcon _Black_Rook = new ImageIcon("a/rook1.png");
			
			_Places.get(Integer.toString(i)).setIcon(_Black_Rook);

			} else if (i == 2 || i == 7) {

				ImageIcon _Black_Knight = new ImageIcon("a/knight1.png");
				_Places.get(Integer.toString(i)).setIcon(_Black_Knight);
			

			} else if (i == 3 || i == 6) {
				ImageIcon _Black_Bishop = new ImageIcon("a/bishop1.png");
				_Places.get(Integer.toString(i)).setIcon(_Black_Bishop);
			

			} else if (i == 4) {
				ImageIcon _Black_Queen = new ImageIcon("a/queen1.png");
				_Places.get(Integer.toString(i)).setIcon(_Black_Queen);
			

			} else if (i == 5) {
				ImageIcon _Black_King = new ImageIcon("a/king1.png");
				_Places.get(Integer.toString(i)).setIcon(_Black_King);
			

			} else {
				ImageIcon _Black_Pawn = new ImageIcon("a/pawn1.png");
				_Places.get(Integer.toString(i)).setIcon(_Black_Pawn);

			}


		}
		for (int i = 49; i < 65; i ++) {
			if (i == 57 || i == 64) {

			ImageIcon _White_Rook = new ImageIcon("a/rook.png");
			
			_Places.get(Integer.toString(i)).setIcon(_White_Rook);

			} else if (i == 58 || i == 63) {

				ImageIcon _White_Knight = new ImageIcon("a/knight.png");
				_Places.get(Integer.toString(i)).setIcon(_White_Knight);
			

			} else if (i == 59 || i == 62) {
				ImageIcon _White_Bishop = new ImageIcon("a/bishop.png");
				_Places.get(Integer.toString(i)).setIcon(_White_Bishop);
			

			} else if (i == 60) {
				ImageIcon _White_Queen = new ImageIcon("a/queen.png");
				_Places.get(Integer.toString(i)).setIcon(_White_Queen);
			

			} else if (i == 61) {
				ImageIcon _White_King = new ImageIcon("a/king.png");
				_Places.get(Integer.toString(i)).setIcon(_White_King);
			

			} else {
				ImageIcon _White_Pawn = new ImageIcon("a/pawn.png");
				_Places.get(Integer.toString(i)).setIcon(_White_Pawn);

			}
		}

		for (int i = 17; i < 49; i++) {
			ImageIcon _Blank = new ImageIcon("a/blank.png");
			_Places.get(Integer.toString(i)).setIcon(_Blank);
		}

		
		_Chess_Board.add(_Err);

		_Chess_Board.add(_Check);

		_Chess_Board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		_Chess_Board.setSize(1000, 1000);

		_Chess_Board.setTitle("Chess");

		_Chess_Board.setLayout(null);

		_Chess_Board.setVisible(true);

		_Chess_Board.setResizable(false);



	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 65; i++) {

			if (_Places.get(Integer.toString(i)) == e.getSource()) {

				if (_Selected_Piece == null) {

					_Selected_Piece = _Places.get(Integer.toString(i));

					_Err.setText("");

					//_Places.get(Integer.toString(i)).setBackground(Color.red); //I want to add colour to the selected piece

				} else if (_Selected_Piece.getIcon().toString() == "a/blank.png") {

					_Selected_Piece = null;
					return;

				} else if (_Selected_Piece.getIcon().toString() == "a/pawn1.png"){

					for (int u = 9; u < 65; u ++) {

						if (_Places.get(Integer.toString(u)) == _Selected_Piece) {


							ArrayList<Integer> _Offsets_Pawn = _Piece_Util.Pawn_Offsets(u, _Places);

							if (_Offsets_Pawn.contains(i)) {
								ImageIcon _Blank = new ImageIcon("a/blank.png");
								_Places.get(Integer.toString(i)).setIcon(_Selected_Piece.getIcon());
								_Places.get(Integer.toString(u)).setIcon(_Blank);


								_Selected_Piece = null;
							}
							else {
								_Selected_Piece = null;

								_Err.setText("Invalid Move");
							}

							return;
						}
					}


				} else if (_Selected_Piece.getIcon().toString() == "a/pawn.png") {//This statement is for the white pawns to move forward

					for (int u = 9; u < 65; u ++) {

						if (_Places.get(Integer.toString(u)) == _Selected_Piece) {

							ArrayList<Integer> _Offsets_Pawn = _Piece_Util.Pawn_Offsets(u, _Places);

							if (_Offsets_Pawn.contains(i)) {
								ImageIcon _Blank = new ImageIcon("a/blank.png");
								_Places.get(Integer.toString(i)).setIcon(_Selected_Piece.getIcon());
								_Places.get(Integer.toString(u)).setIcon(_Blank);


								_Selected_Piece = null;
							}
							else {
								_Selected_Piece = null;

								_Err.setText("Invalid Move");
							}
							if (_Check_Util.in_check(_Places).get(0)) {
								_Check.setText("Check");
							} else {
								_Check.setText("");
							}
							return;
						}
					}

				} else if (_Selected_Piece.getIcon().toString() == "a/bishop.png" || _Selected_Piece.getIcon().toString() == "a/bishop1.png") {//This statement is for the white pawns to move forward
					
					for (int u = 1; u < 65; u ++) {



						if (_Places.get(Integer.toString(u)) == _Selected_Piece) {

							int t = u;

							ArrayList<Integer> _Offsets_Bishop = _Piece_Util.Bishop_Offsets(t, _Places);




							if (_Offsets_Bishop.contains(i)) {

								if (_Places.get(Integer.toString(i)).getBackground() == _Selected_Piece.getBackground()) {

									ImageIcon _Blank = new ImageIcon("a/blank.png");
									_Places.get(Integer.toString(i)).setIcon(_Selected_Piece.getIcon());
									_Places.get(Integer.toString(u)).setIcon(_Blank);


									_Selected_Piece = null;

								} else {
									_Err.setText("Invalid Move");

									_Selected_Piece = null;
								}
								
							} else {
								_Err.setText("Invalid Move");
								
								_Selected_Piece = null;
							}

							if (_Check_Util.in_check(_Places).get(0)) {
								_Check.setText("Check");
							} else {
								_Check.setText("");
							}

							return;
						}
					}
				
				} else if (_Selected_Piece.getIcon().toString() == "a/knight.png" || _Selected_Piece.getIcon().toString() == "a/knight1.png") {//This statement is for the white pawns to move forward
					
					for (int u = 1; u < 65; u ++) {



						if (_Places.get(Integer.toString(u)) == _Selected_Piece) {

							ArrayList<Integer> of = _Piece_Util.Knight_Offsets(u, _Places);

							if (of.contains(i)) {

								if (_Places.get(Integer.toString(i)).getBackground() != _Selected_Piece.getBackground()) {

									ImageIcon _Blank = new ImageIcon("a/blank.png");
									_Places.get(Integer.toString(i)).setIcon(_Selected_Piece.getIcon());
									_Places.get(Integer.toString(u)).setIcon(_Blank);


									_Selected_Piece = null;

								} else {
									_Err.setText("Invalid Move");

									_Selected_Piece = null;
								}
								
							} else {
								_Err.setText("Invalid Move");
								
								_Selected_Piece = null;
							}

							if (_Check_Util.in_check(_Places).get(0)) {
								_Check.setText("Check");
							} else {
								_Check.setText("");
							}

							return;
						}
					}
				
				} else if (_Selected_Piece.getIcon().toString() == "a/rook.png" || _Selected_Piece.getIcon().toString() == "a/rook1.png") {//This statement is for the white pawns to move forward
					
					for (int u = 1; u < 65; u ++) {



						if (_Places.get(Integer.toString(u)) == _Selected_Piece) {

							ArrayList<Integer> of = _Piece_Util.Rook_Offsets(u, _Places);

							if (of.contains(i)) {

								

								ImageIcon _Blank = new ImageIcon("a/blank.png");
								_Places.get(Integer.toString(i)).setIcon(_Selected_Piece.getIcon());
								_Places.get(Integer.toString(u)).setIcon(_Blank);


								_Selected_Piece = null;

								
								
							} else {
								_Err.setText("Invalid Move");
								
								_Selected_Piece = null;
							}

							if (_Check_Util.in_check(_Places).get(0)) {
								_Check.setText("Check");
							} else {
								_Check.setText("");
							}

							return;
						}
					}
				} else if (_Selected_Piece.getIcon().toString() == "a/queen.png" || _Selected_Piece.getIcon().toString() == "a/queen1.png") {//This statement is for the white pawns to move forward
					
					for (int u = 1; u < 65; u ++) {



						if (_Places.get(Integer.toString(u)) == _Selected_Piece) {

							ArrayList<Integer> of = _Piece_Util.Queen_Offsets(u, _Places);

							if (of.contains(i)) {

								

								ImageIcon _Blank = new ImageIcon("a/blank.png");
								_Places.get(Integer.toString(i)).setIcon(_Selected_Piece.getIcon());
								_Places.get(Integer.toString(u)).setIcon(_Blank);


								_Selected_Piece = null;

								
								
							} else {
								_Err.setText("Invalid Move");
								
								_Selected_Piece = null;
							}

							if (_Check_Util.in_check(_Places).get(0)) {
								_Check.setText("Check");
							} else {
								_Check.setText("");
							}

							return;
						}
					}
				} else if (_Selected_Piece.getIcon().toString() == "a/king.png" || _Selected_Piece.getIcon().toString() == "a/king1.png") {//This statement is for the white pawns to move forward
					
					//System.out.println(_Places.get(Integer.toString(i)).getBounds().x);

					for (int u = 1; u < 65; u ++) {



						if (_Places.get(Integer.toString(u)) == _Selected_Piece) {

							int diff = _Places.get(Integer.toString(u)).getBounds().x - _Places.get(Integer.toString(i)).getBounds().x;

							if (diff < -100 || diff > 100) {
								_Err.setText("Invalid Move");
								_Selected_Piece = null;
								return;
							}

							ArrayList<Integer> of = _Piece_Util.King_Offsets(u, _Places);

							if (of.contains(i)) {



								ImageIcon _Blank = new ImageIcon("a/blank.png");
								_Places.get(Integer.toString(i)).setIcon(_Selected_Piece.getIcon());
								_Places.get(Integer.toString(u)).setIcon(_Blank);


								_Selected_Piece = null;

								
							} else {
								_Err.setText("Invalid Move");
								
								_Selected_Piece = null;
							}

							if (_Check_Util.in_check(_Places).get(0)) {
								_Check.setText("Check");
							} else {
								_Check.setText("");
							}

							return;
						}
					}
				}else {
					_Places.get(Integer.toString(i)).setIcon(_Selected_Piece.getIcon());

					//This for loop resets the square the the piece was previously on
					for (int u = 1; u < 65; u++) {
						if (_Places.get(Integer.toString(u)).equals(_Selected_Piece)) {
							ImageIcon _Blank = new ImageIcon("a/blank.png");
							_Places.get(Integer.toString(u)).setIcon(_Blank);
						}
					}
					_Selected_Piece = null;
				}
			}
		}
	}
} 