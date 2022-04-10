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
        JTabbedPane tabs = initTabs();
        JMenuBar bar  = initBar();
        
       // add(tabs);
        setJMenuBar(bar);
        
        setTitle("Satış ve Stok Programı");
        setSize(600,250);
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
    public JMenuBar initBar() {
        JMenuBar bar =MenulerCom.initBar();
        
        
        return bar;
    }

    @Override
    public JTabbedPane initTabs() {
        return null;
    }

    
    
    
}
