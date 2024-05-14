package BuilderPattern;

public class BuilderMain {
    public static void main(String[] args) {
        User.UserBuilder userBuilder = new User.UserBuilder("Kunwoo", "Kim");
        User user = userBuilder.build();
        System.out.println(user.getFirstName() + " " + user.getLastName());
        System.out.println(user.getAddress());
        user = userBuilder
                .setPhone("010")
                .setAddress("Seoul")
                .build();
        System.out.println(user.getAddress());
        System.out.println(user.getAge());
        System.out.println(user.getPhone());

        System.out.println();
        User.UserBuilder userBuilder2 = new User.UserBuilder("XXX", "YYY");
        User user2 = userBuilder2.build();
        System.out.println(user2.getFirstName() + " " + user.getLastName());
        System.out.println(user2.getAddress());
        user2 = userBuilder
                .setPhone("011")
                .setAddress("Busan")
                .build();
        System.out.println(user2.getAddress());
        System.out.println(user2.getAge());
        System.out.println(user2.getPhone());
    }
}
