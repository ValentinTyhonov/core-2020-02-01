package com.company.lesson08;

public class DownloadException extends Exception
{
    private int statusCode;

    public DownloadException() {

    }

    public DownloadException(String message) {
        super(message);
    }

    public DownloadException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode()
    {
        return statusCode;
    }
}
