package bean;

public class Boy {
    String name;
    Girl friend;

    public Boy(Girl friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Girl getFriend() {
        return friend;
    }

    public void setFriend(Girl friend) {
        this.friend = friend;
    }

    public Boy() {
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", friend=" + friend +
                '}';
    }

}
