package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("toDoTask #1");
        board.getToDoList().getTasks().add("toDoTask #2");
        board.getInProgressList().getTasks().add("inProgressTask #1");
        board.getDoneList().getTasks().add("done #1");

        //Then
        Assert.assertEquals("toDoTask #1", board.getToDoList().getTasks().get(0));
        Assert.assertEquals(2, board.getToDoList().getTasks().size());
        Assert.assertEquals("inProgressTask #1", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertEquals("done #1", board.getDoneList().getTasks().get(0));
        Assert.assertEquals(1, board.getDoneList().getTasks().size());

        board.getToDoList().getTasks()
                .forEach(System.out::println);

    }
}