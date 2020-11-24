import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class InterfaceManager extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InterfaceManager() 
	{
		
		//fen�tre de connexion 
		 //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        //Create and set up the window.
        JFrame frame = new JFrame("Chat Session");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Chat");
        frame.getContentPane().add(label);
        
        //Display the window.
        frame.pack();
        //� dynamiser
        frame.setSize(1000,800);
        frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Connexion r�ussie");
    }
	
	public Component createConnexionButton()
	{
		JButton button = new JButton("Connexion");
        button.setMnemonic(KeyEvent.VK_I);
        button.addActionListener(this);
        label.setLabelFor(button);
	}
	

	
	
	
	
    
    	
}