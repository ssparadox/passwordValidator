package knu.ac.kr.passwordvalidator;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void 미니멈랭쓰가_지정값보다크면_테스트_성공() {
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        boolean result = passwordValidator.validate(testPassword);
        assertTrue(result);
    }

    @Test
    public void 맥스랭쓰가_지정값보다작으면_테스트_성공() {
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        boolean result = passwordValidator.validate(testPassword);
        assertTrue(result);
    }

    @Test
    public void 맥스랭쓰가_지정값보다크면_테스트_실패() {
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        boolean result = passwordValidator.validate(testPassword);
        assertFalse(result);
    }

    @Test
    public void 패스워드가_NULL이면_테스트_실패() {
        String testPassword = null;
        PasswordValidator passwordValidator = new PasswordValidator(-1, 4);
        boolean result = passwordValidator.validate(testPassword);
        assertFalse(result);
    }

    @Test
    public void 패스워드가_앰티스트링이면_테스트_실패() {
        String testPassword = "";
        PasswordValidator passwordValidator = new PasswordValidator(-1, 4);
        boolean result = passwordValidator.validate(testPassword);
        assertFalse(result);
    }

    @Test
    public void 패스워드가_ADMIN이면_무조건_테스트_성공() {
        String testPassword = "ADMIN";
        PasswordValidator passwordValidator = new PasswordValidator(10, 15);
        boolean result = passwordValidator.validate(testPassword);
        assertTrue(result);
    }

}
