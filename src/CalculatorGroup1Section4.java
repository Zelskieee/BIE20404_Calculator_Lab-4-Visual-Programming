import java.awt.*;// Imported java swing library
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

// Section 4 Group 1 ( Arif, Junesh, Irfan & Syukri )

// CalculatorGroup1Section4 class that extends JFrame class and Implements ActionListener interface
public class CalculatorGroup1Section4 extends JFrame implements ActionListener {

	// Declare the variables
	JTextField ResultTF;
	double result;
	private Object operation;

	// Create a constructor for CalculatorGroup1Section4 class
	public CalculatorGroup1Section4() {
		
		// Set Java icon picture to iPhone Calculator
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zelggx Arif\\Desktop\\VP - Lab & Lecture\\Lab4VP\\Image\\iPhone Calculator.png"));

		JFrame Title = new JFrame(); // Create JFrame object
		setTitle("Calculator Group 1 Section 4"); // Set JFrame title
		setResizable(false); // Set the JFrame become not resizeable by the user

		ResultTF = new JTextField(10); // Create the textfield
		ResultTF.setBackground(Color.WHITE); // Set the textfield background to white color
		ResultTF.setEditable(false); // Set the textfield to be uneditable
		ResultTF.setFont(new Font("Arial Black", Font.BOLD, 90)); // Set the font of textfield 
		ResultTF.setBounds(42, 20, 462, 98); // Set the bound of textfield

		// Create the button, set the font, set the bounds of all button in the Calculator
		JButton b0 = new JButton("0");
		b0.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		b0.setBounds(126, 328, 80, 50);

		JButton b1 = new JButton("1");
		b1.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		b1.setBounds(42, 274, 80, 50);

		JButton b2 = new JButton("2");
		b2.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		b2.setBounds(126, 274, 80, 50);

		JButton b3 = new JButton("3");
		b3.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		b3.setBounds(210, 274, 80, 50);

		JButton b4 = new JButton("4");
		b4.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		b4.setBounds(42, 220, 80, 50);

		JButton b5 = new JButton("5");
		b5.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		b5.setBounds(126, 220, 80, 50);

		JButton b6 = new JButton("6");
		b6.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		b6.setBounds(210, 220, 80, 50);

		JButton b7 = new JButton("7");
		b7.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		b7.setBounds(42, 165, 80, 50);

		JButton b8 = new JButton("8");
		b8.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		b8.setBounds(126, 165, 80, 50);

		JButton b9 = new JButton("9");
		b9.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		b9.setBounds(210, 165, 80, 50);

		JButton bClear = new JButton("C");
		bClear.setForeground(new Color(255, 255, 255)); // Set the font color to white
		bClear.setBackground(new Color(255, 153, 153)); // Set the button color to Light Salmon Pink
		bClear.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		bClear.setBounds(334, 165, 80, 40);

		JButton bClearEntry = new JButton("CE");
		bClearEntry.setForeground(new Color(255, 255, 255)); // Set the font color to white
		bClearEntry.setBackground(new Color(255, 153, 153)); // Set the button color to Light Salmon Pink
		bClearEntry.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		bClearEntry.setBounds(424, 165, 80, 40);

		JButton bLeftbracket = new JButton("(");
		bLeftbracket.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		bLeftbracket.setBounds(334, 210, 80, 40);

		JButton bRightbracket = new JButton(")");
		bRightbracket.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		bRightbracket.setBounds(424, 210, 80, 40);

		JButton bMultiply = new JButton("×");
		bMultiply.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		bMultiply.setBounds(334, 255, 80, 40);

		JButton bDivision = new JButton("÷");
		bDivision.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		bDivision.setBounds(424, 255, 80, 40);

		JButton bAdd = new JButton("+");
		bAdd.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		bAdd.setBounds(334, 299, 80, 40);

		JButton bSubtract = new JButton("-");
		bSubtract.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		bSubtract.setBounds(424, 299, 80, 40);

		JButton bTotal = new JButton("=");
		bTotal.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		bTotal.setBounds(334, 343, 170, 39);

		// Create panel, set the line border and panel color, set the panel bound for all panel in the Calculator
		JPanel pNumber = new JPanel();
		pNumber.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pNumber.setBounds(36, 158, 261, 225);

		JPanel pOperation = new JPanel();
		pOperation.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pOperation.setBounds(326, 158, 185, 232);

		JPanel pAll = new JPanel();
		pAll.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pAll.setBounds(20, 137, 505, 269);

		// Register listener
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bClear.addActionListener(this);
		bClearEntry.addActionListener(this);
		bLeftbracket.addActionListener(this);
		bRightbracket.addActionListener(this);
		bMultiply.addActionListener(this);
		bDivision.addActionListener(this);
		bAdd.addActionListener(this);
		bSubtract.addActionListener(this);
		bTotal.addActionListener(this);

		// Add all the source component to the JFrame
		getContentPane().add(ResultTF);
		getContentPane().add(b0);
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		getContentPane().add(b5);
		getContentPane().add(b6);
		getContentPane().add(b7);
		getContentPane().add(b8);
		getContentPane().add(b9);
		getContentPane().add(bClear);
		getContentPane().add(bClearEntry);
		getContentPane().add(bLeftbracket);
		getContentPane().add(bRightbracket);
		getContentPane().add(bMultiply);
		getContentPane().add(bDivision);
		getContentPane().add(bAdd);
		getContentPane().add(bSubtract);
		getContentPane().add(bTotal);
		setSize(300, 300);
		getContentPane().setLayout(null);
		getContentPane().add(pNumber);
		getContentPane().add(pOperation);
		getContentPane().add(pAll);
		setSize(565, 453); // Set the window size
		setVisible(true); // Set the visibility of JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation of JFrame

	}

