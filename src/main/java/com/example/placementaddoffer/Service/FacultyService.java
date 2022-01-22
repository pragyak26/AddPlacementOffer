package com.example.placementaddoffer.Service;

import com.example.placementaddoffer.bean.Faculty;
import com.example.placementaddoffer.DAO.FacultyDao;
import com.example.placementaddoffer.DAO.Implementation.FacultyDaoImpl;

public class FacultyService {
    FacultyDao facultyDao = new FacultyDaoImpl();
    public Integer verifyFaculty(Faculty faculty){
        return  facultyDao.verifyFaculty(faculty);
    }
}