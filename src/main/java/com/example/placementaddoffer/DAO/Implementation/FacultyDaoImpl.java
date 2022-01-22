package com.example.placementaddoffer.DAO.Implementation;

import com.example.placementaddoffer.bean.Faculty;
import com.example.placementaddoffer.DAO.FacultyDao;
import com.example.placementaddoffer.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class FacultyDaoImpl implements FacultyDao {


    @Override
    public Integer verifyFaculty(Faculty faculty) {
        Session session = HibernateSessionUtil.getSession();
        try {
            System.out.println("from frontend email : "+faculty.getEmail());
            System.out.println("from frontend password : "+faculty.getPassword());
            Query query = session.createQuery("from Faculty where email=:email and password=:password");
            query.setParameter("email", faculty.getEmail());
            query.setParameter("password", faculty.getPassword());

            if(query.getResultList().size()==1){
                Faculty faculty1 = (Faculty)query.getResultList().get(0);
                return faculty1.getId();
            }

        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }finally {
            session.close();
        }
        return null;
    }
}