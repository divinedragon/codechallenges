package hackerrank.java.oops;

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}

class Sports {

    public String getName() {
        return "Generic Sports";
    }

    public void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    public String getName() {
        return "Soccer Class";
    }

    public void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}