/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ToanNM_PC09504
 * @param <Entity>
 */
public abstract class Dao<Entity> {

    protected ArrayList<Entity> list = new ArrayList<>();

    public void add(Entity entity) {
        list.add(entity);
    }

    public void remove(Entity entity) {
        list.remove(entity);
    }

    abstract public void update(Entity entity);

    abstract public Entity find(Serializable id);

    public ArrayList<Entity> getList() {
        return list;
    }

    public void store(String path) {
        try {
            try (FileInputStream fis = new FileInputStream(path);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                list = (ArrayList<Entity>) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void load(String path) {
        try {
            try (FileOutputStream fos = new FileOutputStream(path);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(oos);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
