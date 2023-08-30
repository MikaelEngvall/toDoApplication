package se.lexicon.TodoIT_assignment;

import se.lexicon.TodoIT_assignment.model.AppRole;
import se.lexicon.TodoIT_assignment.model.AppUser;
import se.lexicon.TodoIT_assignment.model.TodoItem;
import se.lexicon.TodoIT_assignment.model.Person;

import java.time.LocalDate;

public class TodoITAssignmentApplication {
    public static void main(String[] args) {

        // Part 1
        AppUser appUser = new AppUser("mien2023", "12345678", AppRole.ROLE_APP_ADMIN);
        Person person1 = new Person(1, "Anders", "Loren", "a.l@gmail.com", appUser);
//        Person person2 = new Person(1, "Mikael", "Engvall", "m.e@gmail.com");
//        System.out.println(person1.getSummary());
        TodoItem task1 = new TodoItem(1, "Change tires", "Replace winter tires with summer tires",
                LocalDate.of(2023, 8, 31), false, person1);
//        System.out.println(task1.getSummary());
//        System.out.println((task1.isOverdue()) ? "Should have been done by now" : "Still got some time");
//        TodoItemTask itemTask1 = new TodoItemTask(1, true, task1, person2);
//        System.out.println(itemTask1.getSummary());

        System.out.println(appUser.toString());
        System.out.println(person1.toString());














//        List<Person> personList = List.of(person1, person2);
//
//        String test = personList.stream()
//                .map(per -> person1.getFirstName())
//                .filter(per -> !per.isEmpty())
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("nope"));
//        System.out.println(test);
    }
}
