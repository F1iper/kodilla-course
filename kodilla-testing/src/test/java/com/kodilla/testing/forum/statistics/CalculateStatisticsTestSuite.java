package com.kodilla.testing.forum.statistics;

import org.graalvm.compiler.lir.phases.EconomyAllocationStage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    @Test
    public void testWhenPostCountEquals0() {
        //Given
        Statistics calculateMock = mock(Statistics.class);
        CalculateStatistics underTest = new CalculateStatistics();

        //When
        underTest.calculateAdvStatistics(calculateMock);

        //Then
        Assert.assertEquals(0, underTest.getUserCount());
        Assert.assertEquals(0, underTest.getPostCount());
        Assert.assertEquals(0, underTest.getCommentCount());
        Assert.assertEquals(0, underTest.getPostsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentePerPost(), 0.001);
    }

    @Test
    public void testWhenPostCountEquals1000() {
        //Given
        Statistics calculateMock = mock(Statistics.class);
        CalculateStatistics underTest = new CalculateStatistics();
        underTest.setPostCount(1000);

        //When
        underTest.calculateAdvStatistics(calculateMock);

        //Then
        Assert.assertEquals(0, underTest.getUserCount());
        Assert.assertEquals(1000, underTest.getPostCount());
        Assert.assertEquals(0, underTest.getCommentCount());
        Assert.assertEquals(0, underTest.getPostsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentePerPost(), 0.001);
    }

    @Test
    public void testWhenUsersCountEquals0() {
        //Given
        Statistics calculateMock = mock(Statistics.class);
        CalculateStatistics underTest = new CalculateStatistics();
        List<String> names = new ArrayList<>();

        //When
        underTest.calculateAdvStatistics(calculateMock);
        when(calculateMock.usersNames()).thenReturn(names);

        //Then
        Assert.assertEquals(0, underTest.getUserCount());
        Assert.assertEquals(0, underTest.getPostCount());
        Assert.assertEquals(0, underTest.getCommentCount());
        Assert.assertEquals(0, underTest.getPostsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentePerPost(), 0.001);
    }

    @Test
    public void testWhenUsersCountEquals100() {
        //Given
        Statistics calculateMock = mock(Statistics.class);
        CalculateStatistics underTest = new CalculateStatistics();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("name" + i);
        }

        //When
        when(calculateMock.usersNames()).thenReturn(names);
        underTest.calculateAdvStatistics(calculateMock);

        //Then
        Assert.assertEquals(100, underTest.getUserCount());
        Assert.assertEquals(0, underTest.getPostCount());
        Assert.assertEquals(0, underTest.getCommentCount());
        Assert.assertEquals(0, underTest.getPostsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentePerPost(), 0.001);
    }

    @Test
    public void testWhenCommentsCountEquals0() {
        //Given
        Statistics calculateMock = mock(Statistics.class);
        CalculateStatistics underTest = new CalculateStatistics();

        //When
        underTest.calculateAdvStatistics(calculateMock);

        //Then
        Assert.assertEquals(0, underTest.getUserCount());
        Assert.assertEquals(0, underTest.getPostCount());
        Assert.assertEquals(0, underTest.getCommentCount());
        Assert.assertEquals(0, underTest.getPostsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentePerPost(), 0.001);
    }

    @Test
    public void testWhenMoreCommentsThenPosts() {
        //Given
        Statistics calculateMock = mock(Statistics.class);
        CalculateStatistics underTest = new CalculateStatistics();
        underTest.setPostCount(100);
        underTest.setCommentCount(1000);

        //When
        underTest.calculateAdvStatistics(calculateMock);

        //Then
        Assert.assertEquals(0, underTest.getUserCount());
        Assert.assertEquals(100, underTest.getPostCount());
        Assert.assertEquals(1000, underTest.getCommentCount());
        Assert.assertEquals(0, underTest.getPostsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentsPerUser(), 0.001);
        Assert.assertEquals(10, underTest.getCommentePerPost(), 0.001);
    }

    @Test
    public void testWhenMorePostsThenComments() {
        //Given
        Statistics calculateMock = mock(Statistics.class);
        CalculateStatistics underTest = new CalculateStatistics();
        underTest.setCommentCount(150);
        underTest.setPostCount(1000);

        //When
        underTest.calculateAdvStatistics(calculateMock);

        //Then
        Assert.assertEquals(0, underTest.getUserCount());
        Assert.assertEquals(1000, underTest.getPostCount());
        Assert.assertEquals(150, underTest.getCommentCount());
        Assert.assertEquals(0, underTest.getPostsPerUser(), 0.001);
        Assert.assertEquals(0, underTest.getCommentsPerUser(), 0.001);
        Assert.assertEquals(0.15, underTest.getCommentePerPost(), 0.001);
    }

    @Test
    public void testFelipe() {
        //Given
        Statistics calculateMock = mock(Statistics.class);
        CalculateStatistics underTest = new CalculateStatistics();
        underTest.setCommentCount(200);
        underTest.setPostCount(1000);
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("name" + i);
        }

        //When
        when(calculateMock.usersNames()).thenReturn(usersList);
        underTest.calculateAdvStatistics(calculateMock);

        //Then
        Assert.assertEquals(100, underTest.getUserCount());
        Assert.assertEquals(1000, underTest.getPostCount());
        Assert.assertEquals(200, underTest.getCommentCount());
        Assert.assertEquals(10, underTest.getPostsPerUser(), 0.001);
        Assert.assertEquals(2, underTest.getCommentsPerUser(), 0.001);
        Assert.assertEquals(0.2, underTest.getCommentePerPost(), 0.001);
    }
}