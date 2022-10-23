package ru.skypro.exceptions;

public class DiagnosticFailException extends Exception{
    public DiagnosticFailException() {
        super("программа должна выбросить ошибку.");
    }
}
