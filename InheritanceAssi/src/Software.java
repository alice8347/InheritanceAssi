public class Software extends Product
{
    private String version;

    public Software()
    {
        super();
        count++;
    }

    public void setVersion(String version) {
    	this.version = version;
    }
    
    public String getVersion()
    {
        return version;
    }

    public String toString(String detail)
    {
    	boolean isValid = false;
        String message = "";
        while (isValid == false) {
        	if (detail.equalsIgnoreCase("detail")) {
        		isValid = true;
        		message = super.toString() + "Version:     " +
	        			version + "\n";
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