public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String message, String name) {

        super("Игрок с именем " + name + "не найден");
    }

    public NotRegisteredException(String playerName1) {
    }
}