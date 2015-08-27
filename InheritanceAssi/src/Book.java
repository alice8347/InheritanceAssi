public class Book extends Product
{
    private String author;
    private String detail;

    public Book()
    {
        super();
    	count++;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public String getAuthor() {
    	return author;
    }

    public String toString(String detail)
    {
        boolean isValid = false;
        String message = "";
        while (isValid == false) {
        	if (detail.equalsIgnoreCase("detail")) {
        		isValid = true;
        		message = super.toString() + "Author:      " +
	        			author + "\n";
	        } else if (detail.equalsIgnoreCase("simple")) {
	        	isValid = true;
	        	message = super.toString();
	        } else {
	        	message = "The input is invalid. Please enter \"detail\" or \"simple\"";
	        }
        }
        return message;
    }
}