package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice1 = new Invoice("0001/2020");

        Product p1 = new Product("Motherboard");
        Product p2 = new Product("Ram");

        Item i1 = new Item(p1, new BigDecimal(450), 1, new BigDecimal(450));
        Item i2 = new Item(p2, new BigDecimal(230), 2, new BigDecimal(460));

        invoice1.getItems().add(i1);
        invoice1.getItems().add(i2);

        //When
        productDao.save(p1);
        int motherboardId = p1.getId();
        productDao.save(p2);
        int memoryId = p2.getId();
        itemDao.save(i1);
        int item1Id = i1.getId();
        itemDao.save(i2);
        int item2Id = i2.getId();
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();


        //Then
        Assert.assertNotEquals(0,invoice1Id);
        Assert.assertNotEquals(0,item1Id);
        Assert.assertNotEquals(0,item2Id);
        Assert.assertNotEquals(0,motherboardId);
        Assert.assertNotEquals(0,memoryId);


        //CleanUp
        itemDao.deleteById(item1Id);
        itemDao.deleteById(item2Id);
        productDao.deleteById(memoryId);
        productDao.deleteById(motherboardId);
        invoiceDao.deleteById(invoice1Id);

    }
}