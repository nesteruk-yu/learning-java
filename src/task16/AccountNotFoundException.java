package task16;

//3. Создать своё непроверяемое исключение AccountNotFoundException. В этом классе добавьте поле String errorCode, переопределите гетеры и сетеры.

public class AccountNotFoundException extends Exception {

    String errorCode;

    public AccountNotFoundException(String message) {
        super(message);
        this.errorCode = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
