import javax.swing.JButton;
import javax.swing.JFrame;


public class GuiApp extends JFrame{

	public GuiApp(){
		super("MyGui");
		createGui();
	}
	
	public void createGui()
	{
		JButton button = new JButton("Go!");
		getContentPane().add(button);
		
		setBounds(150, 150, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
