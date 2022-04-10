package utilities;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public  class MenulerCom {
      
    
    public static JMenuBar initBar() {
        JMenuBar bar = new JMenuBar();
        JMenu dosyaMenu = new JMenu("Dosya") ;
        bar.add(dosyaMenu);
        
        JMenuItem cikisItem  = new JMenuItem("Çıkış");
        dosyaMenu.add(cikisItem);
        
        JMenu urunlerMenu = new JMenu("Ürünler ");
        bar.add(urunlerMenu);
        
        JMenuItem urunekleItem = new JMenuItem("Ürün Ekle");
        urunlerMenu.add(urunekleItem);
        
        JMenuItem kategoriEkleItem = new JMenuItem("Kategori Ekle");
        urunlerMenu.add(kategoriEkleItem);
        urunlerMenu.addSeparator();
        
        JMenuItem urunDuzenleItem = new JMenuItem("Ürünü Düzenle");
        urunlerMenu.add(urunDuzenleItem);
        
        JMenuItem kategoriDuzenleItem = new JMenuItem("Kategori Düzenle");
        urunlerMenu.add(kategoriDuzenleItem);
        
        
        return bar;
        
    }
    
}
