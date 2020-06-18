package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.NotNull;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrievebyLastname() {
        //Given
        Employee e1 = new Employee("Megan", "Markle");
        Employee e2 = new Employee("Stephen", "King");
        Employee e3 = new Employee("Meggie", "Kinguin");

        employeeDao.save(e1);
        employeeDao.save(e2);
        employeeDao.save(e3);

        //When
        List<Employee> retrievedLastname = employeeDao.retrieveByLastname("Kinguin");

        //Then
        Assert.assertNotEquals(0,retrievedLastname.size());
    }

    @Test
    public void retrieveByFirstThreeLettersOfCompanyName() {
        //Given
        Company c1 = new Company("Honda");
        Company c2 = new Company("Wolksvagen");
        Company c3 = new Company("Kingston");
        Company c4 = new Company("Honolulu");

        companyDao.save(c1);
        @NotNull int id1 = c1.getId();
        @NotNull int id2 = c2.getId();
        @NotNull int id3 = c3.getId();
        @NotNull int id4 = c4.getId();
        companyDao.save(c2);
        companyDao.save(c3);
        companyDao.save(c4);

        //When
        List<Company> retrievedCompanies = companyDao.retrieveByFirstThreeLettersOfCompanyName("Hon");

        //Then
        Assert.assertNotEquals(0, retrievedCompanies.size());

    }

    @Test
    public void testRetrieveByFirstname() {
        //Given
        Employee e1 = new Employee("Megan", "Markle");
        Employee e2 = new Employee("Stephen", "King");
        Employee e3 = new Employee("Meggie", "Kinguin");

        employeeDao.save(e1);
        @NotNull int id1 = e1.getId();
        employeeDao.save(e2);
        @NotNull int id2 = e2.getId();
        employeeDao.save(e3);
        @NotNull int id3 = e3.getId();

        //When
        List<Employee> retrieveByFirstname = employeeDao.retrieveByFirstname("Megan");

        //Then
        Assert.assertNotEquals(0, retrieveByFirstname.size());

    }
}