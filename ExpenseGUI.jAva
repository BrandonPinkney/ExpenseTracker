import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.FutureTask;

import javax.imageio.ImageIO;
import javax.swing.*;


public class ExpenseGUI extends JFrame implements ActionListener{

    private JTextField descriptionTextField;
    private JTextField monthTextField;
    private JTextField amountTextField;
    private JTextField nameTextField;
    // create constructor 
    public ExpenseGUI(){
        // setup gui and add a title
        super("Expense App");

        // configure gui to end the program's process once its closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // set the size of our gui (in pixels)
        setSize(450,650);

        // load our gui at the center of the screen 
        setLocationRelativeTo(null);

        // make our layout manager null to manually position components within the gui
       // setLayout(null);

        // prevent any resize of our gui
        setResizable(false);

        addGuiComponents();
        
    }

    public void addGuiComponents(){
         
        // create labels
        JPanel panel = new JPanel(new FlowLayout());
        JLabel amountLabel = new JLabel("Amount");
        JLabel monthLabel = new JLabel("Month");
        JLabel descriptionLabel = new JLabel("Description");
        JLabel nameLabel = new JLabel("Name");

        // create textFields
         descriptionTextField = new JTextField(14);
        monthTextField = new JTextField(10);
         amountTextField = new JTextField(10);

        // create object for actionListener
         ExpenseGUI action = new ExpenseGUI();

        // add and remove buttons 
        JButton b = new JButton("Add");
        JButton b1 = new JButton("Remove");

        // add actionListeners
       b.addActionListener(action);
         b1.addActionListener(action);

// add labels and textfield to panel
        panel.add(amountLabel);
        panel.add(amountTextField);

        panel.add(descriptionLabel);
        panel.add(descriptionTextField);

        panel.add(monthLabel);
        panel.add(monthTextField);

        // set the location and size of our component
        panel.setBounds(50,50,300,150);
        
        // add panel to the frame
        add(panel);

        // pack and display the frame
        pack();
        setVisible(true);


    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        String description = descriptionTextField.getText(); 
        String month = monthTextField.getText();
        double amount = Double.parseDouble(amountTextField.getText());
        String name = nameTextField.getText();

        Expense newExpense = new Expense(month, amount, name, description);

        FinanceManager financeManager = new FinanceManager();

        String s = e.getActionCommand();
        if(s.equals("Add")){
            financeManager.addExpense(newExpense);
        }
        if(s.equals("Remove")){
            financeManager.removeExpense(newExpense);
        }
    }


    
}