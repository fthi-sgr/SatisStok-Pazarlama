package Dal_Katmani;

import Core_Katmani.ObjectHelper;
import interfaces.DALInterfaces;
import java.util.List;


public class Account_Dal<AccountsContract> extends ObjectHelper implements DALInterfaces<AccountsContract>{//Bir interface ile bütün dal katmanını yürütüyoruz..

    @Override
    public void Insert(AccountsContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AccountsContract> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccountsContract Delete(AccountsContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccountsContract UpdateT(AccountsContract entiy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AccountsContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
