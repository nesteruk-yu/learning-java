package task16;

//4. Создать своё непроверяемое исключение NotEnoughMoneyException. В этом классе добавьте поле String errorCode, переопределите гетеры и сетеры.


public class NotEnoughMoneyException extends Exception {

    String errorCode;

    public NotEnoughMoneyException(String message) {
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
