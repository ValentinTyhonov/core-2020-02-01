package com.company.lesson08;

public class Start
{
    public static void main(String[] args)
    {

        try
        {
            download();
        }
        catch (DownloadException e)
        {
            if (e.getStatusCode() >= 400 && e.getStatusCode() < 500) {
                System.out.println("User input exception");
            } else if (e.getStatusCode() >= 500 && e.getStatusCode() < 600) {
                System.out.println("Server exception");
            }
        }


    }

    private static void download() throws DownloadException {
        throw new DownloadException("Not Found", 404);
    }
}
