//package Refactor;
//
//import Refactor.Machine.Machine;
//import Refactor.Machine.Robot;
//
//import java.io.IOException;
//import java.io.Writer;
//import java.util.Iterator;
//import java.util.List;
//
//public class ReportRefactor {
//    public static void report(Writer out, List machines, Robot robot)
//            throws IOException
//    {
//        reportHeader(out);
//        reportMachines(out, machines);
//        reportRobot(out, robot);
//        reportFooter(out);
//    }
//
//    public static void reportHeader(Writer out) throws IOException {
//        out.write("FACTORY REPORT\n");
//    }
//
//    public static void reportMachines(Writer out, List machines) throws IOException {
//        Iterator line = machines.iterator();
//        while (line.hasNext()) {
//            Machine machine = (Machine) line.next();
//            out.write("Machine " + machine.name());
//            if (machine.bin() != null)
//                out.write(" bin=" + machine.bin());
//            out.write("\n");
//        }
//        out.write("\n");
//        out.write("Robot");
//    }
//
//    public static void reportRobot(Writer out, Robot robot) throws IOException {
//        if (robot.location() != null)
//            out.write(" location=" + robot.location().name());
//        if (robot.bin() != null)
//            out.write(" bin=" + robot.bin());
//        out.write("\n");
//    }
//
//    public static void reportFooter(Writer out) throws IOException {
//        out.write("========\n");
//    }
//}
