
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


	public int convert_coords_y(int y) {
		return y*100;
	}


	public int convert_coords_x(int x) {
		return x*100;
	}
	
	JFrame _Chess_Board = new JFrame();

	HashMap<String, JButton> _Places = new HashMap<String, JButton>();

	JButton _Selected_Piece = null;



	Font _Global_Font = new Font(null, Font.BOLD, 48);



	Board() {
		boolean _Place_Color = false;

		



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
					_Places.get(Integer.toString(i)).setBackground(Color.black);

				}

			} else {

				if (even(t)) {
					_Places.get(Integer.toString(i)).setBackground(Color.black);


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
			String _Piece_Name ="W";
			if (i == 1 || i == 8) {
			
			_Places.get(Integer.toString(i)).setText("R");
			
			_Places.get(Integer.toString(i)).setForeground(Color.red);
			

			} else if (i == 2 || i == 7) {
				_Places.get(Integer.toString(i)).setText("K");
			
				_Places.get(Integer.toString(i)).setForeground(Color.red);
			} else if (i == 3 || i == 6) {
				_Places.get(Integer.toString(i)).setText("B");
			
				_Places.get(Integer.toString(i)).setForeground(Color.red);
			} else if (i == 4) {
				_Places.get(Integer.toString(i)).setText("Q");
			
				_Places.get(Integer.toString(i)).setForeground(Color.red);
			} else if (i == 5) {
				_Places.get(Integer.toString(i)).setText("K");
			
				_Places.get(Integer.toString(i)).setForeground(Color.red);
			} else {
				_Places.get(Integer.toString(i)).setText("P");
			
				_Places.get(Integer.toString(i)).setForeground(Color.red);
			}


		}
		for (int i = 49; i < 65; i ++) {
			String _Piece_Name ="W";
			if (i == 57 || i == 64) {
			
			_Places.get(Integer.toString(i)).setText("R");
			
			_Places.get(Integer.toString(i)).setForeground(Color.blue);
			

			} else if (i == 58 || i == 63) {
				_Places.get(Integer.toString(i)).setText("K");
			
				_Places.get(Integer.toString(i)).setForeground(Color.blue);
			} else if (i == 59 || i == 62) {
				_Places.get(Integer.toString(i)).setText("B");
			
				_Places.get(Integer.toString(i)).setForeground(Color.blue);
			} else if (i == 60) {
				_Places.get(Integer.toString(i)).setText("Q");
			
				_Places.get(Integer.toString(i)).setForeground(Color.blue);
			} else if (i == 61) {
				_Places.get(Integer.toString(i)).setText("K");
			
				_Places.get(Integer.toString(i)).setForeground(Color.blue);
			} else {
				_Places.get(Integer.toString(i)).setText("P");
			
				_Places.get(Integer.toString(i)).setForeground(Color.blue);
			}


		}


		_Chess_Board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		_Chess_Board.setSize(1000, 1000);

		_Chess_Board.setTitle("Chess");

		_Chess_Board.setLayout(null);

		_Chess_Board.setVisible(true);

		_Chess_Board.setResizable(false);

	}

	public void clear_text(String x, HashMap<String, JButton> hsh) {
		for (int i = 0; i < hsh.size(); i++) {
			if (hsh.get(Integer.toString(i)).getText() == x) {
				System.out.println("Got here");
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 65; i++) {

			if (_Places.get(Integer.toString(i)) == e.getSource()) {

				if (_Selected_Piece == null) {

					_Selected_Piece = _Places.get(Integer.toString(i));
				} else if (_Selected_Piece != null) {

					_Places.get(Integer.toString(i)).setText(_Selected_Piece.getText());
					//This makes sure that the piece retains the same colour
					_Places.get(Integer.toString(i)).setForeground(_Selected_Piece.getForeground());


					//This for loop resets the square the the piece was previously on
					for (int u = 1; u < 65; u++) {
						if (_Places.get(Integer.toString(u)).equals(_Selected_Piece)) {
							_Places.get(Integer.toString(u)).setText("");

						}
					}

					

					_Selected_Piece = null;
				}
			}
		}

	}

} 
