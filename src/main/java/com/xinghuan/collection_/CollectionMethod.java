package com.xinghuan.collection_;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    ArrayList<Object> list = new ArrayList();
    Object resList;// = new ArrayList();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CollectionMethod collectionMethod = new CollectionMethod();
        collectionMethod.deserialize();
    }
    public Object deserialize() throws IOException, ClassNotFoundException {
        list.add("jack");
        list.add(10);
        list.add(true);
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("mother");
        list1.add(15);
        list.add(list1);

        int name = 13;
        resList = deepCopy(name);
        return resList;
    }
    private Object deepCopy(Object srcList) throws IOException, ClassNotFoundException {
        //序列化
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(srcList);

        //反序列化
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object desList = (Object) ois.readObject();
        return desList;
    }
}
