package com.dictionarypracticeREST.exceptions;

public class DictionaryException  extends  Exception{

    public DictionaryException() {
    }

    public DictionaryException(String message) {
        super(message);
    }

    public DictionaryException(String message, Throwable cause) {
        super(message, cause);
    }

    public DictionaryException(Throwable cause) {
        super(cause);
    }

    public DictionaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
