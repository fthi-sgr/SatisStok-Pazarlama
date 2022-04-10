package interfaces;

import java.util.List;

public interface DALInterfaces <T>{
    
    public void Insert (T entity);
    public List <T> GetAll();
    public T Delete(T entity);
    public T UpdateT (T entiy);
    public List <T> GetById(int id );
     

    
    
    
}
