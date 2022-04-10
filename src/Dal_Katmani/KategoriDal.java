package Dal_Katmani;

import Core_Katmani.ObjectHelper;
import com.sun.jdi.connect.spi.Connection;
import contract.KategoriContract;
import interfaces.DALInterfaces;
import java.util.ArrayList;
import java.util.List;


public class KategoriDal<KategoriContract> extends ObjectHelper implements DALInterfaces<KategoriContract>{

    @Override
    public void Insert(KategoriContract entity) {
    }

    @Override
    public List<KategoriContract> GetAll() {
        
        return null;
    }

    @Override
    public KategoriContract Delete(KategoriContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KategoriContract UpdateT(KategoriContract entiy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KategoriContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
