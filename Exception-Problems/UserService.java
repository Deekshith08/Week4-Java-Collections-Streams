import java.util.*;
class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException(String message){
        super(message);
    }
}
class UserNotFoundException extends Exception{
    public UserNotFoundException(String message){
        super(message);
    }
}
public class UserService {
    List<String> users = new ArrayList<>();
    public void registerUser(String username) throws UserAlreadyExistsException{
        if(users.contains(username))  throw new UserAlreadyExistsException("Error : User Already Exists");
        users.add(username);
        System.out.println("User registered");
    }
    public void checkUserExistence(String username) throws UserNotFoundException{
        if(!users.contains(username)) throw new UserNotFoundException("Error : User not found in the list");
        System.out.println("User found");
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        service.users.add("Ram");
        service.users.add("Mishil");
        try {
            service.registerUser("Ram");
        }
        catch(UserAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        try{
            service.checkUserExistence("Sam");
        }
        catch(UserNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
