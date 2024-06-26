//package Refactor.Machine;
//
//import junit.framework.TestCase;
//
//import java.util.ArrayList;
//import java.io.StringWriter;
//import java.io.IOException;
//
//public class ReportTest extends TestCase {
//    public ReportTest(String name) {super(name);}
//
//    public void testReport() throws IOException {
//        ArrayList line = new ArrayList();
//        line.add(new Machine("mixer", "left"));
//
//        Machine extruder = new Machine("extruder", "center");
//        extruder.put("paste");
//        line.add(extruder);
//
//        Machine oven = new Machine("oven", "right");
//        oven.put("chips");
//        line.add(oven);
//
//        Robot robot = new Robot();
//        robot.moveTo(extruder);
//        robot.pick();
//
//        StringWriter out = new StringWriter();
//        Report.report(out, line, robot);
//
//        String expected =
//            "FACTORY REPORT\n" +
//            "Refactor.Machine mixer\nRefactor.Machine extruder\n" +
//	    "Refactor.Machine oven bin=chips\n\n" +
//            "Robot location=extruder bin=paste\n" +
//            "========\n";
//
//        assertEquals(expected, out.toString());
//    }
//}
//
