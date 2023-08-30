package se.lexicon.TodoIT_assignment;

import org.junit.Test;
import se.lexicon.TodoIT_assignment.model.AppRole;
import se.lexicon.TodoIT_assignment.model.AppUser;

import static org.junit.Assert.assertEquals;

public class AppUserTest {
    @Test
    public void testCreateAppUser() {
        AppUser appUser = new AppUser("mien2023", "12345678", AppRole.ROLE_APP_ADMIN);
        assertEquals("mien2023", appUser.getUsername());
        assertEquals(AppRole.ROLE_APP_ADMIN, appUser.getRole());
    }

    @Test
    public void testToString() {
        AppUser appUser = new AppUser("mien2023", "12345678", AppRole.ROLE_APP_ADMIN);
        String expectedToString = "AppUser{username='mien2023', role=ROLE_APP_ADMIN}";
        assertEquals(expectedToString, appUser.toString());
    }
}
