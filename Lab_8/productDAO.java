/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_8;

import java.io.Serializable;

/**
 *
 * @author ToanNM_PC09504
 */
public class productDAO extends Dao<Product>{

    @Override
    public void update(Product entity) {
        for(int i =0;i<list.size();i++){
            if(list.get(i).name.equalsIgnoreCase(entity.name)){
                list.set(i,entity);
            }
        }
    }

    @Override
    public Product find(Serializable id) {
        for(Product p :list){
            if(p.name.equals(id)){
                return p;
            }
        }
        return null;
    }
}
