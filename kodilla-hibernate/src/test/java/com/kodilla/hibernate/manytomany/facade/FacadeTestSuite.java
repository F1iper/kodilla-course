package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testFindEmployeeByPartOfName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //When
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();

        List<Employee> employees = facade.processFindEmployeeByPartOfName("%lind%");

        //Then
        assertEquals(1, employees.size());

        //Cleanup
        employeeDao.deleteById(johnSmithId);
        employeeDao.deleteById(stephanieClarcksonId);
        employeeDao.deleteById(lindaKovalskyId);
    }

    @Test
    public void testFindCompanyByPartOfName() {
        //Given
        Company cocaCola = new Company("coca cola");
        Company mcDonald = new Company("McDonald");
        Company coolService = new Company("coolService");

        //When
        companyDao.save(cocaCola);
        int cocaColaId = cocaCola.getId();
        companyDao.save(mcDonald);
        int mcDonaldId = mcDonald.getId();
        companyDao.save(coolService);
        int coolServiceId = coolService.getId();

        List<Company> companies = facade.processFindCompanyByPartOfName("%co%");

        //Then
        assertEquals(2, companies.size());

        //Cleanup
        companyDao.deleteById(cocaColaId);
        companyDao.deleteById(mcDonaldId);
        companyDao.deleteById(coolServiceId);
    }
}


