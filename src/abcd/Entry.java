package abcd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
public class Entry {

	public static void main(String[] args) {
		//Degrade the perfomance 
		//Map
		ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
		
		Map<Integer, Vehicle> keyshfsd= new HashMap<Integer,Vehicle>();
		
		//fingerprint is we consider
		Map<String, Human> fgafdsfg= new HashMap<Integer,Human>();
		
		
		
		for(Vehicle vehicledet:vehicle)
		{
			if(2345==(vehicledet.getNumber()))
			{
				System.out.println(vehicledet.getTypeOfVehicle());
				System.out.println(vehicledet.getMinutes());
				
			}
			
		}
		
		
		
		
		ArrayList<String> veh = new ArrayList<String>();
		veh.add("2345");
		veh.add("8899999");
		veh.add("CAR");
		
		veh.add("2335");
		veh.add("3456");
		veh.add("BUS");
		
		veh.add("4556");
		veh.add("25332532");
		veh.add("TRAILER");
		
		
		for(int i=0;i<veh.size();i++)
		{
			if("2345".equals(veh.get(i)))	
			{
				
			}
			
		}
		
		
		
		
		
		JFrame Frame = new JFrame("Entry and Exit");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton Button = new JButton("Entry");
		Button.setBounds(200, 200, 100, 100);
		
		JLabel VehicleModel = new JLabel("Vehicle Model");
		VehicleModel.setBounds(200, 100, 50, 50);
		
		JTextField VehicleModel1 = new JTextField();
		VehicleModel1.setBounds(150, 100, 50, 50);
		
		JLabel VehicleNumer = new JLabel("Vehicle Number");
		VehicleNumer.setBounds(200, 100, 50, 50);
		
		JTextField VehicleNumber1 = new JTextField();
		VehicleNumber1.setBounds(150, 100, 50, 50);
		
		JLabel Entrytime = new JLabel("Entry Time");
		Entrytime.setBounds(200, 100, 50, 50);
		
		JTextField EntryTime1 = new JTextField();
		EntryTime1.setBounds(150, 100, 50, 50);
		
		JLabel ContactNo = new JLabel ("Contact Number");
		ContactNo.setBounds(200, 100, 50, 50);
		
		JTextField ContactNo1 = new JTextField();
		ContactNo1.setBounds(150, 100, 50, 50);
		
		Frame.add(Button);
		Frame.setSize(800, 800);
		Frame.setVisible(true);
		Frame.setLayout(null);
		
		
	}
	
		
}
