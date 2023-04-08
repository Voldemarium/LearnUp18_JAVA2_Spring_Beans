public class User {
    private final String name;
    private final String login;
    private final String address;

    public User(String name, String login, String address) {
        this.name = name;
        this.login = login;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getAddress() {
        return address;
    }
}
