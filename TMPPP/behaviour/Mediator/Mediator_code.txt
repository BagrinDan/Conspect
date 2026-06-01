@Getter
public class User {
    private String name;
    private final MediatorService mediatorService;

    public User(String name, MediatorService mediatorService){
        this.name = name;
        this.mediatorService = mediatorService;
    }

    public void sendMessage(User source, String message, User destination){
        this.mediatorService.send(source, message, destination);
    }
}


    public static void main(String[] args) {
        MediatorService mediatorService = new MediatorServiceImpl();

        User user1 = new User("Andrei", mediatorService);
        User user2 = new User("Ivan", mediatorService);


        user1.sendMessage(user1, "Abobus", user2);
    }