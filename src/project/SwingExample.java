package project;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//import LogModel.FrontEndPojo;

public class SwingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entry entry = new Entry();
		entry.setVehiclenumber(142412);	
		
		SaveLogic vb = new SaveLogic();
	  Map<Integer, Entry> mx=vb.saveData(entry);
		
		
		Exit xc = new Exit();
		xc.setVehiclenumber(2344);
		
		
		for (Map.Entry<Integer, Entry> fg : mx.entrySet()) {
			if (fg.getKey().equals
					(xc.getVehiclenumber())) {

					Entry entry1=fg.getValue();
				if(entry1.getLaocalTime()!=null)
				{
				LocalDateTime hours=entry1.getLaocalTime();
				LocalDateTime minutes=entry1.getLaocalTime();
				hours.getHour();
				minutes.getMinute();
				
				
				LocalDateTime systemTime = LocalDateTime.now();
				systemTime.minusHours(hours.getHour());
				systemTime.minusMinutes(minutes.getMinute());
					
			    }
							
				
				
			}

		}
		
		
		// Reference
		//Invoice, bill
		//Date
		//invoice number
		//address of the store
		//sl number quantity, price, product name, total 
		//Modify the code, u should have the field
		//int string   double+string     double     Double
		//Phase 1 of the prject
	//Sl NO   DESCRIPTION   QUANTITY     PRICE      TOTAL
		//1)  Masoor dal    1kg         162.50     162.50
		//2)  HIt            1PC         140.OO     140.00
		//3)  Rice           1.50kg      80.00      120.00   
	//	1)  Masoor dal    1kg         162.50     162.50
	//2)  HIt            1PC         140.OO     140.00
	//3)  Rice           1.50kg      80.00      120.00
		                                            
	                //Total                       //422.50	
		
		//Sl NO          DESCRIPTION       QUANTITY        PRICE            TOTAL		
		// text box empty text box empty  text box empty   text box empty    text box empty
		//1                rice                   2kg           75                  150
		//2                onion                   3kg          25                    75
		//button                                                                     225
		
		//it should able to print pdf  //phase 2
		//  these values shold be save to db //phase 3
		//bll shouldbe send through rmail phase 4
		
		 
		JFrame frame = new JFrame("Billing System");

		
	String[] choices = { "CAR","TRUCK", "BUS","TRAILER","SCOOTER","HEAVY DUTY"};

     JComboBox<String> cb = new JComboBox<String>(choices);
     cb.setBounds(400, 235, 100, 20);
     
		TextField admin = new TextField();
		admin.setBounds(400, 335, 200, 100);
		
		TextField password = new TextField();
		password.setBounds(200, 100, 250, 100);

		JLabel adminLabel = new JLabel("SL No");
		adminLabel.setBounds(220, 150, 100, 20);
		
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(120, 100, 100, 20);

		Button button = new Button("Total Price");
		button.setBounds(400, 135, 100, 20);
		
		
		
		
		JLabel loginLabel = new JLabel("Value will change");
		loginLabel.setBounds(200, 200, 180, 20);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			System.out.println(admin.getText());	
				if(admin.getText()!=null)
				{
					System.out.println("Welcome Logic");
					
					loginLabel.setText("Login Successful");
					
					
				}

				if(admin.getText()=="admin" && password.getText()==("admin"))
				{
					System.out.println("Welcome Logic");
					
					loginLabel.setText("Login Successful");
					
					
				}

			}
		});

		//https://stackoverflow.com/questions/22506331/simple-dropdown-menu-in-java
		frame.add(cb);
		frame.add(admin);
		frame.add(password);
		frame.add(adminLabel);
		frame.add(passwordLabel);
		frame.add(button);
        frame.add(loginLabel);
		
        
        
        frame.setSize(1000, 500);
		
        
        frame.setLayout(null);
		
        
        frame.setVisible(true);

	}

}
