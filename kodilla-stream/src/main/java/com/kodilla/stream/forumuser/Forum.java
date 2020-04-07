package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum (){
        theUsersList.add(new ForumUser("1001", "John Smith", 127, 1970, 5, 18, 'M'));
        theUsersList.add(new ForumUser("1002", "Natalia Simmon", 214, 1965, 4, 8, 'F'));
        theUsersList.add(new ForumUser("1003", "Neuville Gatsby", 0, 1965, 3, 7, 'M'));
        theUsersList.add(new ForumUser("1004", "Fred Rambo", 91, 1967, 12, 3, 'M'));
        theUsersList.add(new ForumUser("1005", "Liz Taylor", 1, 1977, 11, 1, 'F'));
        theUsersList.add(new ForumUser("1006", "Fernando Alonzo", 1117, 1991, 9, 16, 'M'));
        theUsersList.add(new ForumUser("1007", "Robery Kubica", 456, 1987, 1, 27, 'M'));
        theUsersList.add(new ForumUser("1008", "Maria Sharapova", 0, 1991, 7, 15, 'F'));
        theUsersList.add(new ForumUser("1009", "Wenus Williams", 2, 1981, 5, 7, 'F'));
        theUsersList.add(new ForumUser("1010", "Serene Williams", 54, 1987, 12, 2, 'F'));
    }

    public List<ForumUser> getTheUsersList() {
        return new ArrayList<>(theUsersList);
    }
}
