package Dal_Katmani;

import Core_Katmani.ObjectHelper;
import java.sql.Connection;
import types.UrunlerContract;
import interfaces.DALInterfaces;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Urunler_Dal extends ObjectHelper implements DALInterfaces<UrunlerContract> {

    @Override
    public void Insert(UrunlerContract entity) {
        Connection connection = (Connection) getConnection();
        try {
            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO Urunler (id,adi, kategoriId,fiyat,tarih) VALUES(" +entity.getId()+","+entity.getAdi()+","+entity.getKategoriId()+","+entity.getFiyat()+","+entity.getFiyat()+" ");
            statement.close();
            connection.close();
        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    @Override
    public List<UrunlerContract> GetAll() {
         throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public UrunlerContract Delete(UrunlerContract entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UrunlerContract UpdateT(UrunlerContract entiy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UrunlerContract> GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
