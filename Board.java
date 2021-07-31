
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Board{

	public boolean even(int i){
		if (i % 2 == 0) {
			return true;
		}
		return false;
	}
	
	JFrame _Chess_Board = new JFrame();

	HashMap<String, JButton> _Places = new HashMap<String, JButton>();



	


	Board() {
		boolean _Place_Color = false;

		for (int i = 1; i < 65; i++) {
			JButton ref = new JButton(Integer.toString(i));

			_Places.put(Integer.toString(i), ref);






		}

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
					_Places.get(Integer.toString(i)).setText("W");
				} else {
					_Places.get(Integer.toString(i)).setBackground(Color.black);
					_Places.get(Integer.toString(i)).setText("B");
				}

			} else {

				if (even(t)) {
					_Places.get(Integer.toString(i)).setBackground(Color.black);
					_Places.get(Integer.toString(i)).setText("B");

				} else {

					_Places.get(Integer.toString(i)).setBackground(Color.white);
					_Places.get(Integer.toString(i)).setText("W");
				}

			}

			_Places.get(Integer.toString(i)).setBounds(100*t, 100*counter, 100, 100);

			_Places.get(Integer.toString(i)).setFocusPainted(false);

			_Chess_Board.add(_Places.get(Integer.toString(i)));

		}

		_Chess_Board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		_Chess_Board.setSize(1000, 1000);

		_Chess_Board.setTitle("Chess");

		_Chess_Board.setLayout(null);

		_Chess_Board.setVisible(true);

		_Chess_Board.setResizable(false);

	}

}