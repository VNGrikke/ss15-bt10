package java_web.service;

import java_web.model.Cv;

import java.util.List;

public interface CvService{
    boolean save(Cv cv);
    boolean update(Cv cv);
    Cv getById(long id);
    boolean delete(long id);
    List<Cv> findAll();
    boolean uniquePhone(String phone);
    boolean uniqueEmail(String email);
    List<Cv> searchByName(String name);
}
