package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("This is going to be beautifull", s -> s.toUpperCase()));
        System.out.println(poemBeautifier.beautify("sEnTeNcE NuMbEr TwO", s -> {
                    String reverse = "";
                    for (int i = s.length() - 1; i >= 0; i--) {
                        reverse += s.charAt(i);
                    }
                    return reverse;
            }));
        System.out.println(poemBeautifier.beautify("sEnTeNcE NuMbEr TwO", s -> "***" + s.substring(0, 8) + "***"));
        System.out.println(poemBeautifier.beautify("an0th3r 3xampl3",
                s-> s.replace("0", "o").replace("3", "e").toUpperCase()));

        Forum forum = new Forum();

        Map<String, ForumUser> theResultUsersMap = forum.getTheUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 2000)
                .filter(forumUser -> forumUser.getPostsCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("Size of result users map: " + theResultUsersMap.size());
        theResultUsersMap.entrySet().stream()
                .map(entry -> entry.getKey() + " | " + entry.getValue())
                .forEach(System.out::println);


    }
}