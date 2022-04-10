package frontend;

import interfaces.FeInterfaces;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import utilities.MenulerCom;


public class AnaPencereFe extends JFrame implements FeInterfaces{

    public AnaPencereFe (){
        initPencere();
    }
    
    @Override
    public void initPencere() {
       // JTabbedPane tabs = initTabs();
        JMenuBar bar  = MenulerCom.initBar();
        
       // add(tabs);
        setJMenuBar(bar);
        
        setTitle("Satış ve Stoko Programı");
        setSize(600, 250);
        setVisible(true);           /* bu pencere açılsın diyoruz*/
        setLocationRelativeTo(null);   /* penceremizi oluşturduğumuzda ortada durmasını sağlıyoruz..*/
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public JPanel initPanel() {
        JPanel panel = new JPanel();
        
        return panel;
    }

    @Override
    public JTabbedPane initTabs() {
        return null;
    }

    @Override
    public JMenuBar initBar() {
    return null;
    }
    
    
}
