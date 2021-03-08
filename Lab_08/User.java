package Lab_08;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private double income;

    public User(){
        super();
    }

    public double getIncome() {
        return this.income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) throws UserDataException {
        if(password.length() < 6)
            throw new UserDataException("The password is too short");
        
        if(password.length() > 50)
            throw new UserDataException("The password is too long");

        if(!password.matches("[a-z]+") || !password.matches("[A+Z]+") || !password.matches("[0+9]!"))
            throw new UserDataException("The password must have at least one small letter," 
                            + " one capital letter, and one numbner");
       
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) throws UserDataException {
        if (!email.contains("@") || !email.contains("."))
            throw new UserDataException("Invalid email address");

        if (email.length() < 5)
            throw new UserDataException("The email is too short");
            
        if(email.length() > 50)
            throw new UserDataException("The email is too long");

        this.email = email;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) throws UserDataException {
        if(lastName.length() < 1)
            throw new UserDataException("The last name is too short");

        if(lastName.length() > 50)
            throw new UserDataException("The last name is too long");  
        this.lastName = lastName;
    }

    public String getFirstName(){
  
        return this.firstName;
    }

    public void setFirstName(String firstName) throws UserDataException {
        if(firstName.length() < 1)
            throw new UserDataException("The first name is too short");

        if(firstName.length() > 50)
            throw new UserDataException("The first name is too long");  

        this.firstName = firstName;
    }
    
}
