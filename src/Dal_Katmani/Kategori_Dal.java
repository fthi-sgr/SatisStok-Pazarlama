package Dal_Katmani;

import Core_Katmani.ObjectHelper;
import contract.KategoriContract;
import interfaces.DALInterfaces;
import java.util.List;


public class Kategori_Dal<KategoriContract> extends ObjectHelper implements DALInterfaces<KategoriContract>{

    @Override
    public void Insert(KategoriContract entity) {
    }

    @Override
    public List<KategoriContract> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
