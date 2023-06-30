/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;



    
    import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.sql.*;



public class UpdateEmployee extends JFrame implements ActionListener{
    
    
    JButton add, back;
    JTextField tfeducation, tfname,tffname, tfadhaar,tfphone,tfaddress,tfemail,tfsalary,tfdesignation;
     JLabel lblempId;
     String empId;

    UpdateEmployee(String empId) {
        this.empId = empId;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Upadte Employee Details");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);
        
        //Name
        
        JLabel lablename = new JLabel("Name");
        lablename.setBounds(50,150,150,30);
        lablename.setFont(new Font("serif",Font.PLAIN,20));
        add(lablename);
        
         JLabel lblname = new JLabel();
        lblname.setBounds(200,150,150,30);
        add(lblname);
        
        //fathers name
         
        JLabel lablefname = new JLabel("Father's Name");
        lablefname.setBounds(400,150,150,30);
        lablefname.setFont(new Font("serif",Font.PLAIN,20));
        add(lablefname);
        
        JLabel lblfname = new JLabel();
        lblfname.setBounds(600,150,150,30);
        add(lblfname);
        
        
        //Date of birth
        
         JLabel labledob = new JLabel("Date Of Birth");
        labledob.setBounds(50,200,150,30);
        labledob.setFont(new Font("serif",Font.PLAIN,20));
        add(labledob);
        
         JLabel lbldob =new  JLabel();
        lbldob.setBounds(200,200,150,30);
        add(lbldob);
        
        
        //salary
        
         JLabel lablesalary = new JLabel("Salary");
        lablesalary.setBounds(400,200,150,30);
        lablesalary.setFont(new Font("serif",Font.PLAIN,20));
        add(lablesalary);
        
         tfsalary = new JTextField();
        tfsalary.setBounds(600,200,150,30);
        add(tfsalary);
        
        
        
         JLabel lableaddress = new JLabel("Address");
        lableaddress.setBounds(50,250,150,30);
        lableaddress.setFont(new Font("serif",Font.PLAIN,20));
        add(lableaddress);
        
         tfaddress = new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);
        
        //phone
        
         JLabel lablephone = new JLabel("Phone");
        lablephone.setBounds(400,250,150,30);
        lablephone.setFont(new Font("serif",Font.PLAIN,20));
        add(lablephone);
        
         tfphone = new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);
        
        
        //email
        
         JLabel lableemail = new JLabel("Email");
        lableemail.setBounds(50,300,150,30);
        lableemail.setFont(new Font("serif",Font.PLAIN,20));
        add(lableemail);
        
         tfemail = new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        //highest Education
        
        
         JLabel lableeducation = new JLabel("Highest Education");
        lableeducation.setBounds(400,300,150,30);
        lableeducation.setFont(new Font("serif",Font.PLAIN,20));
        add(lableeducation);
        
        tfeducation = new JTextField();
        tfeducation.setBounds(600,300,150,30);
        add(tfeducation);
        
        
        
          JLabel labledesignation = new JLabel("Designation");
        labledesignation.setBounds(50,350,150,30);
        labledesignation.setFont(new Font("serif",Font.PLAIN,20));
        add(labledesignation);
        
       tfdesignation = new JTextField();
        tfdesignation.setBounds(200,350,150,30);
        add(tfdesignation);
        
        //Adhaar
        
         JLabel lableadhaar = new JLabel("Adhaar Number");
        lableadhaar.setBounds(400,350,150,30);
        lableadhaar.setFont(new Font("serif",Font.PLAIN,20));
        add(lableadhaar);
        
         JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(600,350,150,30);
        add(lblaadhar);
        
        
        
         JLabel lableempId = new JLabel("Employee Id");
        lableempId.setBounds(50,400,150,30);
        lableempId.setFont(new Font("serif",Font.PLAIN,20));
        add(lableempId);
      
         lblempId = new JLabel();
        lblempId.setBounds(200,400,150,30);
        lblempId.setFont(new Font("serif",Font.PLAIN,20));
        add(lblempId);
        
        
        try {
            Conn c = new Conn();
            String query = "select * from employee where empId = '"+empId+"'";
         ResultSet rs =   c.s.executeQuery(query);
         while(rs.next()){
             lblname.setText(rs.getString("name"));
             lbldob.setText(rs.getString("dob"));
             lblfname.setText(rs.getString("fname"));
             lblaadhar.setText(rs.getString("aadhar"));
             lblempId.setText(rs.getString("empId"));
            tfaddress.setText(rs.getString("address"));
             tfsalary.setText(rs.getString("salary"));
             tfphone.setText(rs.getString("phone"));
             tfemail.setText(rs.getString("email"));
             tfeducation.setText(rs.getString("dob"));
             tfdesignation.setText(rs.getString("designation"));
         }
                   
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      
        
         add = new JButton("Update Details");
        add.setBounds(250,550,150,40);
        add.addActionListener(this);
       add.setBackground(Color.BLACK);
       add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(450,550,150,40);
        back.addActionListener(this);
         back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
        add(back);
        
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource()== add) {
            String salary =tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();
           
            
            
            try {
                Conn conn = new Conn();
                String query = " update  employee set salary = '"+salary+"',address ='"+address+"',phone = '"+phone+"',email ='"+email+"',education = '"+education+"',designation ='"+designation+"' where empId = '"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details Updated Successfully");
                setVisible(false);
                new Home();
                     
               
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
            new Home();
            
        }
        
    }
    
    
    public static void main(String[] args) {
        new UpdateEmployee("");
        
    }
}

    

