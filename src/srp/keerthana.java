package srp;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class keerthana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
	

		String[] Vehiclechoices = { "car", "truck", "bus", "scooter", "bike" };

		JComboBox cb = new JComboBox(Vehiclechoices);
		cb.setBounds(180, 160, 200, 30);
		frame.add(cb);

		

		JLabel VehicleLabel = new JLabel("Vehicle Number");
		VehicleLabel.setBounds(10, 10, 100, 20);
		JLabel VehicleTime = new JLabel("Entry time");
		VehicleTime.setBounds(10, 50, 250, 50);
		JLabel ContactNumber = new JLabel("Enter the contact Number");
		ContactNumber.setBounds(10, 100, 250, 50);
		JLabel VehicleType = new JLabel("Enter the vehicle Type");
		VehicleType.setBounds(10, 150, 250, 50);
		frame.add(ContactNumber);
		frame.add(VehicleType);
		frame.add(VehicleTime);
		frame.add(VehicleLabel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("ENTRY LAYOUT");
		frame.setSize(1000, 1000);
		frame.setLayout(null);

	}

}
