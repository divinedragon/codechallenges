package hackerrank.java.oops;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

public class CalculatingVolume {

    static {
        String input = "2\n1\n4\n4\n67.89\n-98.54";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.get_int_val();
            while (T-- > 0) {
                double volume = 0.0;
                int ch = cal.get_int_val();
                if (ch == 1) {
                    int a = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(a);
                } else if (ch == 2) {
                    int l = cal.get_int_val();
                    int b = cal.get_int_val();
                    int h = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(l, b, h);

                } else if (ch == 3) {
                    double r = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r);

                } else if (ch == 4) {
                    double r = cal.get_double_val();
                    double h = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

class Calculate {

    private static Calculate c;
    public Output output;
    Scanner scan = new Scanner(System.in);

    public Calculate() {
        c = this;
        output = new Output();
    }

    public static Calculate do_calc() {
        return c;
    }

    public double get_volume(int a) {
        return a * a * a * 1.0;
    }

    public double get_volume(int l, int b, int h) {
        return l * b * h * 1.0;
    }

    public double get_volume(double r) {
        return (2 * Math.PI * r * r * r) / 3;
    }

    public double get_volume(double r, double h) {
        return Math.PI * r * r * h;
    }

    public int get_int_val() throws IOException {

        int intValue = scan.nextInt();

        if (intValue <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }

        return intValue;
    }

    public double get_double_val() throws IOException {
        double doubleValue = scan.nextDouble();

        if (doubleValue <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }

        return doubleValue;
    }
}

class Output {
    public void display(double volume) {
        System.out.printf("%.3f\n", volume);
    }
}

class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