	public void actionPerformed(ActionEvent e) { // Method to handle event of button click

		// Getting the action from the event
		String input = e.getActionCommand();
		if ("0123456789".contains(input)) // User clicked on number button
		{
			ResultTF.setText(ResultTF.getText() + input); // From the button-clicked action, number will display inside JTextField
		} 
		else if ("+-×÷".contains(input)) // User clicked on operation button
		{
			double operand = Double.parseDouble(ResultTF.getText()); // Parse the current value in JTextField to double

			if (operation == null) // If no operation
			{
				result = operand; // The result will display as the number clicked
			} 
			else // If there is an operation
			{
				switch (operation.toString()) // Switchcase for operation from the operation button clicked
				{
				case "+":
					result += operand; // Add 
					break;
				case "-":
					result -= operand; // Minus
					break;
				case "×":
					result *= operand; // Multiply
					break;
				case "÷":
					result /= operand; // Division
					break;
				}
			}
			operation = input.charAt(0); // Store the input number as the current operator 
			ResultTF.setText(""); // Clear the JTextField
		} 
		else if (input.equals("C")) // User clicked on Clear button
		{
			ResultTF.setText(""); // Clear the JTextField
			result = 0; // Result will be zero
			operation = null; // There is no operation
		}
		else if (input.equals("CE")) // User clicked on Clear Entry button
		{
			ResultTF.setText(""); // Clear the JTextField but still have value before the operator button clicked
		} 
		else if (input.equals("=")) // Execute the operation
		{
			double operand = Double.parseDouble(ResultTF.getText()); // Parse the current value in JTextField to double

			switch (operation.toString()) // Switchcase for after result calculation
			{
			case "+":
				result += operand; // Add
				break;
			case "-":
				result -= operand; // Minus
				break;
			case "×":
				result *= operand; // Multiply
				break;
			case "÷":
				result /= operand; // Division
				break;
			}
			ResultTF.setText(Double.toString(result)); // Display result in JTextField
			operation = null;
		}
	}

	public static void main(String args[]) { // Main method

		new CalculatorGroup1Section4(); // Create an instance for CalculatorGroup1Section4 class
	}
}
