package Dal_Katmani;

import Core_Katmani.ObjectHelper;
import java.sql.Connection;
import contract.KategoriContract;
import interfaces.DALInterfaces;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


public class Kategori_Dal extends ObjectHelper implements DALInterfaces<KategoriContract>{

    @Override
    public void Insert(KategoriContract entity) {
        Connection connection=getConnection();
        try{
            Statement statement=connection.createStatement();
            
            statement.executeUpdate("INSERT INTO Kategori (Adi, ParentId) VALUES('"+ entity.getAdi()+"',"+entity.getParentId()+")");
            statement.close();
            connection.close();
        }catch (Exception e){
            
            e.printStackTrace();
            
        }
        
    }

    @Override
    public List<KategoriContract> GetAll() {
        List<KategoriContract> datacontract=new ArrayList<KategoriContract>();
        Connection connection=getConnection();
        KategoriContract contract;
        try{
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery("SELECT * FROM Kategori");
            while(resultSet.next()){
                contract=new KategoriContract();
                contract.setId(resultSet.getInt("Id"));
                contract.setAdi(resultSet.getString("Adi"));
                contract.setParentId(resultSet.getInt("ParentId"));
                
                datacontract.add(contract);
            }
        }catch(Exception e){
            
            e.printStackTrace();
        }
        return datacontract;
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
