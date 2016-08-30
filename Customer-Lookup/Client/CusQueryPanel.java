package cusutils.clientgui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

import cusutils.cusData.*;


public class CusQueryPanel extends JPanel implements ActionListener {
      private JLabel lastNameLbl = new JLabel("Last Name: ");
      private JTextField lastNameTxtField = new JTextField(20);

      private JLabel firstNameLbl = new JLabel("First Name: ");
      private JTextField firstNameTxtField = new JTextField(10);

      private JLabel phoneNumLbl = new JLabel("Phone:  (");
      private JTextField areaCodeTxtField = new JTextField(4);
      private JLabel endAreaCodeLbl = new JLabel(")");
      private JTextField localNumTxtField = new JTextField(10);

      private JButton nameSearchBtn = new JButton("Name Search");
      private JButton phoneSearchBtn = new JButton("Phone Search");

      private JPanel namePanel = new JPanel();
      private JPanel phonePanel = new JPanel();
      private JPanel btnPanel = new JPanel();

      private ArrayList<Customer> cusList;
      private Map<Name, ArrayList<Customer>> cusNameMap;

      public CusQueryPanel(ArrayList<Customer> cusList, Map<Name, ArrayList<Customer>> cusNameMap) { 
          this.cusList = cusList;
          this.cusNameMap = cusNameMap;

          setLayout(new GridLayout(3,1));

          namePanel.add(lastNameLbl);
          namePanel.add(lastNameTxtField);
          namePanel.add(firstNameLbl);
          namePanel.add(firstNameTxtField);
          add(namePanel);

          phonePanel.add(phoneNumLbl);
          phonePanel.add(areaCodeTxtField);
          phonePanel.add(endAreaCodeLbl);
          phonePanel.add(localNumTxtField);
          add(phonePanel);

          phoneSearchBtn.addActionListener(this);
          nameSearchBtn.addActionListener(this);
          btnPanel.add(nameSearchBtn);
          btnPanel.add(phoneSearchBtn);
          add(btnPanel);
      }


      private void printNameMatch() {
          Name cusName;
          Customer cus;
          String lastName, firstName;
          int i, numCus;
          boolean matchFound = false;
          
          lastName = lastNameTxtField.getText();
          firstName = firstNameTxtField.getText();
          cusName = new Name(lastName, firstName);
          ArrayList<Customer> theCustomerList = new ArrayList<Customer>();
          
          Set<Name> nameSet = cusNameMap.keySet();
          Iterator<Name> nameIterator = nameSet.iterator();
          
          Name name;
          while(nameIterator.hasNext()){
        	  name = nameIterator.next();
        	  if(name.equals(cusName)){
        		  matchFound = true;
        		  theCustomerList = cusNameMap.get(name);
        	  }
          }
          
          if (matchFound) {
        	  System.out.println("\n***** Matches Found For: " + cusName + " *****");
          }
          
          for(i = 0; i < theCustomerList.size(); i++){
			  System.out.println(theCustomerList.get(i).getName() + ", " + theCustomerList.get(i).getPhone());
		  }                  
          
          if (matchFound) {
              System.out.println("***** End of Match Query *****\n");
          } else {
              System.out.println("No match found for: " + cusName);
          }
          
          lastNameTxtField.setText("");
          firstNameTxtField.setText("");
      }

      private void printPhoneMatch() {
          PhoneNum phone;
          String areaCodeStr, localNum;
          int areaCode;
          boolean matchFound = false;
          
          areaCodeStr = areaCodeTxtField.getText();
          areaCode = Integer.parseInt(areaCodeStr);
          localNum = localNumTxtField.getText();
          phone = new PhoneNum(areaCode, localNum);
          Customer theCustomer;
          
          Map<PhoneNum, Customer> phoneMap = new HashMap<PhoneNum, Customer>();
          
          for(int j = 0; j < cusList.size(); j++){
        	  phoneMap.put((cusList.get(j)).getPhone(), (cusList.get(j)));
          }
          
          Set<PhoneNum> phoneNumSet = phoneMap.keySet();
          Iterator<PhoneNum> phoneIterator = phoneNumSet.iterator();
          
          PhoneNum phoneNo;
          while(phoneIterator.hasNext()){
        	  phoneNo = phoneIterator.next();
        	  if(phoneNo != null){
        		  if(phone.equals(phoneNo)){
        			  theCustomer = phoneMap.get(phoneNo);
        			  System.out.println("Match Found: " + theCustomer);
                      matchFound = true;
                      break;
        		  }
        	  }
          }
          
          if (!matchFound) {
              System.out.println("No customer found with phone number: " + phone);
          } else {
              areaCodeTxtField.setText("");
              localNumTxtField.setText("");
          }
      }

      public void actionPerformed(ActionEvent evt) {
          JButton sourceBtn;

          sourceBtn = (JButton) evt.getSource();
          if (sourceBtn == phoneSearchBtn) {
              printPhoneMatch();
          } else if (sourceBtn == nameSearchBtn) {
              printNameMatch();
          }
      }
}

